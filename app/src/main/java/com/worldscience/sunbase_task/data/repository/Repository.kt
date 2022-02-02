package com.worldscience.sunbase_task.data.repository

import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.worldscience.sunbase_task.data.local.UnsplashDatabase
import com.worldscience.sunbase_task.data.paging.SearchPagingSource
import com.worldscience.sunbase_task.data.paging.UnsplashRemoteMediator
import com.worldscience.sunbase_task.data.remote.UnsplashApi
import com.worldscience.sunbase_task.model.UnsplashImage
import com.worldscience.sunbase_task.util.Constants.ITEMS_PER_PAGE
import javax.inject.Inject
import kotlinx.coroutines.flow.Flow

@ExperimentalPagingApi
class Repository @Inject constructor(
    private val unsplashApi: UnsplashApi,
    private val unsplashDatabase: UnsplashDatabase
) {

    fun getAllImages(): Flow<PagingData<UnsplashImage>> {
        val pagingSourceFactory = { unsplashDatabase.unsplashImageDao().getAllImages() }
        return Pager(
            config = PagingConfig(pageSize = ITEMS_PER_PAGE),
            remoteMediator = UnsplashRemoteMediator(
                unsplashApi = unsplashApi,
                unsplashDatabase = unsplashDatabase
            ),
            pagingSourceFactory = pagingSourceFactory
        ).flow
    }

    fun searchImages(query: String): Flow<PagingData<UnsplashImage>> {
        return Pager(
            config = PagingConfig(pageSize = ITEMS_PER_PAGE),
            pagingSourceFactory = {
                SearchPagingSource(unsplashApi = unsplashApi, query = query)
            }
        ).flow
    }

}