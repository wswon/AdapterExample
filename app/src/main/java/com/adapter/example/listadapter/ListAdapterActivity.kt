package com.adapter.example.listadapter

import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import com.adapter.example.R
import kotlinx.android.synthetic.main.activity_list_adapter.*

class ListAdapterActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_adapter)


        val sampleListAdapter =
            SampleListAdapter()

        val sampleItemList = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9).map {
            SampleItem(
                it,
                getRandomColor()
            )
        }

        rv_sample.adapter = sampleListAdapter

        sampleListAdapter.submitList(sampleItemList)

        btn_shuffle.setOnClickListener {

            sampleListAdapter.submitList(sampleItemList.map { SampleItem(it.number, getRandomColor()) }.shuffled())
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun getRandomColor() =
        Color.valueOf(
            (0..255).random().toFloat(),
            (0..255).random().toFloat(),
            (0..255).random().toFloat()
        )
}
