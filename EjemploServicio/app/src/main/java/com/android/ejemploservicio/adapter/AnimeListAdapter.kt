package com.android.ejemploservicio.adapter


import android.content.Context
import android.content.Intent
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import com.android.ejemploservicio.R
import com.bumptech.glide.Glide
import com.android.ejemploservicio.model.animeList.Top
import com.android.ejemploservicio.ui.ServicioActivity

class AnimeListAdapter(val context : Context) : RecyclerView.Adapter<AnimeListAdapter.ViewHolder>() {

    var animeData = mutableListOf<Top>()

    fun setAnimes(animes: List<Top>) {
        animeData.clear()
        animeData.addAll(animes)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)

        // Inflate the custom layout
        val animeView = inflater.inflate(
            R.layout.list_item,
            parent, false)

        // Return a new holder instance
        return ViewHolder(animeView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentAnime = animeData[position]
        holder.bind(currentAnime, context)
    }

    override fun getItemCount(): Int {
        return animeData.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val animeTitle: TextView = itemView.findViewById(R.id.animeTitleTV)
        val animeImage: ImageView = itemView.findViewById(R.id.animePosterIV)
        val animeScore: RatingBar = itemView.findViewById(R.id.animeScoreRB)

        fun bind(anime: Top, context: Context) {
            animeTitle.text = anime.title
            animeScore.rating = anime.score?.toFloat() ?: 0.0f
            context.let {
                Glide.with(context).load(anime.image_url).into(animeImage)
            }

            itemView.setOnClickListener{view ->
                val servicioDetail = Intent(itemView.context, ServicioActivity::class.java)
                servicioDetail.putExtra("animeId", anime.mal_id)
                context.startActivity(servicioDetail)
            }

        }
    }
}