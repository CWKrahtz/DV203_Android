package com.example.krahtzquizmaster.models

import com.example.krahtzquizmaster.R

object Constants {

    //array for all of our questions
    var allQuestions = ArrayList<Question>()
    var geoQuestions = ArrayList<Question>()

    //functions to populate our questions
    fun getAllQuestions(){
        //Defined Questions
        val que1 = Question(
            1,
            "Which country is the largest manufacturer of wind turbines and solar panels?",
            R.drawable.foreground,
            "Denmark",
            "China",
            "Spain",
            "China"
        )
        val que2 = Question(
            id = 2,
            questionText = "Greenland is a self-governing territory of Denmark.",
            icon = R.drawable.foreground,
            option1 = "True",
            option2 = "False",
            option3 = null,
            correctAnswer = "True"
        )
        val que3 = Question(
            3,
            "Which of these African countries is not an island nation?",
            R.drawable.foreground,
            "Madagascar",
            "Mauritius",
            "Mozambique",
            "Mozambique"
        )
        val que4 = Question(
            id = 4,
            questionText = "The Sahara is the world's largest hot desert.",
            icon = R.drawable.foreground,
            option1 = "True",
            option2 = "False",
            option3 = null,
            correctAnswer = "True"
        )
        val que5 = Question(
            5,
            "Which country has the westernmost point of mainland Europe?",
            R.drawable.foreground,
            "Ireland",
            "Iceland",
            "Portugal",
            "Portugal"
        )
        //Add defined questions to array
        geoQuestions.add(que1)
        geoQuestions.add(que2)
        geoQuestions.add(que3)
        geoQuestions.add(que4)
        geoQuestions.add(que5)

    }

}