package com.example.labexam03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.lifecycle.ViewModelProvider

class Character_Selection : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_character_selection)

        // Retrieve the username from the intent extras
        var username = intent.getStringExtra("username")

        val button7: Button = findViewById(R.id.button7)

        button7.setOnClickListener {

            val character = "Warrior"

            //Navigate to the next screen
            val intent = Intent(this, Stage1::class.java)
            intent.putExtra("username", username)
            intent.putExtra("character", character)
            startActivity(intent)
        }

        val button8: Button = findViewById(R.id.button8)
        button8.setOnClickListener {

            val character = "Rogue"

            // Navigate to the next screen
            val intent = Intent(this, Stage1::class.java)
            intent.putExtra("username", username)
            intent.putExtra("character", character)
            startActivity(intent)
        }

        val button9: Button = findViewById(R.id.button9)
        button9.setOnClickListener {

            val character = "Mage"

            // Navigate to the next screen
            val intent = Intent(this, Stage1::class.java)
            intent.putExtra("username", username)
            intent.putExtra("character", character)
            startActivity(intent)
        }
    }
}

