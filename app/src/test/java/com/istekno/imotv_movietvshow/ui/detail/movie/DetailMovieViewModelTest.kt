package com.istekno.imotv_movietvshow.ui.detail.movie

import com.istekno.imotv_movietvshow.utils.DataDummy
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class DetailMovieViewModelTest {

    private lateinit var viewModel: DetailMovieViewModel
    private val dummyMovie = DataDummy.generateDummyMovie()[0]
    private val movieId = dummyMovie.movieId

    @Before
    fun setup() {
        viewModel = DetailMovieViewModel()
        viewModel.setMovieId(movieId)
    }

    @Test
    fun getDetailMovie() {
        viewModel.setMovieId(dummyMovie.movieId)

        val showEntity = viewModel.getMovie()
        assertNotNull(showEntity)
        assertEquals(dummyMovie.movieId, showEntity.movieId)
        assertEquals(dummyMovie.title, showEntity.title)
        assertEquals(dummyMovie.year, showEntity.year)
        assertEquals(dummyMovie.country, showEntity.country)
        assertEquals(dummyMovie.rating, showEntity.rating, 0.0)
        assertEquals(dummyMovie.language, showEntity.language)
        assertEquals(dummyMovie.overview, showEntity.overview)
        assertEquals(dummyMovie.duration, showEntity.duration)
        assertEquals(dummyMovie.genre, showEntity.genre)
        assertEquals(dummyMovie.image, showEntity.image)
    }
}