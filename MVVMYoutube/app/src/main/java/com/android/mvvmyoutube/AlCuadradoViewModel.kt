package com.android.mvvmyoutube

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AlCuadradoViewModel : ViewModel() {

    private var resultado : MutableLiveData<String> = MutableLiveData()

    fun getResultado() : LiveData<String>{
        return resultado
    }

    fun alCuadrado(data : String){
        resultado.value = AlCuadradoUseCase().alCuadrado(data)
    }
}