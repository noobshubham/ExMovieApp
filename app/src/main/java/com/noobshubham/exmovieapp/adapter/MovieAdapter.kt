package com.noobshubham.exmovieapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.noobshubham.exmovieapp.R
import com.noobshubham.exmovieapp.model.Movie
import androidx.core.content.ContextCompat.startActivity
import android.content.Intent
import android.net.Uri

class MovieAdapter(
    private val context: Context,
    private val dataset: List<Movie>
) : RecyclerView.Adapter<MovieAdapter.ItemViewHolder>() {

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.movie_title)
        val poster: ImageView = view.findViewById(R.id.movie_image)
        val play: ImageView = view.findViewById(R.id.movie_play_button)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout =
            LayoutInflater.from(parent.context).inflate(R.layout.movie_item_list, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.title.text = context.resources.getString(item.movie_name)
        holder.poster.setImageResource(item.movie_image)

        holder.play.setOnClickListener(View.OnClickListener {
            // Your image click code
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(item.movie_link))
            context.startActivity(intent)
        })
    }

    override fun getItemCount() = dataset.size
}