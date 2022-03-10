package com.noobshubham.exmovieapp.model

import androidx.annotation.StringRes

data class Movie(
    @StringRes val movie_name: Int,
    val movie_image: Int,
    val movie_link: String
)
