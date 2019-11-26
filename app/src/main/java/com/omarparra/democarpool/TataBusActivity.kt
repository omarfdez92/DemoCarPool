package com.omarparra.democarpool

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_tata_bus.*

class TataBusActivity : AppCompatActivity() {

    lateinit var adapter : BusAdapter

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
        setContentView(R.layout.activity_tata_bus)

        adapter = BusAdapter(this, DataService.buses)
        listViewBuses.adapter = adapter

        listViewBuses.setOnItemClickListener { parent, view, position, id ->
            val bus = DataService.buses[position]

            val intentBusCarpool = Intent(this, TataBusDetailActivity::class.java)
            intentBusCarpool.putExtra("busName", bus.name)
            intentBusCarpool.putExtra("busLocation", bus.startLocation)
            startActivity(intentBusCarpool)

        }
    }
}
