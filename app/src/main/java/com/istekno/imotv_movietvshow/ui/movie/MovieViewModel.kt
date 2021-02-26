package com.istekno.imotv_movietvshow.ui.movie

import androidx.lifecycle.ViewModel
import com.istekno.imotv_movietvshow.data.MovieEntity
import com.istekno.imotv_movietvshow.utils.DataDummy

class MovieViewModel: ViewModel() {

    fun getMovies(): List<MovieEntity> = DataDummy.generateDummyMovie()
}