package com.omarparra.democarpool

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_option.*

class OptionActivity : AppCompatActivity() {

    lateinit var adapter : PersonAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_option)

        val dataOpt: String = intent.getStringExtra("option123")

        val tittleOpt: TextView = findViewById(R.id.titleOption)

        tittleOpt.setText(dataOpt)

        adapter = PersonAdapter(this, DataService.employees)
        listViewOptions.adapter = adapter

        listViewOptions.setOnItemClickListener { parent, view, position, id ->
            val employee = DataService.employees[position]
            val intentEmployeeData = Intent(this, EmployeeDataActivity::class.java)
            intentEmployeeData.putExtra("employeeName", employee.name)
            intentEmployeeData.putExtra("employeeField", employee.tcsLocation)
            startActivity(intentEmployeeData)


        }

    }
}
