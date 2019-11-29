package com.omarparra.democarpool

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_option.*

class CarpoolRequestActivity : AppCompatActivity() {

    lateinit var adapter : PersonAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carpool_request)

        adapter = PersonAdapter(this, DataService.employees)
        listViewOptions.adapter = adapter



        listViewOptions.setOnItemClickListener { parent, view, position, id ->
            val employee = DataService.employees[position]

            val intentGetRider = Intent(this, GetRiderActivity::class.java)
            intentGetRider.putExtra("employeeName", employee.name)
            intentGetRider.putExtra("employeeField", employee.tcsLocation)
            startActivity(intentGetRider)

        }

    }
}
