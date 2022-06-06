package com.aldikitta.mvvmnewsapp.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.aldikitta.mvvmnewsapp.data.model.Article

@Database(
    entities = [Article::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract  class ArticleDatabase : RoomDatabase(){
    abstract fun getArticleDAO(): ArticleDAO
}

