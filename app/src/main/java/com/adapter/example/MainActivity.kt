package com.adapter.example

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import com.adapter.example.listadapter.ListAdapterActivity
import com.adapter.example.mergeadpater.MergeAdapterActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_list_adapter.setOnClickListener {
            startActivity(Intent(this, ListAdapterActivity::class.java))
        }

        btn_merge_adapter.setOnClickListener {
            startActivity(Intent(this, MergeAdapterActivity::class.java))
        }
    }

}
