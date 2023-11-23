package com.example.cookpiration.Landingpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.cookpiration.R
import com.example.cookpiration.Register_and_Login.RegisterUtama

class Intro4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro4)

        val btn_next4 = findViewById<Button>(R.id.btn_next4)

        btn_next4.setOnClickListener {
            Intent(this, RegisterUtama::class.java).also {
                startActivity(it)
            }
        }
    }
}