package com.jsquaredstudios.ladigue

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.jsquaredstudios.ladigue.databinding.ActivityChampagneBinding

class ChampagneActivity : AppCompatActivity() {

    private lateinit var binding: ActivityChampagneBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChampagneBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val wineList = setupList()

        binding.champagneRecycler.adapter = WineAdapter(wineList)
        binding.champagneRecycler.layoutManager = LinearLayoutManager(this)
        binding.champagneRecycler.setHasFixedSize(true)

        //Click Functions
        backArrow()
    }


    private fun setupList(): ArrayList<WineItem> {
        val list = arrayListOf<WineItem>(
            WineItem(R.drawable.white_wine_color, "Deutz", "Brut Classique", "85", "12"),
            WineItem(R.drawable.rose_wine_color, "Deutz", "Rosé", "90", ""),
            WineItem(R.drawable.white_wine_color, "Moët & Chandon", "Ice Impérial (A boire en piscine)", "100", ""),
            WineItem(R.drawable.white_wine_color, "Cristal Roederer", "Brut, 2012", "280", ""),
            WineItem(R.drawable.white_wine_color, "Billecart-Salmon", "Brut Réserve", "95", ""),
            WineItem(R.drawable.rose_wine_color, "Billecart-Salmon", "Rosé", "105", ""),
            WineItem(R.drawable.white_wine_color, "Billecart-Salmon", "blanc de blanc", "120", "")
        )
        return list

    }

    //Back Button Clicker
    private fun backArrow() {
        binding.IVBackArrow.setOnClickListener {
            val intent = Intent(this, VinsActivity::class.java)
            startActivity(intent)
        }
    }


}