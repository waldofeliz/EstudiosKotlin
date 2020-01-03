package com.android.ejemploservicio.repository

import AnimeList
import android.util.Log
import com.android.ejemploservicio.datasource.AnimeListDataSource
import com.android.ejemploservicio.listener.AnimeListListener
import com.android.ejemploservicio.remote.AllAnime
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object AnimeListRepository : AnimeListDataSource {
    override fun getAnimeList(animeResultCallback: AnimeListListener) {
        val response  = AllAnime.retrofitService.getAnimeList()
            .enqueue(object : Callback<AnimeList>{
                override fun onFailure(call: Call<AnimeList>, t: Throwable) {
                    Log.e("",t.message ?:"")
                }

                override fun onResponse(call: Call<AnimeList>, response: Response<AnimeList>) {
                    val topAnime = response.body()?.top
                    topAnime.let { animeResultCallback.onAnimeLoaded(it) }
                }
            })
    }

}