package com.akirachix.inotaplus
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class HomeAdapter(var details: List<Home>) : RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.homepage_main, parent, false)
        return HomeViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val home = details[position]
        holder.tvText.text = home.text
        holder.tvText1.text = home.text1
    }
    override fun getItemCount(): Int {
        return details.size
    }
    class HomeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvText: TextView = itemView.findViewById(R.id.tvText)
        var tvText1: TextView = itemView.findViewById(R.id.tvText1)
    }
}