package com.omarparra.democarpool

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    fun loginClicked(view: View){

        /*val email = employeeIdTextView.text.toString()
        val password = passwordText.text.toString()

        if(email.isEmpty() && password.isEmpty()){

            Toast.makeText(this, "PLEASE FILL ALL THE FIELDS", Toast.LENGTH_SHORT).show()

        }else if(email == "1688534" && password == "abc123"){*/

            val intentWelcome = Intent(this,  WelcomeActivity::class.java)
            startActivity(intentWelcome)

        /*}else{

            Toast.makeText(this, "WRONG EMAIL OR PASSWORD", Toast.LENGTH_SHORT).show()

        }*/

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
