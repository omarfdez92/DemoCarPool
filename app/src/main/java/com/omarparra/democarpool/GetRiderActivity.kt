package com.omarparra.democarpool

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.*

class GetRiderActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    fun getRider(view : View) {

        val intentGo = Intent(android.content.Intent.ACTION_VIEW,
            Uri.parse("https://www.google.com.mx/maps/dir/La+Gran+Plaza,+Avenida+Ignacio+Luis+Vallarta,+La+Gran+Plaza,+Zapopan,+Jalisco/Plaza+Galerias,+Camichines+Vallarta,+45020+Zapopan,+Jal./@20.6752922,-103.4241243,15z/data=!3m1!4b1!4m13!4m12!1m5!1m1!1s0x8428ae89ca8fa38d:0xca5c12d6d9033a64!2m2!1d-103.4050574!2d20.6737999!1m5!1m1!1s0x8428aebfc5557a11:0x3bc65e1dc0724879!2m2!1d-103.4303674!2d20.6790747"))
        startActivity(intentGo)

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
        setContentView(R.layout.activity_get_rider)

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
