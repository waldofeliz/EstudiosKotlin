package com.android.mvvmyoutube

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_alcuadrado.*

class AlCuadradoActivity : AppCompatActivity() {

    private lateinit var etAlCuadrado : EditText
    private lateinit var btAlCuadrado : Button
    private lateinit var tvAlCuadrado : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alcuadrado)
        configView()
    }
    fun configView(){

        tvAlCuadrado = findViewById(R.id.tvAlCuadrado)
        etAlCuadrado = findViewById(R.id.edAlCuadrado)
        btAlCuadrado = findViewById(R.id.btCalcular)

        var viewModel = ViewModelProviders.of(this)[AlCuadradoViewModel::class.java]

        btAlCuadrado.setOnClickListener{view ->
            viewModel.alCuadrado(etAlCuadrado.text.toString())
        }

        //Crear observer para observar el cambio de dato
        var observer :Observer<String> = Observer<String>{resultado ->
            tvAlCuadrado.text = resultado
        }

        //Suscribir al observer para que este funcionando.
        viewModel.getResultado().observe(this, observer)

    }
}
