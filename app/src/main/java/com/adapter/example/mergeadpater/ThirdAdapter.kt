package com.adapter.example.mergeadpater

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.adapter.example.R
import java.text.SimpleDateFormat
import java.util.*

class ThirdAdapter : ListAdapter<String, ThirdViewHolder>(
    object : DiffUtil.ItemCallback<String>(){
        override fun areItemsTheSame(oldItem: String, newItem: String): Boolean =
            oldItem == newItem


        override fun areContentsTheSame(oldItem: String, newItem: String): Boolean =
            oldItem == newItem

    }
){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ThirdViewHolder {
        return ThirdViewHolder(parent)
    }

    override fun onBindViewHolder(holder: ThirdViewHolder, position: Int) {
        holder.bind(currentList[position])
    }
}


class ThirdViewHolder(parent: ViewGroup): RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context)
        .inflate(R.layout.item_third, parent, false)
){
    private val tvTime = itemView.findViewById<TextView>(R.id.tv_time)

    fun bind(item: String){
        tvTime.text = SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss").format(Date())
    }
}