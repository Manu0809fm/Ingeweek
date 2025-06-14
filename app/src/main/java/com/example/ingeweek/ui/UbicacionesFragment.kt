package com.example.ingeweek.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ingeweek.R
import com.example.ingeweek.data.Ubicacion

class UbicacionesFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_ubicaciones, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerUbicaciones)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = UbicacionesAdapter(getUbicaciones())

        return view
    }

    private fun getUbicaciones(): List<Ubicacion> {
        return listOf(
            Ubicacion("Auditorio de la Biblioteca Central", "Lugar donde se realizarán los seminarios y conferencias principales."),
            Ubicacion("Campo Deportivo de la UNS", "Área destinada a las competencias deportivas."),
            Ubicacion("Laboratorios de Ingeniería", "Ambientes donde se llevarán a cabo exhibiciones tecnológicas y proyectos."),
            Ubicacion("Pabellón de Ingeniería de Sistemas", "Ubicación de charlas especializadas de la carrera de Sistemas."),
            Ubicacion("Pabellón de Ingeniería Civil", "Lugar de exposición de proyectos de construcción.")
        )
    }
}
