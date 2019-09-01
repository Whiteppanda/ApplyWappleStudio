package com.example.wapplehoneyflavor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent:Intent = Intent(this,Information_Basic::class.java)
        val intent1:Intent = Intent(this,Info1::class.java)
        button1.setOnClickListener {
            Toast.makeText(this,"안녕하세요!",Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }
        button2.setOnClickListener {
            startActivity(intent1)
        }
    }
}
