package com.jsquaredstudios.ladigue

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jsquaredstudios.ladigue.databinding.ActivityContactBinding

class ContactActivity : AppCompatActivity() {

    private lateinit var binding: ActivityContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Functions
        backArrow()
        phoneClick()
        addressClick()
    }

    //Back Button Clicker
    private fun backArrow() {
        binding.IVBackArrow.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    // Phone and Address Clicks

    private fun phoneClick() {
        binding.buttonNumber.setOnClickListener {
            val number = "+33231886147"
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:$number")
            startActivity(intent)
        }

    }

    private fun addressClick() {
        binding.TVActualAddress.setOnClickListener {
            val url = "https://www.google.com/maps/place/La+Digue+de+Villers/@49.3299738,0.007392,17z/data=!3m1!4b1!4m5!3m4!1s0x47e1d57a1f745c7f:0x40a7c427a34d40ba!8m2!3d49.3300198!4d0.0095268"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }
    }
}