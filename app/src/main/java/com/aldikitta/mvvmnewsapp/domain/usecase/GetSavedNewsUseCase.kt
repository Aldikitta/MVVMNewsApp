package com.aldikitta.mvvmnewsapp.domain.usecase

import com.aldikitta.mvvmnewsapp.data.model.Article
import com.aldikitta.mvvmnewsapp.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class GetSavedNewsUseCase(private val newsRepository: NewsRepository) {
    fun execute(): Flow<List<Article>>{
        return newsRepository.getSavedNews()
    }
}