package com.example.cookpiration.Form_Upload_Resep

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.cookpiration.R

class UploadResep2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_upload_resep2)

        val btn_next3 = findViewById<Button>(R.id.btn_nexttoform3)

        btn_next3.setOnClickListener {
            Intent(this, UploadResep3::class.java).also {
                startActivity(it)
            }
        }
    }
}