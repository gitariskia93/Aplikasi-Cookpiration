package com.example.cookpiration.Register_and_Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.Toast
import com.example.cookpiration.R
import com.example.cookpiration.Tampilan_home.Home
import com.example.cookpiration.databinding.ActivityLoginFormBinding
import com.google.firebase.auth.FirebaseAuth

class LoginForm : AppCompatActivity() {
    lateinit var auth : FirebaseAuth
    lateinit var binding : ActivityLoginFormBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLoginFormBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()

        binding.clicdaftar.setOnClickListener {
            val intent = Intent(this, RegisterForm::class.java)
            startActivity(intent)
        }
        binding.BtnMasuk.setOnClickListener {
            val email = binding. formEmail.text.toString()
            val password = binding.formSandimsk.text.toString()
            //validasi email
            if (email.isEmpty()){
                binding.formEmail.error = "Email Harus Diisi"
                binding.formEmail.requestFocus()
                return@setOnClickListener
            }
            //validasi email tidak sesuai
            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                binding.formEmail.error = "Email Tidak Valid"
                binding.formEmail.requestFocus()
                return@setOnClickListener
            }
            //validasi password
            if (password.isEmpty()){
                binding.formSandimsk.error = "Password Harus Diisi"
                binding.formSandimsk.requestFocus()
                return@setOnClickListener
            }
            LoginFirebase(email,password)
        }

    }

    private fun LoginFirebase(email: String, password: String) {
        auth.signInWithEmailAndPassword(email,password)
            .addOnCompleteListener(this){
                if (it.isSuccessful){
                    Toast.makeText(this, "Selamat datang $email",Toast.LENGTH_SHORT).show()
                    val intent = Intent(this,PengaturanAkun::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "${it.exception?.message}",Toast.LENGTH_SHORT).show()
                }

            }

    }
}