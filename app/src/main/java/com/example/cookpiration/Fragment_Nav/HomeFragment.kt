package com.example.cookpiration.Fragment_Nav

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import com.example.cookpiration.Form_Upload_Resep.UploadResep1
import com.example.cookpiration.R
import com.example.cookpiration.Tampilan_home.Resep
import com.example.cookpiration.Tampilan_home.SearchPopuler

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

// Set listener pada tombol untuk berpindah ke UploadResep1
        view.findViewById<ImageButton>(R.id.btn_SearchPopuler).setOnClickListener {
            startActivity(Intent(requireContext(), SearchPopuler::class.java))
        }

        // Set listener pada tombol untuk berpindah ke UploadResep1
        view.findViewById<ImageButton>(R.id.btn_omelet).setOnClickListener {
            startActivity(Intent(requireContext(), Resep::class.java))
        }


        return view
    }

}