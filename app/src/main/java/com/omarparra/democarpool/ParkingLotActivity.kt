package com.omarparra.democarpool

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ParkingLotActivity : AppCompatActivity() {

    fun goHomeBtn(view: View) {

        val intentHome = Intent(this, HomeActivity::class.java)
        startActivity(intentHome)

    }

    fun goFrescoBtn(view: View) {

        val intentFresco = Intent(this, FrescoActivity::class.java)
        startActivity(intentFresco)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parking_lot)
    }
}
