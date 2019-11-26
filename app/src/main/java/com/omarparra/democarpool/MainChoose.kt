package com.omarparra.democarpool

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainChoose : AppCompatActivity() {

    fun driverSelected(view: View){

        val intentDriver = Intent(this, OptionActivity::class.java)
        intentDriver.putExtra("option123", "Invite a Rider")
        startActivity(intentDriver)

    }

    fun riderSelected(view: View){

        val intentRider = Intent(this, RiderActivity::class.java)
        intentRider.putExtra("option123", "Available Drivers")
        startActivity(intentRider)

    }

    fun goHomeBtn(view : View) {

        val intentHome = Intent(this, HomeActivity::class.java)
        startActivity(intentHome)

    }

    fun goFrescoBtn (view : View) {

        val intentFresco = Intent(this, FrescoActivity::class.java)
        startActivity(intentFresco)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_choose)

    }
}
