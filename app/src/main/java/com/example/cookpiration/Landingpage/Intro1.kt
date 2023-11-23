package com.example.cookpiration.Landingpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.cookpiration.R

class Intro1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro1)

        val btn_next1 = findViewById<Button>(R.id.btn_next1)

        btn_next1.setOnClickListener {
            Intent(this, Intro2::class.java).also {
                startActivity(it)
            }
        }
    }
}

