package com.omarparra.democarpool

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {

    fun goFrescoClick(view : View) {

        val intentFresco = Intent(this, FrescoActivity::class.java)
        startActivity(intentFresco)

    }

    fun continueOnClick(view : View) {

        val intentMainChoose = Intent(this, HomeActivity::class.java)
        startActivity(intentMainChoose)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

    }
}
