package com.jsquaredstudios.ladigue

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WineAdapter(private val wineList: List<WineItem>) : RecyclerView.Adapter<WineAdapter.WineViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WineViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.champagne_item, parent, false)
        return WineViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: WineViewHolder, position: Int) {
        val currentItem = wineList[position]

        holder.wineColor.setImageResource(currentItem.color)
        holder.wineName.text = currentItem.wineName
        holder.wineDescription.text = currentItem.wineDescription
        holder.winePrice75.text = currentItem.price75
        holder.winePrice12.text = currentItem.price12
    }

    override fun getItemCount() = wineList.size



    class WineViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val wineColor: ImageView = itemView.findViewById(R.id.wineColor)
        val wineName: TextView = itemView.findViewById(R.id.wineName)
        val wineDescription: TextView = itemView.findViewById(R.id.wineDescription)
        val winePrice75 : TextView = itemView.findViewById(R.id.winePrice75)
        val winePrice12 : TextView = itemView.findViewById(R.id.winePrice12)
    }


}