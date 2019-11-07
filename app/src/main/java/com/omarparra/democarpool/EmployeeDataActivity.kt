package com.omarparra.democarpool

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class EmployeeDataActivity : AppCompatActivity() {

    fun acceptBtnClick(view: View){
        /*val intentAcceptBtn = Intent(this, MapActivity::class.java)
        startActivity(intentAcceptBtn)*/
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employee_data)

        val employeeDataName : String = intent.getStringExtra("employeeName")
        val employeeDataField : String = intent.getStringExtra("employeeField")

        val employeeName : TextView = findViewById(R.id.employeeName)
        val employeeField : TextView = findViewById(R.id.employeeField)

        employeeName.setText(employeeDataName)
        employeeField.setText(employeeDataField)

    }
}
