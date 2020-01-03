package com.android.ejemploservicio.listener

import com.android.ejemploservicio.model.animeList.Top


interface AnimeListListener {
    fun onAnimeLoaded(list : List<Top>?)
}