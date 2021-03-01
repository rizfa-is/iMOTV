package com.istekno.imotv_movietvshow.ui.detail.tvshow

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.core.app.ShareCompat
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.google.android.material.chip.Chip
import com.istekno.imotv_movietvshow.R
import com.istekno.imotv_movietvshow.data.TVShowEntity
import com.istekno.imotv_movietvshow.databinding.ActivityDetailTvShowBinding
import com.istekno.imotv_movietvshow.ui.base.BaseActivityViewModel

class DetailTvShowActivity : BaseActivityViewModel<ActivityDetailTvShowBinding, DetailTvShowViewModel>() {

    companion object {
        const val EXTRA_TV_SHOW = "extra_tv_show"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        layout = R.layout.activity_detail_tv_show
        vmProvider = ViewModelProvider(this).get(DetailTvShowViewModel::class.java)
        super.onCreate(savedInstanceState)
        binding.tbMain.setNavigationOnClickListener { onBackPressed() }

        val extras = intent.extras
        if (extras != null) {
            val showId = extras.getString(EXTRA_TV_SHOW)

            if (showId != null) {
                viewModel.setShowId(showId)

                val tvShowEntity: TVShowEntity = viewModel.getTVShow()
                populateCourse(tvShowEntity)
                shareInfo(tvShowEntity)
            }
        }
    }

    private fun shareInfo(tvShowEntity: TVShowEntity) {
        binding.btnShare.setOnClickListener {
            val mimeType = "text/plain"
            ShareCompat.IntentBuilder
                .from(this)
                .setType(mimeType)
                .setChooserTitle("Bagikan aplikasi ini sekarang.")
                .setText("==========< The Movie DB >==========\n\nJudul : ${tvShowEntity.title} (${tvShowEntity.year})\n\nDurasi : ${tvShowEntity.duration}\n\nGenre : ${tvShowEntity.genre}\n\nOverview : ${tvShowEntity.overview}" +
                        "\n\nInfo lengkap kunjungi www.themoviedb.org")
                .startChooser()
        }
    }

    @SuppressLint("SetTextI18n")
    private fun populateCourse(tvShowEntity: TVShowEntity) {

        binding.tvTvsTitle.text = "${tvShowEntity.title} (${tvShowEntity.year})"
        binding.tvShowInfo.text = "${tvShowEntity.duration}   |   ${tvShowEntity.rating}"
        binding.tvShowLanguage.text = tvShowEntity.language
        binding.tvShowOverview.text = tvShowEntity.overview

        Glide.with(this)
            .load(tvShowEntity.image)
            .transform(RoundedCorners(20))
            .apply(
                RequestOptions.placeholderOf(R.drawable.ic_loading)
                    .error(R.drawable.ic_error))
            .into(binding.imgShow)

        chipViewInit(tvShowEntity.genre)
    }

    @SuppressLint("UseCompatLoadingForColorStateLists")
    private fun chipViewInit(movies: List<String>) {
        for (element in movies) {
            val chip = Chip(this)

            chip.chipBackgroundColor = resources.getColorStateList(R.color.myTheme_Dark)
            chip.text = element
            chip.setTextColor(resources.getColor(R.color.white))

            binding.cgShowGenre.addView(chip)
        }
    }
}