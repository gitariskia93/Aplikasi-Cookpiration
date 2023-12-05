package com.example.cookpiration.Tampilan_home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cookpiration.R
import android.widget.EditText
import android.widget.TextView


class SearchPopuler : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_populer)

        class MainActivity : AppCompatActivity() {

            private lateinit var editSearch: EditText
            private lateinit var textViewResult: TextView

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)

                editSearch = findViewById(R.id.editSearch)
                textViewResult = findViewById(R.id.textViewResult)

                // Atur listener untuk menangani perubahan teks pencarian
                editSearch.setOnEditorActionListener { _, _, _ ->
                    performSearch(editSearch.text.toString())
                    true
                }
            }

            private fun performSearch(query: String) {
                // Lakukan logika pencarian sesuai kebutuhan Anda
                // Misalnya, Anda dapat mencari data dari database atau sumber lainnya.
                // Contoh sederhana: mengembalikan pesan dengan query pencarian.
                textViewResult.text = "Hasil pencarian: $query"
            }
        }
    }
}