package com.example.cookpiration.Form_Upload_Resep

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.cookpiration.Button_nav_coba.nav_home
import com.example.cookpiration.R

class UploadResep1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_upload_resep1)

        val btn_next2 = findViewById<Button>(R.id.btn_nexttoform2)

        btn_next2.setOnClickListener {
            Intent(this, UploadResep2::class.java).also {
                startActivity(it)
            }
        }
    }
}