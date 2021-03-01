package com.istekno.imotv_movietvshow.ui.tvshow

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test

class TVShowViewModelTest {

    private lateinit var viewModel: TVShowViewModel

    @Before
    fun setup() {
        viewModel = TVShowViewModel()
    }

    @Test
    fun getTVShows() {
        val shows = viewModel.getTVShows()
        assertNotNull(shows)
        assertEquals(10, shows.size)
    }
}