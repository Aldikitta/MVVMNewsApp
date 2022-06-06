package com.aldikitta.mvvmnewsapp.presentation.di

import com.aldikitta.mvvmnewsapp.data.api.NewsAPIService
import com.aldikitta.mvvmnewsapp.data.repository.dataSource.NewsRemoteDataSource
import com.aldikitta.mvvmnewsapp.data.repository.dataSourceImpl.NewsRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class RemoteDataModule {

    @Singleton
    @Provides
    fun provideNewsRemoteDataSource(
        newsAPIService: NewsAPIService
    ): NewsRemoteDataSource {
       return NewsRemoteDataSourceImpl(newsAPIService)
    }

}












