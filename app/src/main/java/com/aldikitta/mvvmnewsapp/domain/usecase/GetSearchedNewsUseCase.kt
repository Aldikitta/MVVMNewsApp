package com.aldikitta.mvvmnewsapp.domain.usecase

import com.aldikitta.mvvmnewsapp.data.model.APIResponse
import com.aldikitta.mvvmnewsapp.data.util.Resource
import com.aldikitta.mvvmnewsapp.domain.repository.NewsRepository

class GetSearchedNewsUseCase(private val newsRepository: NewsRepository) {
     suspend fun execute(country:String,searchQuery:String,page:Int): Resource<APIResponse> {
         return newsRepository.getSearchedNews(country,searchQuery,page)
     }
}