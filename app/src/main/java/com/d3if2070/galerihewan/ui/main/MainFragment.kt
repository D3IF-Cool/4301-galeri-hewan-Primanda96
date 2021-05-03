package com.d3if2070.galerihewan.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import com.d3if2070.galerihewan.model.Hewan
import com.d3if2070.galerihewan.R
import com.d3if2070.galerihewan.databinding.FragmentMainBinding

class MainFragment: Fragment() {
    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(layoutInflater, container, false)
        with(binding.recyclerView) {
            addItemDecoration(DividerItemDecoration(context,
            RecyclerView.VERTICAL))
            adapter = MainAdapter(getData())
            setHasFixedSize(true)
        }
        return binding.root
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