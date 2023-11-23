package com.example.cookpiration.Register_and_Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.cookpiration.R

class KodeOTP : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kode_otp)

        val btn_konfirmasiOTP = findViewById<Button>(R.id.btnKonfirmasiOTP)

        btn_konfirmasiOTP.setOnClickListener {
            Intent(this, PasswordBaru::class.java).also {
                startActivity(it)
            }
        }
    }
}