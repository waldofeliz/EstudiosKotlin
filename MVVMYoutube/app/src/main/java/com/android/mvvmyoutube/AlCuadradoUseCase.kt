package com.android.mvvmyoutube

class AlCuadradoUseCase {
    fun alCuadrado(data : String?) : String{
        if(data.equals("")){
            return "Campo Vacio"
        }
        return (java.lang.Double.valueOf(data!!) * java.lang.Double.valueOf(data)).toString()
    }
}