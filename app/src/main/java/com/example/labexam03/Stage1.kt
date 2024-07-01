package com.example.labexam03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Stage1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stage1)

        // Retrieve the username and character from the intent extras
        var username = intent.getStringExtra("username")
        var character = intent.getStringExtra("character")

        var moralityValue=0

        val button1: Button = findViewById(R.id.button1)
        button1.setOnClickListener {
            moralityValue=0
            //change the value of counter
            moralityValue+=25
            // Navigate to the next screen
            val intent = Intent(this, Stage2::class.java)
            intent.putExtra("username", username)
            intent.putExtra("character", character)
            intent.putExtra("moralityValue", moralityValue)
            startActivity(intent)
        }

        val button2: Button = findViewById(R.id.button2)
        button2.setOnClickListener {
            moralityValue=0
            //change the value of counter
            moralityValue+=5
            // Navigate to the next screen
            val intent = Intent(this, Stage2::class.java)
            intent.putExtra("username", username)
            intent.putExtra("character", character)
            intent.putExtra("moralityValue", moralityValue)
            startActivity(intent)
        }

        val button3: Button = findViewById(R.id.button3)
        button3.setOnClickListener {
            moralityValue=0
            //change the value of counter
            moralityValue+=15
            // Navigate to the next screen
            val intent = Intent(this, Stage2::class.java)
            intent.putExtra("username", username)
            intent.putExtra("character", character)
            intent.putExtra("moralityValue", moralityValue)
            startActivity(intent)
        }

    }
}