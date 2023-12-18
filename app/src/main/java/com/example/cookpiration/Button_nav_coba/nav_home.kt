package com.example.cookpiration.Button_nav_coba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.cookpiration.Form_Upload_Resep.UploadResep1
import com.example.cookpiration.Fragment_Nav.SaveFragment
import com.example.cookpiration.Fragment_Nav.SearchFragment
import com.example.cookpiration.Fragment_Nav.UserFragment
import com.example.cookpiration.R
import com.example.cookpiration.Tampilan_home.Resep
import com.example.cookpiration.Tampilan_home.SearchPopuler

class nav_home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nav_home)

        val btn_Upload = findViewById<Button>(R.id.button_upload)

        btn_Upload.setOnClickListener {
            Intent(this, HalamanUp_nav::class.java).also {
                startActivity(it)
            }
        }
        val btn_Cari = findViewById<Button>(R.id.btn_cari)

        btn_Cari.setOnClickListener {
            Intent(this, Search_populer::class.java).also {
                startActivity(it)
            }
        }

        val btn_User = findViewById<Button>(R.id.button_user)

        btn_User.setOnClickListener {
            Intent(this, user_nav::class.java).also {
                startActivity(it)
            }
        }

        val btn_save = findViewById<Button>(R.id.button_save)

        btn_save.setOnClickListener {
            Intent(this, Save_nav::class.java).also {
                startActivity(it)
            }
        }

        val btn_Omelet = findViewById<Button>(R.id.btn_resepome)

        btn_Omelet.setOnClickListener {
            Intent(this, Resep_nav::class.java).also {
                startActivity(it)
            }
        }

        val btn_search = findViewById<Button>(R.id.button_search)

        btn_search.setOnClickListener {
            Intent(this, Search_nav::class.java).also {
                startActivity(it)
            }
        }
    }
}