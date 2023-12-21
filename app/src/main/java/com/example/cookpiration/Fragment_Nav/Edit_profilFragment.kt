package com.example.cookpiration.Fragment_Nav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cookpiration.R
import com.example.cookpiration.databinding.FragmentUserBinding
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth
import com.google.firebase.installations.installations

class Edit_profilFragment : Fragment() {

    private var _binding : FragmentUserBinding? = null
    lateinit var auth: FirebaseAuth

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentUserBinding.inflate(inflater, container, false)
        return binding!!. root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

      auth = FirebaseAuth.getInstance()
        val user = auth.currentUser

        if (user != null)
            binding.textView21.setText(user.displayName)

    }


}