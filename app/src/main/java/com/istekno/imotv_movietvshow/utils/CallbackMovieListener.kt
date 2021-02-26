package com.istekno.imotv_movietvshow.utils

import com.istekno.imotv_movietvshow.data.MovieEntity

interface CallbackMovieListener {
    fun onClickMovie(movieEntity: MovieEntity)
}