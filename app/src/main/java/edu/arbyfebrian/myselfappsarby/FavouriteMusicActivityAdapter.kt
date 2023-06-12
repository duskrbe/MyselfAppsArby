package edu.arbyfebrian.myselfappsarby

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

//11 Juni 2023
//10120241
//Arby Febrian Saputro
//IF-6
class FavouriteMusicActivityAdapter(private val shapeItems: List<FavouriteFragment.ShapeItem>) :
    RecyclerView.Adapter<FavouriteMusicActivityAdapter.ShapeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShapeViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.music_card, parent, false)
        return ShapeViewHolder(view)
    }

    override fun onBindViewHolder(holder: ShapeViewHolder, position: Int) {
        val shapeItem = shapeItems[position]
        holder.bind(shapeItem)
    }

    override fun getItemCount(): Int {
        return shapeItems.size
    }

    inner class ShapeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val shapeImageView: ImageView = itemView.findViewById(R.id.shapeImageView)
        private val shapeTitle: TextView = itemView.findViewById(R.id.shapeTitle)
        private val shapeArtist: TextView = itemView.findViewById(R.id.shapeArtist)

        fun bind(shapeItem: FavouriteFragment.ShapeItem) {
            shapeImageView.setImageResource(shapeItem.shapeRes)
            shapeTitle.text = shapeItem.title
            shapeArtist.text = shapeItem.artist
        }
    }
}
