package com.android.ejemploservicio.datasource

import com.android.ejemploservicio.listener.AnimeListListener


interface AnimeListDataSource {
    fun getAnimeList(animeResultCallback: AnimeListListener)
}