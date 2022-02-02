package com.worldscience.sunbase_task.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.worldscience.sunbase_task.data.local.dao.UnsplashImageDao
import com.worldscience.sunbase_task.data.local.dao.UnsplashRemoteKeysDao
import com.worldscience.sunbase_task.model.UnsplashImage
import com.worldscience.sunbase_task.model.UnsplashRemoteKeys

@Database(entities = [UnsplashImage::class, UnsplashRemoteKeys::class], version = 1)
abstract class UnsplashDatabase : RoomDatabase() {

    abstract fun unsplashImageDao(): UnsplashImageDao
    abstract fun unsplashRemoteKeysDao(): UnsplashRemoteKeysDao

}