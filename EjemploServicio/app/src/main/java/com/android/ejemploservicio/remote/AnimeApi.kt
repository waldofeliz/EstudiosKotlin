package com.android.ejemploservicio.remote

import AnimeDetail
import com.android.ejemploservicio.model.animeList.AnimeList
import com.android.ejemploservicio.BuildConfig
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path

private val retrofit = Retrofit.Builder()
    .addConverterFactory(GsonConverterFactory.create())
    .baseUrl(BuildConfig.SERVER_URL)
    .build()

interface AllAnimeApiService{
    @GET("anime/{id}")
    fun getAnimeDetail(@Path("id") id : Int) : Call<AnimeDetail?>

    @GET("top/anime")
    fun getAnimeList() : Call<AnimeList>
}

object AllAnime{
    val retrofitService : AllAnimeApiService by lazy {
        retrofit.create(AllAnimeApiService::class.java)
    }
}