package com.example.cookpiration.Register_and_Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.Toast
import com.example.cookpiration.R
import com.example.cookpiration.Tampilan_home.Home
import com.example.cookpiration.databinding.ActivityRegisterFormBinding
import com.google.firebase.auth.FirebaseAuth

class RegisterForm : AppCompatActivity() {
    lateinit var binding : ActivityRegisterFormBinding
    lateinit var auth : FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityRegisterFormBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()

        binding.btnMsk.setOnClickListener {
            val intent = Intent(this, LoginForm::class.java)
            startActivity(intent)
        }

        binding.btnDaftar.setOnClickListener {
            val email = binding. formEmail.text.toString()
            val password = binding.formsandi.text.toString()
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
                binding.formsandi.error = "Password Harus Diisi"
                binding.formsandi.requestFocus()
                return@setOnClickListener
            }
            //validasi Panjang pasword
            if (password.length < 6){
                binding.formsandi.error = "Password Minimal 6 karakter"
                binding.formsandi.requestFocus()
                return@setOnClickListener
            }
            RegisterFirebase(email,password)
        }

    }

    private fun RegisterFirebase(email: String, password: String) {

        auth.createUserWithEmailAndPassword(email,password)
            .addOnCompleteListener(this){
                if (it.isSuccessful){
                    Toast.makeText(this, "Register Berhasil",Toast.LENGTH_SHORT).show()
                    val intent = Intent(this,LoginForm::class.java)
                    startActivity(intent)
                }else {
                    Toast.makeText(this, "${it.exception?.message}",Toast.LENGTH_SHORT).show()
                }
            }
    }
}