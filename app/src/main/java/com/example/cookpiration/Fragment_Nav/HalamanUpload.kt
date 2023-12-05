package com.example.cookpiration.Fragment_Nav

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.cookpiration.Form_Upload_Resep.UploadResep1
import com.example.cookpiration.R


class HalamanUpload : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_halaman_upload, container, false)

        val intent = Intent (getActivity(), UploadResep1::class.java)
        getActivity()?.startActivity(intent)
    }

}