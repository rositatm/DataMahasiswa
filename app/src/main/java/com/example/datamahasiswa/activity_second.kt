package com.example.mahasiswa

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textViewHasil = findViewById<TextView>(R.id.textViewHasil)

        val nama = intent.getStringExtra("EXTRA_NAMA")
        val nim = intent.getStringExtra("EXTRA_NIM")

        textViewHasil.text = "Nama: $nama\nNIM: $nim"
    }
}
