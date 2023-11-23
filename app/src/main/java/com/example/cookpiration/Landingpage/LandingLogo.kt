package com.example.cookpiration.Landingpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.cookpiration.R
import com.example.cookpiration.Register_and_Login.RegisterUtama

class LandingLogo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing_logo)

        val btn_mulai = findViewById<Button>(R.id.btn_mulai)

        btn_mulai.setOnClickListener {
            Intent( this, Intro1::class.java).also {
                startActivity(it)
            }
        }

    }
}