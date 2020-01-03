package com.android.ejemploservicio.listener

import AnimeDetail

interface AnimeDetailListener {
    fun onAnimeLoaded(detail : AnimeDetail?)
}