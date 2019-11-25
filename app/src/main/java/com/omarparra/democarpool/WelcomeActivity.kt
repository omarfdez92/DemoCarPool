package com.omarparra.democarpool

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class WelcomeActivity : AppCompatActivity() {

    fun continueOnClick(view : View) {

        val intentMainChoose = Intent(this, MainChoose::class.java)
        startActivity(intentMainChoose)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
    }
}
