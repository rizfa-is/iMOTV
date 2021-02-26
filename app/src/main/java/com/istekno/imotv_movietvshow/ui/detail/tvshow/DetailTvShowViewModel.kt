package com.istekno.imotv_movietvshow.ui.detail.tvshow

import androidx.lifecycle.ViewModel
import com.istekno.imotv_movietvshow.data.TVShowEntity
import com.istekno.imotv_movietvshow.utils.DataDummy

class DetailTvShowViewModel: ViewModel() {

    private lateinit var showId: String

    fun setShowId(showId: String) {
        this.showId = showId
    }

    fun getTVShow(): TVShowEntity {
        lateinit var show: TVShowEntity
        val dataShows= DataDummy.generateDummyTVShow()

        for (tvsEntity in dataShows) {
            if (tvsEntity.tvsId == showId) {
                show = tvsEntity
            }
        }
        return show
    }
}