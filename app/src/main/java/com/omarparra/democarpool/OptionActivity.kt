package com.omarparra.democarpool

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_option.*
import kotlinx.android.synthetic.main.activity_option.listViewBuses
import kotlinx.android.synthetic.main.activity_tata_bus.*

class OptionActivity : AppCompatActivity() {

    lateinit var adapter : PersonAdapter
    lateinit var adapter1 : BusAdapter

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
        setContentView(R.layout.activity_option)

        adapter = PersonAdapter(this, DataService.employees)
        listViewOptions.adapter = adapter



        listViewOptions.setOnItemClickListener { parent, view, position, id ->
            val employee = DataService.employees[position]

            val intentRiderCarpool = Intent(this, RiderCarpoolActivity::class.java)
            intentRiderCarpool.putExtra("employeeName", employee.name)
            intentRiderCarpool.putExtra("employeeField", employee.tcsLocation)
            startActivity(intentRiderCarpool)

        }

        adapter1 = BusAdapter(this, DataService.buses)
        listViewBuses.adapter = adapter1

        listViewBuses.setOnItemClickListener { parent, view, position, id ->
            val bus = DataService.buses[position]

            val intentBusCarpool = Intent(this, TataBusDetailActivity::class.java)
            intentBusCarpool.putExtra("busName", bus.name)
            intentBusCarpool.putExtra("busLocation", bus.startLocation)
            startActivity(intentBusCarpool)

        }

    }
}
