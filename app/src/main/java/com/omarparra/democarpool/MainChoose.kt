package com.omarparra.democarpool

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainChoose : AppCompatActivity() {

    fun driverClicked(view: View){

        val intentDriver = Intent(this, OptionActivity::class.java)
        intentDriver.putExtra("option123", "Driver")
        startActivity(intentDriver)

    }

    fun riderBtn(view: View){

        val intentRider = Intent(this, OptionActivity::class.java)
        intentRider.putExtra("option123", "Rider")
        startActivity(intentRider)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_choose)
    }
}
