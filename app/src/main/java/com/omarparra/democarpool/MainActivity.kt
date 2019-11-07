package com.omarparra.democarpool

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    fun loginClicked(view: View){

        val email = emailText.text.toString()
        val password = passwordText.text.toString()

        if(email.isEmpty() && password.isEmpty()){

            Toast.makeText(this, "PLEASE FILL ALL THE FIELDS", Toast.LENGTH_SHORT).show()

        }else if(email == "plebes@gmail.com" && password == "abc123"){

            val intentMainChoose = Intent(this, MainChoose::class.java)
            startActivity(intentMainChoose)

        }else{

            Toast.makeText(this, "WRONG EMAIL OR PASSWORD", Toast.LENGTH_SHORT).show()

        }

    }

    fun signInClicked (view: View) {
        val intentSignIn = Intent(this, SignInActivity::class.java)
        startActivity(intentSignIn)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
