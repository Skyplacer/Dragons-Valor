package com.example.labexam03

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ResultsViewModel : ViewModel() {
    // Define MutableLiveData properties for the data
    private val _playerName = MutableLiveData<String>().apply { value = "Test" }
    private val _characterName = MutableLiveData<String>().apply { value = "Test" }
    private val _moralityValue = MutableLiveData<Int>().apply { value = 0 }
    private val _ending = MutableLiveData<String>().apply { value = "Test" }

    // Expose LiveData properties
    val playerName: LiveData<String> = _playerName
    val characterName: LiveData<String> = _characterName
    val moralityValue: LiveData<Int> = _moralityValue
    val ending: LiveData<String> = _ending

    // Functions to update MutableLiveData
    fun setPlayerName(name: String) {
        _playerName.value = name
    }

    fun setCharacterName(name: String) {
        _characterName.value = name
    }

    fun setMoralityValue(value: Int) {
        _moralityValue.value = value
    }

    fun setEnding(ending: String) {
        _ending.value = ending
    }
}