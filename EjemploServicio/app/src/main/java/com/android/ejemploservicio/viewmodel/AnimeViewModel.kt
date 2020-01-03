package com.android.ejemploservicio.viewmodel

import AnimeDetail
import Top
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.ejemploservicio.listener.AnimeDetailListener
import com.android.ejemploservicio.repository.Repository

class AnimeViewModel : ViewModel() {
    val resultado : MutableLiveData<AnimeDetail?> = MutableLiveData()

    fun loadAnime(id : Int){
        Repository.getAnimeDetail(id, object :
        AnimeDetailListener{
            override fun onAnimeLoaded(detail: AnimeDetail?) {
               resultado.value = detail
            }

        })
    }

}