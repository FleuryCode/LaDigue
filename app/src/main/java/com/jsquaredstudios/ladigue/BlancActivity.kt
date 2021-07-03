package com.jsquaredstudios.ladigue

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.jsquaredstudios.ladigue.databinding.ActivityBlancBinding

class BlancActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBlancBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBlancBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Setting Up RecycleView
        val wineList = setupList()
        binding.wineRecycler.adapter = WineAdapter(wineList)
        binding.wineRecycler.layoutManager = LinearLayoutManager(this)
        binding.wineRecycler.setHasFixedSize(true)

        //Click Functions
        backArrow()
    }

    private fun setupList(): ArrayList<WineItem> {
        val list = arrayListOf<WineItem>(
            WineItem(R.drawable.white_wine_color, "Sauternes", "Cuvée royale, François Janoueix", "42", "9"),
            WineItem(R.drawable.white_wine_color, "Viognier d’Ardèche BIO", "M. Chapoutier", "33", "7"),
            WineItem(R.drawable.white_wine_color, "Riesling", "Kientz, La Metzig", "28", ""),
            WineItem(R.drawable.white_wine_color, "Lubéron", "La Ciboise, M. Chapoutier", "24", ""),
            WineItem(R.drawable.white_wine_color, "Crozes-Hermitage BIO", "M. Chapoutier", "39", ""),
            WineItem(R.drawable.white_wine_color, "Saint-Joseph", "Domaine Courbis", "48", ""),
            WineItem(R.drawable.white_wine_color, "Menetou-Salon", "Pierre Jacolin", "36", ""),
            WineItem(R.drawable.white_wine_color, "Sancerre", "L'essentiel, Pierre Cherrier & Fils", "38", "8"),
            WineItem(R.drawable.white_wine_color, "Pouilly Fumé", "Dominique Guyot", "38", "8"),
            WineItem(R.drawable.white_wine_color, "Chardonnay", "Côte Châlonnaise \"Millebuis\"", "28", ""),
            WineItem(R.drawable.white_wine_color, "Petit Chablis", "Seigneurie de la Magdeleine", "38", "8"),
            WineItem(R.drawable.white_wine_color, "Marsannay", "Château de Marsannay", "55", ""),
            WineItem(R.drawable.white_wine_color, "Rully 1er Cru", "« Les Cloux », Olivier Leflaive 2016", "60", "12"),
            WineItem(R.drawable.white_wine_color, "Meursault Charmes 1er Cru", "Château de Meursault 2017", "120", ""),
            WineItem(R.drawable.white_wine_color, "Corton-Charlemagne Grand Cru", "Louis Latour 2016", "240", "")
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