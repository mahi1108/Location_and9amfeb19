package cubex.mahesh.location_and9amfeb19

import android.content.Context
import android.location.Location
import android.location.LocationListener
import android.location.LocationManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var lManager:LocationManager = getSystemService(
            Context.LOCATION_SERVICE) as LocationManager
        lManager.requestLocationUpdates(
            LocationManager.NETWORK_PROVIDER,
            1000L,1f,
            object : LocationListener {
                override fun onLocationChanged(l: Location?) {
                    textView.setText("Lati : ${l?.latitude}")
                    textView2.setText("Lati : ${l?.longitude}")
                }

                override fun onProviderEnabled(p0: String?) {
                    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                }

                override fun onProviderDisabled(p0: String?) {
                    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                }

                override fun onStatusChanged(p0: String?, p1: Int, p2: Bundle?) {
                    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                }

            }
        )
    }
}
