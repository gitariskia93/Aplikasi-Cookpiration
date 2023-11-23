package com.example.cookpiration.Landingpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.cookpiration.R

class Intro2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro2)

        val btn_next2 = findViewById<Button>(R.id.btn_next2)

        btn_next2.setOnClickListener {
            Intent(this, Intro3::class.java).also {
                startActivity(it)
            }
        }
    }
}