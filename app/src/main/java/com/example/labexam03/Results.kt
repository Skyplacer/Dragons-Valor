package com.example.labexam03

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class Results : AppCompatActivity() {

    // Declare a variable to hold the ViewModel
    private lateinit var viewModel: ResultsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)

        // Retrieve the username, character and moralityValue from the intent extras
        var username: String = intent.getStringExtra("username") ?:"null"
        var character: String = intent.getStringExtra("character")?:"null"
        var moralityValue = intent.getIntExtra("moralityValue", 0)
        var ending: String = intent.getStringExtra("ending")?:"null"

        val sharedPreferences = getSharedPreferences("PreviousGames", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()

        editor.putString("username", username)
        editor.putString("character", character)
        editor.putInt("moralityValue", moralityValue)
        editor.putString("ending", ending)

        // Save the details to SharedPreferences
        saveToSharedPreferences(username, character, moralityValue, ending)

        viewModel = ViewModelProvider(this).get(ResultsViewModel::class.java)

        viewModel.setPlayerName(username)
        viewModel.setCharacterName(character)
        viewModel.setMoralityValue(moralityValue)
        viewModel.setEnding(ending)

        // Get references to TextViews
        val textPlayerName: TextView = findViewById(R.id.textView51)
        val textCharacter: TextView = findViewById(R.id.textView52)
        val textMoralityValue: TextView = findViewById(R.id.textView53)
        val textEnding: TextView = findViewById(R.id.textView54)

        // Observe LiveData objects and update UI accordingly
        viewModel.playerName.observe(this, Observer { playerName ->
            textPlayerName.text = playerName
        })

        viewModel.characterName.observe(this, Observer { character ->
            textCharacter.text = character
        })

        viewModel.moralityValue.observe(this, Observer { moralityValue ->
            textMoralityValue.text = moralityValue.toString()
        })

        viewModel.ending.observe(this, Observer { ending ->
            textEnding.text = ending
        })

        // Button click listener to navigate back to Menu activity
        val button3: Button = findViewById(R.id.button3)
        button3.setOnClickListener {
            val intent = Intent(this, Menu::class.java)
            clearCurrentGameData()
            startActivity(intent)
        }
    }
    //function to save previous game results
    private fun saveToSharedPreferences(username: String, character: String, moralityValue: Int, ending: String) {
        val sharedPreferences = getSharedPreferences("PreviousGames", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()

        editor.putString("username", username)
        editor.putString("character", character)
        editor.putInt("moralityValue", moralityValue)
        editor.putString("ending", ending)

        editor.apply()
    }

    // Function to clear current game data from SharedPreferences
    private fun clearCurrentGameData() {
        val sharedPreferences = getSharedPreferences("CurrentGame", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()

        // Clear all data properties for the current game
        editor.clear()
        editor.apply()
    }
}

