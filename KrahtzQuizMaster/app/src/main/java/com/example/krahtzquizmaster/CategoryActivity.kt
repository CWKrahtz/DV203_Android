package com.example.krahtzquizmaster

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.krahtzquizmaster.databinding.ActivityCategorieBinding
//import com.example.krahtzquizmaster.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

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
        binding.username.title = "$username"

        //TODO: Check when user clicks on Geo Category
        binding.cvGeoCard.setOnClickListener {
            //TODO: Navigate to GeoQuestion Activity
            val intent = Intent(this, QuestionActivity::class.java)
            //Pass extra information through to other activity
            intent.putExtra("username", username.toString())
            //start navigation
            startActivity(intent)
        }//end of button listener

        binding.cvEntCard.setOnClickListener {
            //TODO: Navigate to EntQuestion Activity
            val intent = Intent(this, EntQuestionActivity::class.java)
            //Pass extra information through to other activity
            intent.putExtra("username", username.toString())
            //start navigation
            startActivity(intent)
        }//end of button listener

        binding.cvScienceCard.setOnClickListener {
            //TODO: Navigate to EntQuestion Activity
            val intent = Intent(this, ScienceQuestionActivity::class.java)
            //Pass extra information through to other activity
            intent.putExtra("username", username.toString())
            //start navigation
            startActivity(intent)
        }//end of button listener

        //TODO: view last user score
        binding.fabLastscoregeo.setOnClickListener{
            val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
            //get The value stored
            val lastUser = sharedPref.getString("last_usergeo", "No user found")
            val lastScore = sharedPref.getInt("last_scoregeo", 0)

            Log.d("AAA  Lsat user from Storage", lastUser + lastScore.toString())

            //displaying the score with a snackBar
            val snack = Snackbar.make(it, lastUser!!, Snackbar.LENGTH_SHORT)
            snack.setAction(lastScore.toString(), View.OnClickListener {
                //nothing
            })
            snack.show()
        }

        //TODO: view last user score
        binding.fabLastscoreent.setOnClickListener{
            val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
            //get The value stored
            val lastUser = sharedPref.getString("last_userent", "No user found")
            val lastScore = sharedPref.getInt("last_scoreent", 0)

            Log.d("AAA  Lsat user from Storage", lastUser + lastScore.toString())

            //displaying the score with a snackBar
            val snack = Snackbar.make(it, lastUser!!, Snackbar.LENGTH_SHORT)
            snack.setAction(lastScore.toString(), View.OnClickListener {
                //nothing
            })
            snack.show()
        }

        //TODO: view last user score
        binding.fabLastscoresan.setOnClickListener{
            val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
            //get The value stored
            val lastUser = sharedPref.getString("last_usersan", "No user found")
            val lastScore = sharedPref.getInt("last_scoresan", 0)

            Log.d("AAA  Lsat user from Storage", lastUser + lastScore.toString())

            //displaying the score with a snackBar
            val snack = Snackbar.make(it, lastUser!!, Snackbar.LENGTH_SHORT)
            snack.setAction(lastScore.toString(), View.OnClickListener {
                //nothing
            })
            snack.show()
        }

        binding.btnSetting.setOnClickListener{
            val intent = Intent(this, SettingsActivity::class.java)
            //Pass extra information through to other activity
            intent.putExtra("username", username.toString())
            //start navigation
            startActivity(intent)
        }
    }// end of onCreate function
}