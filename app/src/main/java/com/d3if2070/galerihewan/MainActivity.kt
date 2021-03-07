package com.d3if2070.galerihewan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import com.d3if2070.galerihewan.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding.recyclerView){
            addItemDecoration(DividerItemDecoration(context, RecyclerView.VERTICAL))
            adapter = MainAdapter(getData())
            setHasFixedSize(true)
        }
    }
    private fun getData(): List<Hewan> {
        return listOf(
            Hewan("Angsa", "Cygnus olor","(Unggas)", R.drawable.angsa),
            Hewan("Ayam", "Gallus gallus","(Unggas)", R.drawable.ayam),
            Hewan("Bebek", "Cairina moschata","(Unggas)", R.drawable.bebek),
            Hewan("Domba", "Ovis ammon","(Mamalia)", R.drawable.domba),
            Hewan("Kalkun", "Meleagris gallopavo","(Unggas)", R.drawable.kalkun),
            Hewan("Kambing", "Capricornis sumatrensis","(Mamalia)", R.drawable.kambing),
            Hewan("Kelinci", "Oryctolagus cuniculus","(Mamalia)", R.drawable.kelinci),
            Hewan("Kerbau", "Bubalus bubalis","(Mamalia)", R.drawable.kerbau),
            Hewan("Kuda", "Equus caballus","(Mamalia)", R.drawable.kuda),
            Hewan("Sapi", "Bos taurus","(Mamalia)", R.drawable.sapi)
        )
    }
}