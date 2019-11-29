package com.omarparra.democarpool

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.*
import com.google.android.gms.maps.model.*
import kotlinx.android.synthetic.main.activity_rider_carpool.*
import kotlinx.android.synthetic.main.activity_rider_carpool.view.*

class RiderCarpoolActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    fun setTripClicked(view: View) {

        val intentRiderNotification = Intent(this, RiderNotificationActivity::class.java)
        intentRiderNotification.putExtra("userName",  "employeeName")
        setResult(Activity.RESULT_OK, intentRiderNotification)
        startActivity(intentRiderNotification)

    }

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
        setContentView(R.layout.activity_rider_carpool)

        val employeeDataName: String = intent.getStringExtra("employeeName")
        val employeeDataField: String = intent.getStringExtra("employeeField")

        val employeeName: TextView = findViewById(R.id.employeeName)
        val employeeField: TextView = findViewById(R.id.employeeIdTextView)

        employeeName.setText(employeeDataName)
        employeeField.setText(employeeDataField)


        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap


        // Add a marker in Sydney and move the camera
        val plazaGalerias = LatLng(20.6790942, -103.4391222)
        val tcsDestination = LatLng(20.7258227, -103.4898939)

        mMap.addMarker(MarkerOptions()
            .position(plazaGalerias)
            .title("Origin"))

        mMap.addMarker(MarkerOptions()
            .position(tcsDestination)
            .title("Destination")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)))

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(plazaGalerias, 10.3f))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(tcsDestination, 10.3f))


        val line : Polyline = mMap.addPolyline(
            PolylineOptions()
                .add( plazaGalerias, tcsDestination )
                .width(5.5f)
                .color(Color.BLUE)
                .geodesic(true))

    }


}