package com.aldikitta.mvvmnewsapp.domain.usecase

import com.aldikitta.mvvmnewsapp.data.model.Article
import com.aldikitta.mvvmnewsapp.domain.repository.NewsRepository

class SaveNewsUseCase(private val newsRepository: NewsRepository) {
  suspend fun execute(article: Article)=newsRepository.saveNews(article)
}