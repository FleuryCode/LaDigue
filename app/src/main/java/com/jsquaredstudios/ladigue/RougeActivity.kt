package com.jsquaredstudios.ladigue

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.jsquaredstudios.ladigue.databinding.ActivityRougeBinding

class RougeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRougeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRougeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Setting Up RecyclerView

        val wineList = setupList()
        binding.wineRecycler.adapter =WineAdapter(wineList)
        binding.wineRecycler.layoutManager = LinearLayoutManager(this)
        binding.wineRecycler.setHasFixedSize(true)

        //Click Functions
        backArrow()
    }

    fun setupList() : ArrayList<WineItem> {
        val list = arrayListOf<WineItem>(
            WineItem(R.drawable.red_wine_color, "Pic Saint-Loup", "Cros Pujol", "36", ""),
            WineItem(R.drawable.red_wine_color, "Lubéron", "La Ciboise, M. Chapoutier", "24", ""),
            WineItem(R.drawable.red_wine_color, "Lirac", "Château d'Aqueria", "38", "8"),
            WineItem(R.drawable.red_wine_color, "Crozes-Hermitage BIO", "David Reynaud", "39", ""),
            WineItem(R.drawable.red_wine_color, "Menetou-Salon", "Pierre Jacolin", "36", ""),
            WineItem(R.drawable.red_wine_color, "Brouilly Sans sulfite", "Les Pas Perdus", "33", "7"),
            WineItem(R.drawable.red_wine_color, "Pinot Noir", "Côte Châlonnaise \"Millebuis\"", "33", ""),
            WineItem(R.drawable.red_wine_color, "Marsannay", "Château de Marsannay 2017", "55", "11"),
            WineItem(R.drawable.red_wine_color, "Beaune \"Clos des Mouches\"", "Joseph Drouhin 2017", "160", ""),
            WineItem(R.drawable.red_wine_color, "Clos de Vougeot Grand Cru", "Joseph drouhin 2017", "320", ""),
            WineItem(R.drawable.red_wine_color, "Lalande de Pomerol", "Château des Tourelles", "42", "9"),
            WineItem(R.drawable.red_wine_color, "Clos Petit Corbin", "Saint-Emilion Grand Cru 2013", "42", ""),
            WineItem(R.drawable.red_wine_color, "Les Ormes de Pez", "Saint Estephe 2011", "75", ""),
            WineItem(R.drawable.red_wine_color, "Lynch-Bages", "Pauillac Grand cru classé 2011", "180", ""),
            WineItem(R.drawable.red_wine_color, "Saint Emilion 1er grand Cru Classé", "Chateau Cheval Blanc 2006", "1150", "")
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