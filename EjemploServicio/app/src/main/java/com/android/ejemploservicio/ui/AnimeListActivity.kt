package com.android.ejemploservicio.ui

import com.android.ejemploservicio.model.animeList.Top
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.ejemploservicio.R
import com.android.ejemploservicio.adapter.AnimeListAdapter
import com.android.ejemploservicio.viewmodel.AnimeListViewModel

class AnimeListActivity : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null
    private var currentAdapter: AnimeListAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anime_list)

        recyclerView = findViewById(R.id.animesRV)
        recyclerView?.layoutManager = GridLayoutManager(this,2)
        currentAdapter = AnimeListAdapter(this)
        recyclerView?.adapter = currentAdapter

        val model = ViewModelProviders.of(this)[AnimeListViewModel::class.java]
        model.topAnimes.observe(this, Observer<List<Top>> { animes ->
            currentAdapter?.setAnimes(animes)
        })

        model.loadAnimeList()

    }
}
