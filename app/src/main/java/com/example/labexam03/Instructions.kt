package com.example.labexam03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.textfield.TextInputEditText

class Instructions : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instructions)

        val button6: Button = findViewById(R.id.button6)
        button6.setOnClickListener {

            // Retrieve the username from the TextInputEditText
            val usernameEditText = findViewById<TextInputEditText>(R.id.textInput1)
            val username = usernameEditText.text.toString()

            // Check if username is not empty
            if (username.isNotEmpty()) {

                // Create an Intent to start the Character_Selection activity
                val intent = Intent(this, Character_Selection::class.java)
                intent.putExtra("username", username)

                // Start the next activity
                startActivity(intent)
            } else {
                // Show a toast message if username is empty
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show()
            }
        }
    }
}