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

        val intentTataBus = Intent(this,TataBusActivity::class.java)
        startActivity(intentTataBus)

    }

    fun parkingLotSelected (view : View) {

        val intentParkingLot = Intent(this, ParkingLotActivity::class.java)
        startActivity(intentParkingLot)

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
