package com.example.krahtzquizmaster

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.krahtzquizmaster.databinding.ActivityCategorieBinding
import com.example.krahtzquizmaster.databinding.ActivitySettingsBinding

class SettingsActivity : AppCompatActivity() {

    lateinit var binding: ActivitySettingsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnBack.setOnClickListener{
            val username = intent.extras?.getString("username")

            val intent = Intent(this, CategoryActivity::class.java)
            intent.putExtra("username", username.toString())
            //start navigation
            startActivity(intent)
            finish()
        }

        binding.btnReset.setOnClickListener {

            //Store this result to our shared preference - save the user's result
            //creating an instance of our sharedPref
            val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
            //edit this preference
            val editor = sharedPref.edit()

            val username = intent.extras?.getString("username")
            val resetUser = "Player Name"
            val last_scoregeo = 0
            val last_scoreent = 0
            val last_scoresan = 0

            editor.apply(){
                //adding all values we want to store.
                putString("last_usergeo", resetUser)
                putString("last_userent", resetUser)
                putString("last_usersan", resetUser)
                putInt("last_scoregeo", last_scoregeo)
                putInt("last_scoreent", last_scoreent)
                putInt("last_scoresan", last_scoresan)
                apply()//applying the edit
            }

            val intent = Intent(this, CategoryActivity::class.java)
            intent.putExtra("username", username.toString())
            //start navigation
            startActivity(intent)
            finish()
        }//end of button listener
    }
}