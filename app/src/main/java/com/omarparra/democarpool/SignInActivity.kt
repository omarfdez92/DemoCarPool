package com.omarparra.democarpool

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class SignInActivity : AppCompatActivity() {

    fun inProcess (view : View){

        Toast.makeText(this, "IN PROCESS. . .", Toast.LENGTH_SHORT).show()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
    }
}
