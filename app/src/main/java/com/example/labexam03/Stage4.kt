package com.example.labexam03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.lifecycle.ViewModelProvider

class Stage4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stage4)

        // Retrieve the username, character and moralityValue from the intent extras
        var username = intent.getStringExtra("username")
        var character = intent.getStringExtra("character")
        var moralityValue = intent.getIntExtra("moralityValue", 0)

        val button1: Button = findViewById(R.id.button10)
        button1.setOnClickListener {
            //change the value of counter
            moralityValue += 3
            // Navigate to the next screen depending on counter
            if(moralityValue>=21){
                val intent = Intent(this, GoodEnding::class.java)
                intent.putExtra("username", username)
                intent.putExtra("character", character)
                intent.putExtra("moralityValue", moralityValue)
                startActivity(intent)
            }
            else if (moralityValue<=10){
                val intent = Intent(this, BadEnding::class.java)
                intent.putExtra("username", username)
                intent.putExtra("character", character)
                intent.putExtra("moralityValue", moralityValue)
                startActivity(intent)
            }
            else{
                val intent = Intent(this, NeutralEnding::class.java)
                intent.putExtra("username", username)
                intent.putExtra("character", character)
                intent.putExtra("moralityValue", moralityValue)
                startActivity(intent)
            }

        }

        val button2: Button = findViewById(R.id.button11)
        button2.setOnClickListener {
            //change the value of counter
            moralityValue -= 4
            // Navigate to the next screen depending on counter
            if(moralityValue>=21){
                val intent = Intent(this, GoodEnding::class.java)
                intent.putExtra("username", username)
                intent.putExtra("character", character)
                intent.putExtra("moralityValue", moralityValue)
                startActivity(intent)
            }
            else if (moralityValue<=10){
                val intent = Intent(this, BadEnding::class.java)
                intent.putExtra("username", username)
                intent.putExtra("character", character)
                intent.putExtra("moralityValue", moralityValue)
                startActivity(intent)
            }
            else{
                val intent = Intent(this, NeutralEnding::class.java)
                intent.putExtra("username", username)
                intent.putExtra("character", character)
                intent.putExtra("moralityValue", moralityValue)
                startActivity(intent)
            }
        }

        val button3: Button = findViewById(R.id.button12)
        button3.setOnClickListener {
            //change the value of counter
            moralityValue+=1
            // Navigate to the next screen depending on counter
            if(moralityValue>=21){
                val intent = Intent(this, GoodEnding::class.java)
                intent.putExtra("username", username)
                intent.putExtra("character", character)
                intent.putExtra("moralityValue", moralityValue)
                startActivity(intent)
            }
            else if (moralityValue<=10){
                val intent = Intent(this, BadEnding::class.java)
                intent.putExtra("username", username)
                intent.putExtra("character", character)
                intent.putExtra("moralityValue", moralityValue)
                startActivity(intent)
            }
            else{
                val intent = Intent(this, NeutralEnding::class.java)
                intent.putExtra("username", username)
                intent.putExtra("character", character)
                intent.putExtra("moralityValue", moralityValue)
                startActivity(intent)
            }
        }

    }
}