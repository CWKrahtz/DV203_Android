package com.example.krahtzquizmaster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.krahtzquizmaster.databinding.ActivityCategorieBinding
import com.example.krahtzquizmaster.databinding.ActivityMainBinding

//import android.util.Log
//Question Activity Section
//import com.example.krahtzquizmaster.models.Constants.allQuestions
//import com.example.krahtzquizmaster.models.Constants.getAllQuestions

class CategoryActivity : AppCompatActivity() {

    //TODO: viewBinding
    //binding class generated by our viewBinding feature
    lateinit var binding: ActivityCategorieBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCategorieBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)

        //TODO: Get passed data from previous activity
        val username = intent?.getStringExtra("username")
        //intent?.extras?.getString("username")

        binding.username.title = "$username"
        Log.d("AAA Welcome", username.toString())

        //TODO: Check when user clicks on Geo Category
        binding.cvGeoCard.setOnClickListener {

            //TODO: Navigate to question Activity
            //Define intent navigation
            val intent = Intent(this, QuestionActivity::class.java)

            //Pass extra information through to other activity
            intent.putExtra("username", username.toString())
            //start navigation
            startActivity(intent)
        }//end of button listener

    }// end of onCreate function
}