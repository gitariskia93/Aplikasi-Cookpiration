package com.example.cookpiration.Register_and_Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.cookpiration.R

class GantiPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ganti_password)

        val btn_kirimkode = findViewById<Button>(R.id.btnKirimKode)

        btn_kirimkode.setOnClickListener {
            Intent(this, KodeOTP::class.java).also {
                startActivity(it)
            }
        }
    }
}