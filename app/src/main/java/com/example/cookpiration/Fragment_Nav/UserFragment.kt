package com.example.cookpiration.Fragment_Nav

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import com.example.cookpiration.Pengaturan.Pengaturan
import com.example.cookpiration.R
import com.example.cookpiration.Tampilan_home.SearchPopuler

class UserFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_user, container, false)


        // Menggunakan requireContext() untuk mendapatkan objek Context
        val context = requireContext()

        // Set listener pada tombol untuk berpindah ke UploadResep1
        view.findViewById<ImageButton>(R.id.Button_setting).setOnClickListener {
            val intent = Intent(context, Pengaturan::class.java)
            startActivity(intent)
        }
        return view
    }
}