package com.example.cookpiration.Form_Upload_Resep

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.cookpiration.Button_nav_coba.nav_home
import com.example.cookpiration.MainActivity
import com.example.cookpiration.R

class UploadResep5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_upload_resep5)

        val btn_Upload = findViewById<Button>(R.id.btn_uploadResep)

        btn_Upload.setOnClickListener {
            Intent(this, MainActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}