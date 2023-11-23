package com.example.cookpiration.Register_and_Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.cookpiration.R

class PengaturanAkun : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pengaturan_akun)

        val btn_AturAkun = findViewById<Button>(R.id.BtnAturAkun)

        btn_AturAkun.setOnClickListener {
            Intent(this, Intro5::class.java).also {
                startActivity(it)
            }
        }
    }
}