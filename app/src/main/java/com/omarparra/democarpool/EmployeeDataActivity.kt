package com.omarparra.democarpool

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.net.Uri




class EmployeeDataActivity : AppCompatActivity() {

    fun acceptBtnClick(view: View) {

        val mapIntent = Intent(
            android.content.Intent.ACTION_VIEW,
            Uri.parse("https://www.google.com/maps/dir/Tata+Consultancy+Services,+Av.+Paseo+del+Nte.+4495B,+Technology+Park,+45222+Zapopan,+Jal.,+México/Plaza+Galerias,+Camichines+Vallarta,+Zapopan,+Jalisco")
        )
        startActivity(mapIntent)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employee_data)

        val employeeDataName = intent.getStringExtra("employeeName")
        val employeeDataField = intent.getStringExtra("employeeField")

        val employeeName : TextView = findViewById(R.id.employeeName)
        val employeeField : TextView = findViewById(R.id.employeeField)

        employeeName.setText(employeeDataName)
        employeeField.setText(employeeDataField)



    }
}
