package com.jsquaredstudios.ladigue

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.jsquaredstudios.ladigue.databinding.ActivityRoseBinding

class RoseActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRoseBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRoseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Setting Up Recycler
        val wineList = setupList()
        binding.wineRecycler.adapter = WineAdapter(wineList)
        binding.wineRecycler.layoutManager = LinearLayoutManager(this)
        binding.wineRecycler.setHasFixedSize(true)

        //Button Clicks
        backArrow()
    }

    fun setupList(): ArrayList<WineItem> {
        val list = arrayListOf<WineItem>(
            WineItem(R.drawable.rose_wine_color, "Côtes de Provence", "Château Sainte Roseline, Cru Classé", "39", "8"),
            WineItem(R.drawable.rose_wine_color, "Côtes de Provence", "Minuty Prestige", "42", ""),
            WineItem(R.drawable.rose_wine_color, "Côtes de Provence aoc HVE", "chateau Lauzade, haute valeur environnementale", "39", ""),
            WineItem(R.drawable.rose_wine_color, "IGP Pays d'Oc", "au gris de mes envies, Cros Pujol", "28", "6")
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