package com.example.cookpiration.Register_and_Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.cookpiration.R

class RegisterForm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_form)

        val btn_Masuk = findViewById<Button>(R.id.btn_msk)

        btn_Masuk.setOnClickListener {
            Intent(this, LoginForm::class.java).also {
                startActivity(it)
            }
        }
    }
}