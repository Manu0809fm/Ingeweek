package com.example.ingeweek.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ingeweek.R
import com.example.ingeweek.data.Evento

class EventosFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_eventos, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerEventos)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = EventosAdapter(getEventos())

        return view
    }

    private fun getEventos(): List<Evento> {
        return listOf(
            // Lunes 3 de junio
            Evento("El ingeniero como agente de cambio", "10:00 a. m.", "Auditorio Biblioteca Central", "Ing. Jorge Castañeda Centurión"),
            Evento("Desempeño sísmico de un edificio esencial", "10:45 a. m.", "Auditorio Biblioteca Central", "Ing. Iván León Malo"),
            Evento("Análisis de fallas en estructuras metálicas", "11:30 a. m.", "Auditorio Biblioteca Central", "Ing. Gumercindo Flores Reyes"),
            Evento("Cimentaciones para edificaciones en Chimbote", "12:15 p. m.", "Auditorio Biblioteca Central", "Ing. Jorge Morillo Trujillo"),

            // Martes 4 de junio
            Evento("Energía eólica en el Perú", "9:30 a. m.", "Auditorio Biblioteca Central", "Ing. Julio Jesús Gamero Caro"),
            Evento("Energía solar y fotovoltaica", "10:15 a. m.", "Auditorio Biblioteca Central", "Ing. Julio Jesús Gamero Caro"),
            Evento("Hidrógeno verde", "11:00 a. m.", "Auditorio Biblioteca Central", "Ing. Julio Jesús Gamero Caro"),

            // Miércoles 5 de junio
            Evento("Plan BIM Perú", "9:30 a. m.", "Auditorio Biblioteca Central", "Ing. Alexandra Bernuy"),
            Evento("Ecosistemas digitales", "10:15 a. m.", "Auditorio Biblioteca Central", "Ing. Alan Vásquez Tiznado"),
            Evento("Nuevas Tecnologías y productividad", "11:00 a. m.", "Auditorio Biblioteca Central", "Mg. Pablo Cabanillas Vega"),

            // Jueves 6 de junio
            Evento("Energía nuclear en el Perú", "10:00 a. m.", "Auditorio Biblioteca Central", "Dr. Hugo Palomino Ríos"),
            Evento("Reactor RP-10 del Perú", "10:45 a. m.", "Auditorio Biblioteca Central", "Dr. Hugo Palomino Ríos"),
            Evento("Aplicaciones de la energía nuclear", "11:30 a. m.", "Auditorio Biblioteca Central", "Dr. Hugo Palomino Ríos"),
            Evento("Centrales nucleares de potencia", "12:15 p. m.", "Auditorio Biblioteca Central", "Dr. Hugo Palomino Ríos"),

            // Viernes 7 de junio
            Evento("Innovación y el pensamiento crítico", "10:00 a. m.", "Auditorio Biblioteca Central", "Lic. Nilda Mondragón Bravo"),
            Evento("Comunicación eficaz en el entorno profesional", "10:45 a. m.", "Auditorio Biblioteca Central", "Lic. Nilda Mondragón Bravo"),
            Evento("Redacción científica", "11:30 a. m.", "Auditorio Biblioteca Central", "Lic. Nilda Mondragón Bravo"),
            Evento("Taller de liderazgo", "12:15 p. m.", "Auditorio Biblioteca Central", "Lic. Nilda Mondragón Bravo")
        )
    }
}


