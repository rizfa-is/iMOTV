package com.istekno.imotv_movietvshow.utils

import com.istekno.imotv_movietvshow.data.TVShowEntity

interface CallbackShowListener {
    fun onClickShow(tvShowEntity: TVShowEntity)
}