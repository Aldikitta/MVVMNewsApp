package com.aldikitta.mvvmnewsapp.presentation.di

import com.aldikitta.mvvmnewsapp.data.db.ArticleDAO
import com.aldikitta.mvvmnewsapp.data.repository.dataSource.NewsLocalDataSource
import com.aldikitta.mvvmnewsapp.data.repository.dataSourceImpl.NewsLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class LocalDataModule {
    @Singleton
    @Provides
    fun provideLocalDataSource(articleDAO: ArticleDAO): NewsLocalDataSource {
      return NewsLocalDataSourceImpl(articleDAO)
    }

}













