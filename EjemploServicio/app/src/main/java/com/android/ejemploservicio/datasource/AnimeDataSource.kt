package com.android.ejemploservicio.datasource

import com.android.ejemploservicio.listener.AnimeDetailListener

interface AnimeDataSource {
    fun getAnimeDetail(id: Int, animeDetailCallBack : AnimeDetailListener)
}