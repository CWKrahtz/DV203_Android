package com.example.krahtzquizmaster

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.krahtzquizmaster.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //TODO: get
        //username
        val username = intent.extras?.getString("username")
        //amount of questions
        val totalQuestions = intent.extras?.getInt("totalQuestions", 0)
        //score
        var userScore = intent.extras?.getInt("userScore", 0)

        //Update our UI
        binding.tvPlayername.text = username.toString()
        binding.tvResultscore.text = userScore.toString() + "/" + totalQuestions.toString()

        //Store this result to our shared preference - save the user's result
        //creating an instance of our sharedPref
        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
        //edit this preference
        val editor = sharedPref.edit()

        editor.apply(){
            //adding all values we want to store.
            putString("last_user", username)
            putInt("last_score", userScore!!)
            apply()//applying the edit
        }

    }
}