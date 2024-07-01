package com.example.labexam03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.lifecycle.ViewModelProvider

class Stage2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stage2)

        // Retrieve the username, character and moralityValue from the intent extras
        var username = intent.getStringExtra("username")
        var character = intent.getStringExtra("character")
        var moralityValue = intent.getIntExtra("moralityValue", 0)

        val button1: Button = findViewById(R.id.button4)
        button1.setOnClickListener {
            //change the value of counter
            moralityValue += 5
            // Navigate to the next screen
            val intent = Intent(this, Stage3::class.java)
            intent.putExtra("username", username)
            intent.putExtra("character", character)
            intent.putExtra("moralityValue", moralityValue)
            startActivity(intent)
        }

        val button2: Button = findViewById(R.id.button5)
        button2.setOnClickListener {
            //change the value of counter
            moralityValue -= 5
            // Navigate to the next screen
            val intent = Intent(this, Stage3::class.java)
            intent.putExtra("username", username)
            intent.putExtra("character", character)
            intent.putExtra("moralityValue", moralityValue)
            startActivity(intent)
        }

        val button3: Button = findViewById(R.id.button6)
        button3.setOnClickListener {
            //change the value of counter
            moralityValue += 2
            // Navigate to the next screen
            val intent = Intent(this, Stage3::class.java)
            intent.putExtra("username", username)
            intent.putExtra("character", character)
            intent.putExtra("moralityValue", moralityValue)
            startActivity(intent)
        }

    }
}