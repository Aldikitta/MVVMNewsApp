package com.aldikitta.mvvmnewsapp.presentation.di

import android.app.Application
import com.aldikitta.mvvmnewsapp.domain.usecase.*
import com.aldikitta.mvvmnewsapp.presentation.viewmodel.NewsViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class FactoryModule {
    @Singleton
    @Provides
  fun provideNewsViewModelFactory(
        application: Application,
        getNewsHeadlinesUseCase: GetNewsHeadlinesUseCase,
        getSearchedNewsUseCase: GetSearchedNewsUseCase,
        saveNewsUseCase: SaveNewsUseCase,
        getSavedNewsUseCase: GetSavedNewsUseCase,
        deleteSavedNewsUseCase: DeleteSavedNewsUseCase
  ): NewsViewModelFactory {
      return NewsViewModelFactory(
          application,
          getNewsHeadlinesUseCase,
          getSearchedNewsUseCase,
          saveNewsUseCase,
          getSavedNewsUseCase,
          deleteSavedNewsUseCase
      )
  }

}








