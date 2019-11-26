package com.omarparra.democarpool

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class TataBusDetailActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap


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
        setContentView(R.layout.activity_tata_bus_detail)

        val busDataName: String = intent.getStringExtra("busName")
        val busDataLocation: String = intent.getStringExtra("busLocation")

        val busName: TextView = findViewById(R.id.busName)
        val busLocation: TextView = findViewById(R.id.busStartLocation)

        busName.setText(busDataName)
        busLocation.setText(busDataLocation)

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
    }
}
