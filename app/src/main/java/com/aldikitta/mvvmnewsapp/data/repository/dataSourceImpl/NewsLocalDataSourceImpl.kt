package com.aldikitta.mvvmnewsapp.data.repository.dataSourceImpl

import com.aldikitta.mvvmnewsapp.data.db.ArticleDAO
import com.aldikitta.mvvmnewsapp.data.model.Article
import com.aldikitta.mvvmnewsapp.data.repository.dataSource.NewsLocalDataSource
import kotlinx.coroutines.flow.Flow

class NewsLocalDataSourceImpl(
    private val articleDAO: ArticleDAO
) : NewsLocalDataSource {
    override suspend fun saveArticleToDB(article: Article) {
        articleDAO.insert(article)
    }

    override fun getSavedArticles(): Flow<List<Article>> {
        return articleDAO.getAllArticles()
    }

    override suspend fun deleteArticlesFromDB(article: Article) {
        articleDAO.deleteArticle(article)
    }
}