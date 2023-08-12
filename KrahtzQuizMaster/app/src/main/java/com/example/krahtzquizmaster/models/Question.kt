package com.example.krahtzquizmaster.models

//Blueprint for how my question should look like
data class Question(
    val id: Int,
    val questionText: String,
    val icon: Int, //all images should be int
    val option1: String,
    val option2: String,
    val option3: String?, //'?' means this value can be null
    val correctAnswer: String
)

//Side Note: you can have more then one type of data class for your question.
