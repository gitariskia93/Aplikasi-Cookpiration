package com.example.cookpiration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.cookpiration.Fragment_Nav.HalamanUpload
import com.example.cookpiration.Fragment_Nav.HomeFragment
import com.example.cookpiration.Fragment_Nav.SaveFragment
import com.example.cookpiration.Fragment_Nav.SearchFragment
import com.example.cookpiration.Fragment_Nav.UserFragment
import com.example.cookpiration.Tampilan_home.Home
import com.example.cookpiration.adapter.ViewPagerAdapter
import com.example.cookpiration.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    private lateinit var bottomNavigationView: BottomNavigationView

    lateinit var binding : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        bottomNavigationView = findViewById(R.id.bottomAppBar)

        bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when(menuItem.itemId){
                R.id.btn_home -> {
                    replaceFragment(HomeFragment())
                    true
                }
                R.id.btn_search -> {
                    replaceFragment(SearchFragment())
                    true
                }
                R.id.btn_upload -> {
                    replaceFragment(HalamanUpload())
                    true
                }
                R.id.btn_save -> {
                    replaceFragment(SaveFragment())
                    true
                }
                R.id.btn_User -> {
                    replaceFragment(UserFragment())
                    true
                }
                else -> false
            }
        }
        replaceFragment(HomeFragment())

    }

    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, fragment).commit()
    }
}