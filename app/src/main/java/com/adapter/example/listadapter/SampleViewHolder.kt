package com.adapter.example.listadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.adapter.example.R

class SampleViewHolder(parent: ViewGroup): RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context)
        .inflate(R.layout.item_sample, parent, false)
){
    private val tvNumber = itemView.findViewById<TextView>(R.id.tv_number)
    
    fun bind(item: SampleItem){
        itemView.setBackgroundColor(item.bgColor.toArgb())
        tvNumber.text = item.number.toString()

    }
}