package com.example.wapplehoneyflavor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.exercise.boj
import kotlinx.android.synthetic.main.activity_information__basic.*

class Information_Basic : AppCompatActivity() {
    var bojList : ArrayList<boj> = arrayListOf(boj("이름","정재영"),boj("대학교 및 학과","서울대학교 컴공"),boj("학번","18학번"),boj("이메일","yhj3211001@daum.net"))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_information__basic)
        val myAdapter = bojAdapter(this,bojList)
        my_recycler_view.adapter = myAdapter
        val lm = LinearLayoutManager(this)
        my_recycler_view.layoutManager = lm
        my_recycler_view.setHasFixedSize(true)
        my_recycler_view.addItemDecoration(DividerItemDecoration(this,1))
    }
}
