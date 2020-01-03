package com.android.ejemploservicio.viewmodel

import com.android.ejemploservicio.model.animeList.Top
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.ejemploservicio.listener.AnimeListListener
import com.android.ejemploservicio.repository.AnimeListRepository

class AnimeListViewModel : ViewModel(){

    val topAnimes : MutableLiveData<List<Top>> = MutableLiveData()

    fun loadAnimeList(){
        AnimeListRepository.getAnimeList(object : AnimeListListener{
            override fun onAnimeLoaded(list: List<Top>?) {
                topAnimes.value = list
            }
        })
    }

}