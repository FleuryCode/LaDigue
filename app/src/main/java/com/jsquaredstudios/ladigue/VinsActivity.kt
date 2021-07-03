package com.jsquaredstudios.ladigue

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jsquaredstudios.ladigue.databinding.ActivityVinsBinding

class VinsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityVinsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVinsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Click Functions
        backArrow()
        champagneClick()
        blancClick()
        rougeClick()
        roseClick()
    }

    //Back Button Click
    private fun backArrow() {
        binding.IVBackArrow.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    //Category Button Click
    private fun champagneClick() {
        binding.buttonChampagne.setOnClickListener {
            val intent = Intent(this, ChampagneActivity::class.java)
            startActivity(intent)
        }
    }

    private fun blancClick() {
        binding.buttonBlanc.setOnClickListener {
            val intent = Intent(this, BlancActivity::class.java)
            startActivity(intent)
        }
    }

    private fun rougeClick() {
        binding.buttonRouge.setOnClickListener {
            val intent = Intent(this, RougeActivity::class.java)
            startActivity(intent)
        }
    }

    private fun roseClick() {
        binding.buttonRose.setOnClickListener {
            val intent = Intent(this, RoseActivity::class.java)
            startActivity(intent)
        }
    }
}