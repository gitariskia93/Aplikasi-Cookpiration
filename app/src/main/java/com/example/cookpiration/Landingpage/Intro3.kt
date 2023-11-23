package com.example.cookpiration.Landingpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.cookpiration.R

class Intro3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro3)

        val btn_next3 = findViewById<Button>(R.id.btn_next3)

        btn_next3.setOnClickListener {
            Intent(this, Intro4::class.java).also {
                startActivity(it)
            }
        }
    }
}