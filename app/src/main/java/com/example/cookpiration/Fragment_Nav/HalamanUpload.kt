package com.example.cookpiration.Fragment_Nav

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import com.example.cookpiration.Form_Upload_Resep.UploadResep1
import com.example.cookpiration.R
import com.example.cookpiration.Tampilan_home.Resep


class HalamanUpload : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_halaman_upload, container, false)

        // Set listener pada tombol untuk berpindah ke UploadResep1
        view.findViewById<ImageButton>(R.id.btn_tambahResep).setOnClickListener {
            startActivity(Intent(requireContext(), UploadResep1::class.java))
        }

        return view

    }
}