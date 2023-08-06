package com.example.krahtzquizmaster.models

object Constants {

    //array for all of our questions
    var allQuestions = ArrayList<Question>()

    //functions to populate our questions
    fun getAllQuestions(){
        //Defined Questions
        val que1 = Question(
            1,
            "Question 1 Text.",
            "Option 1",
            "Option 2",
            "Option 3",
            "Option 4",
            "Option 1"
        )
        val que2 = Question(
            id = 1,
            questionText = "Question 2 Text.",
            option1 = "Option 1",
            option2 = "Option 2",
            option3 = null,
            option4 = null,
            correctAnswer = "Option 2"
        )
        //Add defined questions to array
        allQuestions.add(que1)
        allQuestions.add(que2)

    }

}