package com.android.ejemploservicio.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.android.ejemploservicio.R

class MainActivity : AppCompatActivity() {

    lateinit var btServicio : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btServicio = findViewById(R.id.buttonServicio)

        btServicio.setOnClickListener{
            var atServicio = Intent(this, ServicioActivity::class.java)
            startActivity(atServicio)
        }
    }
}
