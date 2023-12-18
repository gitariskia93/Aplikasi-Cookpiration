package com.example.cookpiration.Pengaturan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.cookpiration.R
import com.example.cookpiration.Register_and_Login.LoginForm
import com.example.cookpiration.Register_and_Login.PengaturanAkun

class Pengaturan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pengaturan)

        val btn_Keluar = findViewById<Button>(R.id.btn_Keluar)

        btn_Keluar.setOnClickListener {
            Intent(this, LoginForm::class.java).also {
                startActivity(it)
            }
        }
    }
}