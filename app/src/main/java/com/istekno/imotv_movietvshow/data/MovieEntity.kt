package com.istekno.imotv_movietvshow.data

data class MovieEntity(
    val movieId: String,
    val title: String,
    val year: String,
    val country: String,
    val rating: Double,
    val language: String,
    val overview: String,
    val duration: String,
    val genre: List<String>,
    val image: String
)
