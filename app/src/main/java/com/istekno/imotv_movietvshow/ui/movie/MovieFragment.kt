package com.istekno.imotv_movietvshow.ui.movie

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.istekno.imotv_movietvshow.R
import com.istekno.imotv_movietvshow.data.MovieEntity
import com.istekno.imotv_movietvshow.databinding.FragmentMovieBinding
import com.istekno.imotv_movietvshow.ui.base.BaseFragmentViewModel
import com.istekno.imotv_movietvshow.ui.detail.movie.DetailMovieActivity
import com.istekno.imotv_movietvshow.utils.CallbackMovieListener

class MovieFragment : BaseFragmentViewModel<FragmentMovieBinding, MovieViewModel>(), CallbackMovieListener {

    companion object {
        const val EXTRA_MOVIE = "extra_movie"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        layout = R.layout.fragment_movie

        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        vmProvider = ViewModelProvider(this).get(MovieViewModel::class.java)
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {
            val movies = viewModel.getMovies()
            val movieAdapter = MovieAdapter(this)

            movieAdapter.setMovies(movies)

            with(binding.rvMovie) {
                layoutManager = GridLayoutManager(context, 2)
                setHasFixedSize(true)
                adapter = movieAdapter
            }
        }
    }

    override fun onClickMovie(movieEntity: MovieEntity) {
        val sendIntent = Intent(context, DetailMovieActivity::class.java)
        sendIntent.putExtra(EXTRA_MOVIE, movieEntity.movieId)
        startActivity(sendIntent)
    }
}