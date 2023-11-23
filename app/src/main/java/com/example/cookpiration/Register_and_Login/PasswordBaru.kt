package com.example.cookpiration.Register_and_Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.cookpiration.R

class PasswordBaru : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password_baru)

        val btn_UbahPass = findViewById<Button>(R.id.btnUbahPass)

        btn_UbahPass.setOnClickListener {
            Intent(this, LoginForm::class.java).also {
                startActivity(it)
            }
        }

    }
}

