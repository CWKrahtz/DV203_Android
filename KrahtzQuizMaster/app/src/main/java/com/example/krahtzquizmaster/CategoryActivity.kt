package com.example.krahtzquizmaster

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.krahtzquizmaster.models.Constants.allQuestions
import com.example.krahtzquizmaster.models.Constants.getAllQuestions

class CategoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categorie)

        getAllQuestions() //Call to create questions
        val listOfQuestions = allQuestions //Create an instance of our questions

        Log.d("AAA First Question", listOfQuestions[0].questionText)

    }
}