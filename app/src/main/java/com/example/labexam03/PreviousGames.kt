package com.example.labexam03

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class PreviousGames : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_previous_games)

        //call values from shared preferences
        val sharedPreferences = getSharedPreferences("PreviousGames", Context.MODE_PRIVATE)
        val username = sharedPreferences.getString("username", "Unknown")
        val character = sharedPreferences.getString("character", "Unknown")
        val moralityValue = sharedPreferences.getInt("moralityValue", 0)
        val ending = sharedPreferences.getString("ending", "Unknown")

        // Get references to TextViews
        val textPlayerName: TextView = findViewById(R.id.textView51)
        val textCharacter: TextView = findViewById(R.id.textView52)
        val textMoralityValue: TextView = findViewById(R.id.textView53)
        val textEnding: TextView = findViewById(R.id.textView54)

        //Assign Values and display them
        textPlayerName.text = username
        textCharacter.text = character
        textMoralityValue.text = moralityValue.toString()
        textEnding.text = ending

        // Button click listener to navigate back to Main Menu
        val button3: Button = findViewById(R.id.button3)
        button3.setOnClickListener {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }
    }
}