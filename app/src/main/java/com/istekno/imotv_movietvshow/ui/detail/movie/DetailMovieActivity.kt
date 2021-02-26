package com.istekno.imotv_movietvshow.ui.detail.movie

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.core.app.ShareCompat
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.google.android.material.chip.Chip
import com.istekno.imotv_movietvshow.R
import com.istekno.imotv_movietvshow.data.MovieEntity
import com.istekno.imotv_movietvshow.databinding.ActivityDetailMovieBinding
import com.istekno.imotv_movietvshow.ui.base.BaseActivityViewModel

class DetailMovieActivity : BaseActivityViewModel<ActivityDetailMovieBinding, DetailMovieViewModel>() {

    companion object {
        const val EXTRA_MOVIE = "extra_movie"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        layout = R.layout.activity_detail_movie
        vmProvider = ViewModelProvider(this).get(DetailMovieViewModel::class.java)
        super.onCreate(savedInstanceState)
        binding.tbMain.setNavigationOnClickListener { onBackPressed() }

        val extras = intent.extras
        if (extras != null) {
            val movieId = extras.getString(EXTRA_MOVIE)

            if (movieId != null) {
                viewModel.setMovieId(movieId)
            }

            val movieEntity: MovieEntity = viewModel.getMovie()
            populateCourse(movieEntity)
            shareInfo(movieEntity)
        }
    }

    private fun shareInfo(movieEntity: MovieEntity) {
        binding.btnShare.setOnClickListener {
            val mimeType = "text/plain"
            ShareCompat.IntentBuilder
                .from(this)
                .setType(mimeType)
                .setChooserTitle("Bagikan aplikasi ini sekarang.")
                .setText("==========< The Movie DB >==========\n\nJudul : ${movieEntity.title} (${movieEntity.year})\n\nDurasi : ${movieEntity.duration}\n\nGenre : ${movieEntity.genre}\n\nOverview : ${movieEntity.overview}" +
                        "\n\nInfo lengkap kunjungi www.themoviedb.org")
                .startChooser()
        }
    }

    @SuppressLint("SetTextI18n")
    private fun populateCourse(movieEntity: MovieEntity) {

        binding.tvMovieTitle.text = "${movieEntity.title} (${movieEntity.year})"
        binding.tvMovieInfo.text = "${movieEntity.country}   |   ${movieEntity.duration}   |   ${movieEntity.rating}"
        binding.tvMovieLanguage.text = movieEntity.language
        binding.tvMovieOverview.text = movieEntity.overview

        Glide.with(this)
            .load(movieEntity.image)
            .transform(RoundedCorners(20))
            .apply(
                RequestOptions.placeholderOf(R.drawable.ic_loading)
                    .error(R.drawable.ic_error))
            .into(binding.imgMovie)

        chipViewInit(movieEntity.genre)
    }

    @SuppressLint("UseCompatLoadingForColorStateLists")
    private fun chipViewInit(movies: List<String>) {
        for (element in movies) {
            val chip = Chip(this)

            chip.chipBackgroundColor = resources.getColorStateList(R.color.myTheme_Dark)
            chip.text = element
            chip.setTextColor(resources.getColor(R.color.white))

            binding.cgMovieGenre.addView(chip)
        }
    }
}