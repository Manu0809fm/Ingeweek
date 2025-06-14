package com.example.ingeweek.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ingeweek.R
import com.example.ingeweek.data.Competencia

class CompetenciasFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_competencias, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerCompetencias)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = CompetenciasAdapter(getCompetencias())

        return view
    }

    private fun getCompetencias(): List<Competencia> {
        return listOf(
            Competencia("Campeonato de fútbol interescuelas", "10:00 a. m.", "Cancha deportiva UNS"),
            Competencia("Torneo de ajedrez", "2:00 p. m.", "Sala de usos múltiples - Biblioteca"),
            Competencia("Rally de conocimientos de ingeniería", "3:00 p. m.", "Auditorio Biblioteca Central"),
            Competencia("Hackathon UNS", "9:00 a. m.", "Pabellón de Ingeniería de Sistemas"),
            Competencia("Competencia de estructuras con fideos", "11:00 a. m.", "Explanada de Ingeniería Civil")
        )
    }
}
