package com.android.ejemploservicio.repository

import AnimeDetail
import AnimeList
import android.util.Log
import com.android.ejemploservicio.listener.AnimeDetailListener
import com.android.ejemploservicio.remote.AllAnime
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import com.android.ejemploservicio.datasource.AnimeDataSource as AnimeDataSource1

object Repository : AnimeDataSource1 {
    override fun getAnimeDetail(id: Int, animeDetailCallBack: AnimeDetailListener) {
        val response  = AllAnime.retrofitService.getAnimeDetail(id)
            .enqueue(object : Callback<AnimeDetail?>{
                override fun onFailure(call: Call<AnimeDetail?>, t: Throwable) {
                    Log.e("",t.message ?:"")
                }

                override fun onResponse(call: Call<AnimeDetail?>, response: Response<AnimeDetail?>) {
                    val detail = response.body()
                    detail?.let { animeDetailCallBack.onAnimeLoaded(it) }
                }
            })
    }

}