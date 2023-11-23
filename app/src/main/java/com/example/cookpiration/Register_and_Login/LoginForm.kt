package com.example.cookpiration.Register_and_Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.cookpiration.R

class LoginForm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_form)

        val btn_Lupaktsandi = findViewById<Button>(R.id.lupakatasandi)

        btn_Lupaktsandi.setOnClickListener {
            Intent(this, GantiPassword::class.java).also {
                startActivity(it)
            }
        }

        val btn_Masuk = findViewById<Button>(R.id.BtnMasuk)

        btn_Masuk.setOnClickListener {
            Intent(this, PengaturanAkun::class.java).also {
                startActivity(it)
            }
        }

    }
}