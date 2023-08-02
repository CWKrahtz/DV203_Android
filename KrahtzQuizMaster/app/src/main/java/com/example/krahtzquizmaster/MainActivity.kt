package com.example.krahtzquizmaster

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    //This onCreate, creates my screen/activity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_KrahtzQuizMaster)
        //setContentView divines which xml layout to use as my frontend
        setContentView(R.layout.activity_main)

        //TODO: add our screen's logic (Meaning functionality)
    }
}