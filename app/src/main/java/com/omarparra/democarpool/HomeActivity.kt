package com.omarparra.democarpool

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    fun carpoolSelected (view : View) {

        val intentCarpoolOption = Intent(this, MainChoose::class.java)
        startActivity(intentCarpoolOption)

    }

    fun tataBusSelected (view : View) {

        //add tata bus task

    }

    fun parkingLotSelected (view : View) {

        //add parking lot task

    }

    fun goHomeBtn(view : View) {

        val intentHome = Intent(this, WelcomeActivity::class.java)
        startActivity(intentHome)

    }

    fun goFrescoBtn (view : View) {

        val intentFresco = Intent(this, FrescoActivity::class.java)
        startActivity(intentFresco)
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }
}
