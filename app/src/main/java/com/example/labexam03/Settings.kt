package com.example.labexam03

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup

class Settings : AppCompatActivity() {

    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        // Get SharedPreferences instance
        sharedPreferences = getSharedPreferences("Settings", Context.MODE_PRIVATE)

        // Initialize radio groups and set their listeners
        initAppearanceSettings()
        initNotificationSettings()
        initLanguageSettings()

        // Load saved preferences and update UI
        loadSavedPreferences()
    }

    private fun initAppearanceSettings() {
        val radioGroupAppearance = findViewById<RadioGroup>(R.id.radioGroup1)
        radioGroupAppearance.setOnCheckedChangeListener { _, checkedId ->
            val editor = sharedPreferences.edit()
            val radioButton = findViewById<RadioButton>(checkedId)
            val appearance = radioButton.text.toString()
            editor.putString("appearance", appearance)
            editor.apply()
        }
    }

    private fun initNotificationSettings() {
        val radioGroupNotification = findViewById<RadioGroup>(R.id.radioGroup2)
        radioGroupNotification.setOnCheckedChangeListener { _, checkedId ->
            val editor = sharedPreferences.edit()
            val radioButton = findViewById<RadioButton>(checkedId)
            val notificationStatus = radioButton.text.toString()
            editor.putString("notificationStatus", notificationStatus)
            editor.apply()
        }
    }

    private fun initLanguageSettings() {
        val radioGroupLanguage = findViewById<RadioGroup>(R.id.radioGroup3)
        radioGroupLanguage.setOnCheckedChangeListener { _, checkedId ->
            val editor = sharedPreferences.edit()
            val radioButton = findViewById<RadioButton>(checkedId)
            val language = radioButton.text.toString()
            editor.putString("language", language)
            editor.apply()
        }
    }

    private fun loadSavedPreferences() {
        val savedAppearance = sharedPreferences.getString("appearance", "")
        val savedNotificationStatus = sharedPreferences.getString("notificationStatus", "")
        val savedLanguage = sharedPreferences.getString("language", "")

        // Find the radio button corresponding to the saved preference and check it
        findRadioButtonByText(R.id.radioGroup1, savedAppearance)?.isChecked = true
        findRadioButtonByText(R.id.radioGroup2, savedNotificationStatus)?.isChecked = true
        findRadioButtonByText(R.id.radioGroup3, savedLanguage)?.isChecked = true
    }

    private fun findRadioButtonByText(groupId: Int, text: String?): RadioButton? {
        val radioGroup = findViewById<RadioGroup>(groupId)
        val count = radioGroup.childCount
        for (i in 0 until count) {
            val radioButton = radioGroup.getChildAt(i) as? RadioButton
            if (radioButton?.text == text) {
                return radioButton
            }
        }
        return null
    }
}