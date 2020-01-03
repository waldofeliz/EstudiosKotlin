package com.android.ejemploservicio.ui

import AnimeDetail
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.RatingBar
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.android.ejemploservicio.R
import com.android.ejemploservicio.viewmodel.AnimeViewModel
import java.io.IOException

class ServicioActivity : AppCompatActivity() {

    private lateinit var tituloTv : TextView
    private lateinit var tipoTv : TextView
    private lateinit var episodiosTv : TextView
    private lateinit var scoreTv : RatingBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_servicio)

        try {

            var animeId: Int = intent.extras?.get("animeId") as Int

            var animeViewModel = ViewModelProviders.of(this)[AnimeViewModel::class.java]

            animeViewModel.loadAnime(animeId)


            tituloTv = findViewById(R.id.tvTitulo)
            tipoTv = findViewById(R.id.tvTipo)
            episodiosTv = findViewById(R.id.tvEpisodios)
            scoreTv = findViewById(R.id.rbScore)

            animeViewModel.resultado.observe(this, Observer<AnimeDetail?>{anime ->

                tituloTv.text = anime?.title.toString()
                tipoTv.text = anime?.type.toString()
                episodiosTv.text = anime?.episodes.toString()
                scoreTv.rating = anime?.score?.toFloat()?: 0.0f

            } )


        }
        catch (e : IOException){
            Log.e("",e.message)
        }

    }
}
