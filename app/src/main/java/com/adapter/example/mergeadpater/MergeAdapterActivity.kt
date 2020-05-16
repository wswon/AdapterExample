package com.adapter.example.mergeadpater

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.MergeAdapter
import com.adapter.example.R
import kotlinx.android.synthetic.main.activity_merge_adapter.*

class MergeAdapterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_merge_adapter)

        val firstAdapter = FirstAdapter()
        val secondAdapter = SecondAdapter()
        val thirdAdapter = ThirdAdapter()

        firstAdapter.submitList(listOf("첫번째 어댑터", "첫번째 어댑터", "첫번째 어댑터", "첫번째 어댑터", "첫번째 어댑터"))
        secondAdapter.submitList(listOf("두번째 어댑터", "두번째 어댑터", "두번째 어댑터", "두번째 어댑터", "두번째 어댑터"))
        thirdAdapter.submitList(listOf("세번째 어댑터", "세번째 어댑터", "세번째 어댑터", "세번째 어댑터", "세번째 어댑터"))

        val mergeAdapter = MergeAdapter(firstAdapter, secondAdapter, thirdAdapter)

        rv_diff_item.adapter = mergeAdapter


    }
}
