package com.example.labexam03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val button2: Button = findViewById(R.id.button2)
        button2.setOnClickListener {
            // Navigate to the next screen
            val intent = Intent(this, Instructions::class.java)
            startActivity(intent)
        }

        val button3: Button = findViewById(R.id.button3)
        button3.setOnClickListener {
            // Navigate to the next screen
            val intent = Intent(this, PreviousGames::class.java)
            startActivity(intent)
        }

        val button4: Button = findViewById(R.id.button4)
        button4.setOnClickListener {
            // Navigate to the next screen
            val intent = Intent(this, Settings::class.java)
            startActivity(intent)
        }

        val button5: Button = findViewById(R.id.button5)
        button5.setOnClickListener {
            // Navigate to the next screen
            val intent = Intent(this, About::class.java)
            startActivity(intent)
        }
    }
}