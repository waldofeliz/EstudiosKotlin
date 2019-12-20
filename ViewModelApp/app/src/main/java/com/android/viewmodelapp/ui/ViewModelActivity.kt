package com.android.viewmodelapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProviders
import com.android.viewmodelapp.R
import com.android.viewmodelapp.Sumar
import com.android.viewmodelapp.viewmodel.SumarViewModel

class ViewModelActivity : AppCompatActivity() {

    lateinit var tvSumar : TextView
    lateinit var tvSumarViewModel :TextView
    lateinit var btSumar : Button
    var numero: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_model)

        configView()
    }
    fun configView(){
        tvSumar = findViewById(R.id.viewModelSumarActivityTvSumar)
        tvSumarViewModel = findViewById(R.id.viewModelSumarActivityTvSumarViewModel)

        val sumarViewModel = ViewModelProviders.of(this)[SumarViewModel::class.java]

        tvSumar.text = " " + numero
        tvSumarViewModel.text = " " + sumarViewModel.resultado

        btSumar = findViewById(R.id.viewModelSumarActivityBtSumar)

        btSumar.setOnClickListener{view ->
            numero =  Sumar.sumar(numero)
            tvSumar.text = " " + numero
            sumarViewModel.resultado = Sumar.sumar(sumarViewModel.resultado)
            tvSumarViewModel.text = " " + sumarViewModel.resultado
        }
    }
}
