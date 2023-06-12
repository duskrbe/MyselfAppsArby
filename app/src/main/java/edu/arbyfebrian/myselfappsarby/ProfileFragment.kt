package edu.arbyfebrian.myselfappsarby

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapView
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import edu.arbyfebrian.myselfappsarby.databinding.FragmentProfileBinding
import android.app.Dialog
import edu.arbyfebrian.myselfappsarby.databinding.DialogAboutBinding
//10 Juni 2023
//10120241
//Arby Febrian Saputro
//IF-6
class ProfileFragment : Fragment(){

    private lateinit var binding: FragmentProfileBinding
    private lateinit var googleMap: GoogleMap

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProfileBinding.inflate(inflater, container, false)
        val view = binding.root

        val profileImageView: ImageView = binding.profileImageView
        val descriptionTextView: TextView = binding.descriptionTextView
        val callImageView: ImageView = binding.callImageView
        val emailImageView: ImageView = binding.emailImageView
        val whatsappImageView: ImageView = binding.whatsappImageView
        val instagramImageView: ImageView = binding.instagramImageView
        val findMeButton: Button = binding.findMeButton
//        val mapView: MapView = binding.mapView

        // Set profile image
        profileImageView.setImageResource(R.drawable.profile_picture_1)

        // Set description
        descriptionTextView.text = "10120241-Arby Febrian Saputro-IF6. Seorang Mahasiswa Teknik Informatika."


        // Handle call button click
        callImageView.setOnClickListener {
            val phoneNumber = "+6287716780948"
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
            startActivity(intent)
        }

        // Handle email button click
        emailImageView.setOnClickListener {
            val emailAddress = "arbyfebrians18@gmail.com"
            val intent = Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:$emailAddress"))
            startActivity(intent)
        }

        // Handle WhatsApp button click
        whatsappImageView.setOnClickListener {
            val phoneNumber = "+6287716780948"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://api.whatsapp.com/send?phone=$phoneNumber"))
            startActivity(intent)
        }

        // Handle Instagram button click
        instagramImageView.setOnClickListener {
            val instagramUrl = "https://www.instagram.com/duskrbe"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(instagramUrl))
            startActivity(intent)
        }

        // Handle Find Me button click
        findMeButton.setOnClickListener {
            val latitude = -6.92516
            val longitude = 107.64090
            val label = "Lokasi Saya"
            val uri = Uri.parse("geo:$latitude,$longitude?q=$latitude,$longitude($label)")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }

        val aboutButton: Button = view.findViewById(R.id.aboutButton)
        aboutButton.setOnClickListener {
            showAboutDialog()
        }


//        // Initialize and set up the map view
//        mapView.onCreate(savedInstanceState)
//        mapView.getMapAsync(this)

        return view
    }
    private fun showAboutDialog() {
        val aboutDialog = AboutDialog()
        aboutDialog.show(parentFragmentManager, "AboutDialog")
    }



//    override fun onMapReady(map: GoogleMap) {
//        googleMap = map
//
//        // Set initial location
//        val initialLocation = LatLng(-6.123456, 106.123456)
//        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(initialLocation, 15f))
//
//        // Add marker
//        val markerOptions = MarkerOptions()
//            .position(initialLocation)
//            .title("Lokasi Saya")
//        googleMap.addMarker(markerOptions)
//    }
//
//    override fun onResume() {
//        super.onResume()
//        binding.mapView.onResume()
//    }
//
//    override fun onPause() {
//        super.onPause()
//        binding.mapView.onPause()
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        binding.mapView.onDestroy()
//    }
//
//    override fun onLowMemory() {
//        super.onLowMemory()
//        binding.mapView.onLowMemory()
//    }
}
