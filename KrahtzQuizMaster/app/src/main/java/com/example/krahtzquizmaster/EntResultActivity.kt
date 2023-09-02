package com.example.krahtzquizmaster

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.krahtzquizmaster.databinding.ActivityResultBinding

class EntResultActivity : AppCompatActivity() {

    lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //username
        val username = intent.extras?.getString("username")
        //amount of questions
        val totalQuestions = intent.extras?.getInt("totalQuestions", 0)
        //score
        var userScore = intent.extras?.getInt("userScore", 0)

        //Update our UI
        binding.tvPlayername.text = username.toString()
        binding.tvResultscore.text = userScore.toString() + "/" + totalQuestions.toString()
        if (userScore != null) {
            if (userScore > 2){
                binding.imgPass.setImageResource(R.drawable.celebration)
                binding.tvMessage.text = "Well Done!!"
            } else {
                binding.imgPass.setImageResource(R.drawable.fail)
                binding.tvMessage.text = "Better Luck Next Time!"
            }
        }


        //Store this result to our shared preference - save the user's result
        //creating an instance of our sharedPref
        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
        //edit this preference
        val lastScore = sharedPref.getInt("last_scoreent", 0)
        Log.d("AAA Last High Score: ", lastScore.toString())
        if (lastScore < userScore!!){
            val editor = sharedPref.edit()

            editor.apply(){
                //adding all values we want to store.
                putString("last_userent", username)
                putInt("last_scoreent", userScore!!)
                apply()//applying the edit
            }
        }

        //Btn Nav:
        binding.btnHome.setOnClickListener{
            finish() //closes my result activity to go back to home still in stack.
        }

        binding.btnTryAgain.setOnClickListener{
            val intent = Intent(this, EntQuestionActivity::class.java)
            //Pass extra information through to other activity
            intent.putExtra("username", username.toString())
            //start navigation
            startActivity(intent)
            finish()
        }
    }
}