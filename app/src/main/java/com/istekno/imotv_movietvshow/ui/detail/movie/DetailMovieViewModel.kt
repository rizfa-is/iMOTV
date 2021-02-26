package com.istekno.imotv_movietvshow.ui.detail.movie

import androidx.lifecycle.ViewModel
import com.istekno.imotv_movietvshow.data.MovieEntity
import com.istekno.imotv_movietvshow.utils.DataDummy

class DetailMovieViewModel: ViewModel() {

    private lateinit var movieId: String

    fun setMovieId(movieId: String) {
        this.movieId = movieId
    }

    fun getMovie(): MovieEntity {
        lateinit var movie: MovieEntity
        val dataMovies = DataDummy.generateDummyMovie()

        for (movieEntity in dataMovies) {
            if (movieEntity.movieId == movieId) {
                movie = movieEntity
            }
        }
        return movie
    }
}