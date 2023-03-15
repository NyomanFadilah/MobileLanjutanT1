package com.example.nyoman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PindahDataActivity : AppCompatActivity() {
    companion object {
        const val  EXTRA_TEXT = "extra_text"
    }

    private lateinit var tvPenerima : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pindah_data)

        tvPenerima = findViewById(R.id.tv)

        val tvReceived = intent.getStringExtra(EXTRA_TEXT)
        val text = "Text yag dikrim : $tvReceived"

        tvPenerima.text
    }
}