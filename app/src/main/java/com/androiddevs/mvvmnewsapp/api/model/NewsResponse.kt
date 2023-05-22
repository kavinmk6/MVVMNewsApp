package com.androiddevs.mvvmnewsapp.api.model

import com.androiddevs.mvvmnewsapp.api.model.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)