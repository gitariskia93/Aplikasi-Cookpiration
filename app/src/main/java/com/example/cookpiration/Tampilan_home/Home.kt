package com.example.cookpiration.Tampilan_home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.cookpiration.Fragment_Nav.SearchFragment
import com.example.cookpiration.R


class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
//
//        val search = findViewById<Button>(R.id.imageSearch)
//
//        search.setOnClickListener {
//            Intent(this, SearchFragment::class.java).also {
//                startActivity(it)
//            }
//        }
//
//        val resep = findViewById<Button>(R.id.btn_omelet)
//
//        resep.setOnClickListener {
//            Intent(this, Resep::class.java).also {
//                startActivity(it)
//            }
//        }
    }
}