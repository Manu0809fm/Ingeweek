package com.example.ingeweek.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ingeweek.R
import com.example.ingeweek.data.Seminario

class SeminariosFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_seminarios, container, false)

        val recycler = view.findViewById<RecyclerView>(R.id.recyclerSeminarios)
        recycler.layoutManager = LinearLayoutManager(requireContext())
        recycler.adapter = SeminariosAdapter(getSeminarios())

        return view
    }

    private fun getSeminarios(): List<Seminario> {
        return listOf(
            Seminario("Importancia de la ingeniería industrial", "4:00 p. m.", "Mg. Ing. Juan Carlos Montalvo Cerna"),
            Seminario("Gestión de la calidad en la industria peruana", "5:00 p. m.", "Ing. Diana Paredes Jiménez"),
            Seminario("Avances en ingeniería mecánica y eléctrica", "4:00 p. m.", "Ing. Carlos Quispe Martínez"),
            Seminario("Eficiencia energética en procesos industriales", "5:00 p. m.", "Ing. Lucía Rivera Chávez"),
            Seminario("Innovación en ingeniería agroindustrial", "4:00 p. m.", "Ing. Pedro Fernández Rojas"),
            Seminario("Sostenibilidad y tecnología en alimentos", "5:00 p. m.", "Ing. María Torres Castañeda"),
            Seminario("Aplicaciones de la inteligencia artificial en ingeniería", "4:00 p. m.", "Ing. Rodrigo Méndez Álvarez"),
            Seminario("Desafíos de la automatización industrial", "5:00 p. m.", "Ing. Sofía Huamán Delgado")
        )
    }

}
