package com.example.cookpiration.Register_and_Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.cookpiration.R

class RegisterUtama : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_utama)

        val btn_BuatAkun = findViewById<Button>(R.id.Btn_BuatAkun)

        btn_BuatAkun.setOnClickListener {
            Intent(this, RegisterForm::class.java).also {
                startActivity(it)

            }
        }

                val btnMasuk = findViewById<Button>(R.id.btnMasuk)

                btnMasuk.setOnClickListener {
                    Intent(this, LoginForm::class.java).also {
                        startActivity(it)
                    }
                }
            }
        }