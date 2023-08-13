package com.example.krahtzquizmaster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.RadioButton
import android.widget.Toast
import com.example.krahtzquizmaster.databinding.ActivityQuestionBinding
import com.example.krahtzquizmaster.models.Constants.allQuestions
import com.example.krahtzquizmaster.models.Constants.geoQuestions
import com.example.krahtzquizmaster.models.Constants.getAllQuestions

class QuestionActivity : AppCompatActivity() {

    //binding class generated by our viewBinding feature
    lateinit var binding: ActivityQuestionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //inflating our layout from the binding class and setting it to our content
        binding = ActivityQuestionBinding.inflate(layoutInflater)
        val view = binding.root
        //setContentView divines which xml layout to use as my frontend
        setContentView(view)

        val username = intent?.getStringExtra("username")
        Log.d("AAA Welcome: ", username.toString())
        //Set default value to one
        val questionNumber = intent.extras?.getInt("questionNumber", 1)
        var userScore = 0

        //If first question, get all the questions if not then don't get
        if (questionNumber == 1){
            //TODO: Clear the questions whenever we start the activity again.
            //Call to create questions
            getAllQuestions()
        }
        //Create an instance of our question
        val listOfGeoQuestions = geoQuestions //Create an instance of our geo questions

        val currentQuestion = listOfGeoQuestions[questionNumber !!- 1] // -1 for the index

        //Update questions
        binding.username.title = "$username"
        binding.tvQuestion.text = currentQuestion.questionText

        binding.ivIcon.setImageResource(currentQuestion.icon)

        binding.rbOptionOne.text = currentQuestion.option1
        binding.rbOptionTwo.text = currentQuestion.option2
        binding.rbOptionThree.text = currentQuestion.option3

        binding.pbProgress.progress = currentQuestion.id
        binding.tvProgress.text = "${questionNumber}/${listOfGeoQuestions.count()}"

        //user click next
        binding.btnNext.setOnClickListener{
            var selectedAnswer: Int = binding.rgOptions.checkedRadioButtonId //The answer the user selected based of the radio group
            //Log.d("AAA Selected ID: ", selectedAnswer.toString())

            //Check is the user has selected an answer
            if (selectedAnswer != -1){
                //TODO: Check if the user checked the correct answer
                var selectedAnswerValue = findViewById<RadioButton>(selectedAnswer)
//                Log.d("AAA Answer Selected: ", selectedAnswerValue.text.toString())

                if (selectedAnswerValue.text == currentQuestion.correctAnswer){
                    //Update user score
                    userScore += 1
                }

                //Navigate to the next question
                val intent = Intent(this, QuestionActivity::class.java)
                intent.putExtra("questionNumber", questionNumber+1)

                //TODO: Pass user's score
                startActivity(intent)
                finish()

                //TODO:Check if it is thelast question, then navigate to result screen

            }else{
                Toast.makeText(this, "Please Select An Option",Toast.LENGTH_LONG).show()
            }
        }

    }
}