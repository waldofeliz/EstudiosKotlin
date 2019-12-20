package com.android.animelistapp.data.source.remote

import AnimeDetail
import AnimeList
import com.android.animelistapp.BuildConfig
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

private val retrofit = Retrofit.Builder()
    .addConverterFactory(GsonConverterFactory.create())
    .baseUrl(BuildConfig.SERVER_URL)
    .build()


interface AnimeApiService{
    @GET("top/anime")
    fun getAnimeList(): Call<AnimeList>

    @GET("anime/")
    fun getAnimeDetail() : Call<AnimeDetail>

}