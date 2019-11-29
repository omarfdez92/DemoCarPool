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

class TataBusDetailActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    fun setBusTrip ( view: View ) {

        val intentMap = Intent(android.content.Intent.ACTION_VIEW,
            Uri.parse("https://www.google.com.mx/maps/dir/20.7383732,-103.4037342/Tata+Consultancy+Services,+Av.+Paseo+del+Nte.+4495B,+Technology+Park,+45222+Zapopan,+Jal.,+M%C3%A9xico/@20.7284114,-103.4812865,13z/data=!3m1!4b1!4m8!4m7!1m0!1m5!1m1!1s0x8428a88d1e3e22e7:0xb7d1adb6289278aa!2m2!1d-103.4877052!2d20.7258177"))
        startActivity(intentMap)
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
        val periNorte = LatLng(20.7383732, -103.4037342)
        val tcsDestination = LatLng(20.6679447, -103.4479108)

        mMap.addMarker(MarkerOptions()
            .position(periNorte)
            .title("Origin"))

        mMap.addMarker(MarkerOptions()
            .position(tcsDestination)
            .title("Destination")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)))

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(periNorte, 10.3f))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(tcsDestination, 10.3f))


        val line : Polyline = mMap.addPolyline(
            PolylineOptions()
                .add( periNorte, tcsDestination )
                .width(5.5f)
                .color(Color.BLUE)
                .geodesic(true))
    }
}
