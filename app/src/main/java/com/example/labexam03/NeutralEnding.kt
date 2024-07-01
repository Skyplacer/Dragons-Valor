package com.example.labexam03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.lifecycle.ViewModelProvider

class NeutralEnding : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_neutral_ending)

        // Retrieve the username, character and moralityValue from the intent extras
        var username = intent.getStringExtra("username")
        var character = intent.getStringExtra("character")
        var moralityValue = intent.getIntExtra("moralityValue", 0)

        val button3: Button = findViewById(R.id.button3)
        button3.setOnClickListener {

            val ending = "Neutral Ending"

            // Navigate to the next screen
            val intent = Intent(this, Results::class.java)
            intent.putExtra("username", username)
            intent.putExtra("character", character)
            intent.putExtra("moralityValue", moralityValue)
            intent.putExtra("ending", ending)
            startActivity(intent)
        }
    }
}