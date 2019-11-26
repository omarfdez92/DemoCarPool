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
 * @date 11/26/19
 */


class BusAdapter(context : Context, buses : List<Buses>) : BaseAdapter() {

    val context = context
    val buses = buses

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val busView : View
        val holder : ViewHolder

        if (convertView == null){

            //get the category view from the xml file
            busView = LayoutInflater.from(context).inflate(R.layout.buses_list_item, null)
            holder = ViewHolder()
            //holder have references to the ids
            holder.busImage = busView.findViewById(R.id.busImage)
            holder.busName = busView.findViewById(R.id.busName)
            holder.busLocation = busView.findViewById(R.id.busStartLocation)

            busView.tag = holder

        }else{

            holder = convertView.tag as ViewHolder
            busView = convertView

        }

        val bus = buses[position]
        val resourceId  = context.resources.getIdentifier(bus.image, "drawable", context.packageName)
        holder.busImage?.setImageResource(resourceId)
        holder.busName?.text = bus.name
        holder.busLocation?.text = "Starting from ${bus.startLocation}"

        return busView
    }

    override fun getItem(position: Int): Any {
        return buses[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return buses.count()
    }

    private class ViewHolder {
        var busImage : ImageView? = null
        var busName : TextView? = null
        var busLocation : TextView? = null
    }

}