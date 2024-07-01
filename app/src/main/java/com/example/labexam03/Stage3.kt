package com.example.labexam03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Stage3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stage3)

        // Retrieve the username, character and moralityValue from the intent extras
        var username = intent.getStringExtra("username")
        var character = intent.getStringExtra("character")
        var moralityValue = intent.getIntExtra("moralityValue", 0)

        val button1: Button = findViewById(R.id.button7)
        button1.setOnClickListener {
            //change the value of counter
            moralityValue -= 8
            // Navigate to the next screen
            val intent = Intent(this, Stage4::class.java)
            intent.putExtra("username", username)
            intent.putExtra("character", character)
            intent.putExtra("moralityValue", moralityValue)
            startActivity(intent)
        }

        val button2: Button = findViewById(R.id.button8)
        button2.setOnClickListener {
            //change the value of counter
            moralityValue += 2
            // Navigate to the next screen
            val intent = Intent(this, Stage4::class.java)
            intent.putExtra("username", username)
            intent.putExtra("character", character)
            intent.putExtra("moralityValue", moralityValue)
            startActivity(intent)
        }

        val button3: Button = findViewById(R.id.button9)
        button3.setOnClickListener {
            //change the value of counter
            moralityValue -= 5
            // Navigate to the next screen
            val intent = Intent(this, Stage4::class.java)
            intent.putExtra("username", username)
            intent.putExtra("character", character)
            intent.putExtra("moralityValue", moralityValue)
            startActivity(intent)
        }

    }
}