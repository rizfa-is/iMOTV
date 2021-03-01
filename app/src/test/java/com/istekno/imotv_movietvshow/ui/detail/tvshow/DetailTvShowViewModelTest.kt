package com.istekno.imotv_movietvshow.ui.detail.tvshow

import com.istekno.imotv_movietvshow.utils.DataDummy
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class DetailTvShowViewModelTest {

    private lateinit var viewModel: DetailTvShowViewModel
    private val dummyShow = DataDummy.generateDummyTVShow()[0]
    private val tvsId = dummyShow.tvsId

    @Before
    fun setup() {
        viewModel = DetailTvShowViewModel()
        viewModel.setShowId(tvsId)
    }

    @Test
    fun getDetailTVShow() {
        viewModel.setShowId(dummyShow.tvsId)

        val showEntity = viewModel.getTVShow()
        assertNotNull(showEntity)
        assertEquals(dummyShow.tvsId, showEntity.tvsId)
        assertEquals(dummyShow.title, showEntity.title)
        assertEquals(dummyShow.year, showEntity.year)
        assertEquals(dummyShow.rating, showEntity.rating, 0.0)
        assertEquals(dummyShow.language, showEntity.language)
        assertEquals(dummyShow.overview, showEntity.overview)
        assertEquals(dummyShow.duration, showEntity.duration)
        assertEquals(dummyShow.genre, showEntity.genre)
        assertEquals(dummyShow.image, showEntity.image)
    }
}