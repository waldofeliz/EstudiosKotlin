package com.android.ejemploservicio.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.android.ejemploservicio.R

class MainActivity : AppCompatActivity() {

    lateinit var btServicio : Button
    lateinit var btLista : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btServicio = findViewById(R.id.buttonServicio)
        btLista = findViewById(R.id.buttonLista)

        btServicio.setOnClickListener{
            var atServicio = Intent(this, ServicioActivity::class.java)
            startActivity(atServicio)
        }

        btLista.setOnClickListener{
            var ltServicio = Intent(this, AnimeListActivity::class.java)
            startActivity(ltServicio)
        }
    }
}
