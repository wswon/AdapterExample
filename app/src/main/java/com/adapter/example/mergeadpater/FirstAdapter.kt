package com.adapter.example.mergeadpater

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.adapter.example.R

class FirstAdapter : ListAdapter<String, FirstViewHolder>(
    object : DiffUtil.ItemCallback<String>(){
        override fun areItemsTheSame(oldItem: String, newItem: String): Boolean =
            oldItem == newItem


        override fun areContentsTheSame(oldItem: String, newItem: String): Boolean =
            oldItem == newItem

    }
){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FirstViewHolder {
        return FirstViewHolder(parent)
    }

    override fun onBindViewHolder(holder: FirstViewHolder, position: Int) {
        holder.bind(currentList[position])
    }
}

class FirstViewHolder(parent: ViewGroup): RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context)
        .inflate(R.layout.item_first, parent, false)
){
    private val tvContent = itemView.findViewById<TextView>(R.id.tv_content)

    fun bind(item: String){
        tvContent.text = item
    }
}