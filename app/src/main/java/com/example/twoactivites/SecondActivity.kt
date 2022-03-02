package com.example.twoactivites

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val message : String = intent.getStringExtra("message").toString()
        val tvHeader : TextView = findViewById(R.id.text_header)
        tvHeader.text = message
    }
}