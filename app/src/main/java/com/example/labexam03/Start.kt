package com.example.labexam03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Start : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        val button1: Button = findViewById(R.id.button1)
        button1.setOnClickListener {
            // Navigate to the next screen
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }
    }
}