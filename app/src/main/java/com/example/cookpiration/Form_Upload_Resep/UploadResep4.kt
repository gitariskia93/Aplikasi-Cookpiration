package com.example.cookpiration.Form_Upload_Resep

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.cookpiration.R

class UploadResep4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_upload_resep4)

        val btn_next5 = findViewById<Button>(R.id.btn_nexttoform5)

        btn_next5.setOnClickListener {
            Intent(this, UploadResep5::class.java).also {
                startActivity(it)
            }
        }
    }
}