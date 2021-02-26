package com.istekno.imotv_movietvshow.ui.tvshow

import androidx.lifecycle.ViewModel
import com.istekno.imotv_movietvshow.data.TVShowEntity
import com.istekno.imotv_movietvshow.utils.DataDummy

class TVShowViewModel: ViewModel() {

    fun getTVShows(): List<TVShowEntity> = DataDummy.generateDummyTVShow()
}