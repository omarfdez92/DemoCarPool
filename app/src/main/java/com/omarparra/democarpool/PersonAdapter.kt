package com.omarparra.democarpool

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

/**
 * @author Ing. Omar Parra
 * @date 11/7/19
 */


class PersonAdapter(context : Context, employees : List<Persons>) : BaseAdapter() {

    val context = context
    val employees = employees

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val employeeView : View
        val holder : ViewHolder

        if (convertView == null){

            //get the category view from the xml file
            employeeView = LayoutInflater.from(context).inflate(R.layout.persons_list_item, null)
            holder = ViewHolder()
            //holder have references to the ids
            holder.employeeImage = employeeView.findViewById(R.id.employeeImage)
            holder.employeeName = employeeView.findViewById(R.id.employeeName)
            holder.employeeField = employeeView.findViewById(R.id.employeeField)

            employeeView.tag = holder

        }else{

            holder = convertView.tag as ViewHolder
            employeeView = convertView

        }

        val employee = employees[position]
        val resourceId  = context.resources.getIdentifier(employee.image, "drawable", context.packageName)
        holder.employeeImage?.setImageResource(resourceId)
        holder.employeeName?.text = employee.name
        holder.employeeField?.text = "Starting from ${employee.tcsLocation}"

        return employeeView
    }

    override fun getItem(position: Int): Any {
        return employees[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return employees.count()
    }

    private class ViewHolder {
        var employeeImage : ImageView? = null
        var employeeName : TextView? = null
        var employeeField : TextView? = null
    }

}