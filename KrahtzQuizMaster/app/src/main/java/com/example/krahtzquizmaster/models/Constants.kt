package com.example.krahtzquizmaster.models

import com.example.krahtzquizmaster.R

object Constants {

    //array for all of our questions
    var geoQuestions = ArrayList<Question>()
    var entQuestions = ArrayList<Question>()
    var sanQuestions = ArrayList<Question>()

    //Function Clear all questions
    fun clearAllQuestions() {
        geoQuestions.clear()
        entQuestions.clear()
        sanQuestions.clear()
    }

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

        val que6 = Question(
            1,
            "Which country is Scandinavian political drama Borgen set in?",
            R.drawable.foreground,
            "Sweden",
            "Norway",
            "Denmark",
            "Denmark"
        )
        val que7 = Question(
            2,
            "Queen guitarist Brian May has a PHD in English Literature.",
            R.drawable.foreground,
            "True",
            "False",
            null,
            "False"
        )
        val que8 = Question(
            3,
            "Who did not play the villian Two-Face in the Batman movies?",
            R.drawable.foreground,
            "Tommy Lee Jones",
            "Aaron Eckhart",
            "Val Kilmer",
            "Val Kilmer"
        )
        val que9 = Question(
            4,
            "The buttons on a man's shirt are usually on the right.",
            R.drawable.foreground,
            "True",
            "False",
            null,
            "True"
        )
        val que10 = Question(
            5,
            "Which is not a Frank Zappa album",
            R.drawable.foreground,
            "The Grand Wazoo",
            "Zoot Allures",
            "Everybody Sunshine",
            "Everybody Sunshine"
        )

        val que11 = Question(
            1,
            "When a white-tail deer points its tail upwards, it signifies that...",
            R.drawable.foreground,
            "It sense danger",
            "It is angry",
            "It is ready to mate",
            "It sense danger"
        )
        val que12 = Question(
            2,
            "When you see a rainbow, where is the sun?",
            R.drawable.foreground,
            "Behind you",
            "In front of you",
            "Directly above you",
            "Behind you"
        )
        val que13 = Question(
            3,
            "Which of the following animals give birth instead of laying eggs?",
            R.drawable.foreground,
            "Whale",
            "Ostrich",
            "Platypus",
            "Whale"
        )
        val que14 = Question(
            4,
            "Which is not a celestial body?",
            R.drawable.foreground,
            "White Dwarf",
            "Red Giant",
            "Pink Star",
            "Pink Star"
        )
        val que15 = Question(
            5,
            "The number 500 is expressed with which Roman numeral?",
            R.drawable.foreground,
            "M",
            "D",
            "C",
            "D"
        )
        //Add defined questions to array
        geoQuestions.add(que1)
        geoQuestions.add(que2)
        geoQuestions.add(que3)
        geoQuestions.add(que4)
        geoQuestions.add(que5)

        entQuestions.add(que6)
        entQuestions.add(que7)
        entQuestions.add(que8)
        entQuestions.add(que9)
        entQuestions.add(que10)

        sanQuestions.add(que11)
        sanQuestions.add(que12)
        sanQuestions.add(que13)
        sanQuestions.add(que14)
        sanQuestions.add(que15)
    }

}