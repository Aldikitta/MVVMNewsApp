package com.aldikitta.mvvmnewsapp.domain.usecase

import com.aldikitta.mvvmnewsapp.data.model.APIResponse
import com.aldikitta.mvvmnewsapp.data.util.Resource
import com.aldikitta.mvvmnewsapp.domain.repository.NewsRepository

class GetNewsHeadlinesUseCase(private val newsRepository: NewsRepository) {

    suspend fun execute(country : String, page : Int): Resource<APIResponse> {
        return newsRepository.getNewsHeadlines(country,page)
    }
}