package com.jsquaredstudios.ladigue

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jsquaredstudios.ladigue.databinding.ActivityMainBinding
import com.jsquaredstudios.ladigue.databinding.ActivityVinsBinding

class MainActivity : AppCompatActivity() {

    // Setting up Binding
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Functions
        carteClick()
        vinsClick()
        contactClick()

        instagramClick()
        facebookClick()
        tripAdvisorClick()
        phoneCall()
        addressClick()
    }

    //Button Clicks
    private fun carteClick() {
        binding.BTCarte.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }
    }

    private fun vinsClick() {
        binding.BTVins.setOnClickListener {
            val intent = Intent(this, VinsActivity::class.java)
            startActivity(intent)
        }
    }

    private fun contactClick() {
        binding.BTContact.setOnClickListener {
            val intent = Intent(this, ContactActivity::class.java)
            startActivity(intent)
        }
    }



    //Text Clicks

    private fun instagramClick() {
        binding.iconInsta.setOnClickListener {
            val url = "https://www.instagram.com/ladiguedevillers/"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }
    }

    private fun facebookClick() {
        binding.iconFacebook.setOnClickListener {
            val url = "https://www.facebook.com/La-Digue-de-Villers-136113353120519"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }
    }

    private fun tripAdvisorClick() {
        binding.iconTrip.setOnClickListener {
            val url = "https://www.tripadvisor.fr/Restaurant_Review-g1079380-d1035488-Reviews-La_Digue_de_Villers-Villers_sur_Mer_Deauville_Calvados_Basse_Normandie_Normandy.html"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }
    }

    private fun phoneCall() {
        binding.TVPhone.setOnClickListener {
            val number = "+33231886147"
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:$number")
            startActivity(intent)
        }
    }

    private fun addressClick() {
        binding.TVLocation.setOnClickListener {
            val url = "https://www.google.com/maps/place/La+Digue+de+Villers/@49.3299738,0.007392,17z/data=!3m1!4b1!4m5!3m4!1s0x47e1d57a1f745c7f:0x40a7c427a34d40ba!8m2!3d49.3300198!4d0.0095268"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }
    }



}