package com.aldikitta.mvvmnewsapp.presentation.di

import com.aldikitta.mvvmnewsapp.data.repository.NewsRepositoryImpl
import com.aldikitta.mvvmnewsapp.data.repository.dataSource.NewsLocalDataSource
import com.aldikitta.mvvmnewsapp.data.repository.dataSource.NewsRemoteDataSource
import com.aldikitta.mvvmnewsapp.domain.repository.NewsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Singleton
    @Provides
    fun provideNewsRepository(
        newsRemoteDataSource: NewsRemoteDataSource,
        newsLocalDataSource: NewsLocalDataSource
    ): NewsRepository {
        return NewsRepositoryImpl(
            newsRemoteDataSource,
            newsLocalDataSource
        )
    }

}














