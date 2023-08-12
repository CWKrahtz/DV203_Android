package com.example.krahtzquizmaster

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.krahtzquizmaster.models.Constants.allQuestions
import com.example.krahtzquizmaster.models.Constants.geoQuestions
import com.example.krahtzquizmaster.models.Constants.getAllQuestions

class QuestionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        //Call to create questions
        getAllQuestions()
        //Create an instance of our questions
        val listOfAllQuestions = allQuestions //Create an instance of our questions
        val listOfGeoQuestions = geoQuestions //Create an instance of our geo questions

//        Log.d("AAA First Question", listOfAllQuestions[0].questionText)
        Log.d("AAA First Question", listOfGeoQuestions[0].questionText)

    }
}