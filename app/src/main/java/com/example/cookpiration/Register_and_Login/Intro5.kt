package com.example.cookpiration.Register_and_Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.cookpiration.Button_nav_coba.nav_coba
import com.example.cookpiration.Button_nav_coba.nav_home
import com.example.cookpiration.Fragment_Nav.HomeFragment
import com.example.cookpiration.MainActivity
import com.example.cookpiration.R
import com.example.cookpiration.Tampilan_home.Home

class Intro5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro5)

        val btn_next1 = findViewById<Button>(R.id.btn_next1)

        btn_next1.setOnClickListener {
            Intent(this, MainActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}