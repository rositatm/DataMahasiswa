package com.example.mahasiswa

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextNama = findViewById<EditText>(R.id.editTextNama)
        val editTextNIM = findViewById<EditText>(R.id.editTextNIM)
        val buttonSimpan = findViewById<Button>(R.id.buttonSimpan)

        buttonSimpan.setOnClickListener {
            val nama = editTextNama.text.toString()
            val nim = editTextNIM.text.toString()

            val intent = Intent(this, SecondActivity::class.java).apply {
                putExtra("EXTRA_NAMA", nama)
                putExtra("EXTRA_NIM", nim)
            }
            startActivity(intent)
        }
    }
}
