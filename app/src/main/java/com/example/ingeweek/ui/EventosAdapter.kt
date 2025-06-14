package com.example.ingeweek.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ingeweek.R
import com.example.ingeweek.data.Evento

class EventosAdapter(private val eventos: List<Evento>) :
    RecyclerView.Adapter<EventosAdapter.EventoViewHolder>() {

    class EventoViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvTitulo: TextView = view.findViewById(R.id.tvTitulo)
        val tvHora: TextView = view.findViewById(R.id.tvHora)
        val tvLugar: TextView = view.findViewById(R.id.tvLugar)
        val tvPonente: TextView = view.findViewById(R.id.tvPonente)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_evento, parent, false)
        return EventoViewHolder(view)
    }

    override fun onBindViewHolder(holder: EventoViewHolder, position: Int) {
        val evento = eventos[position]
        holder.tvTitulo.text = evento.titulo
        holder.tvHora.text = evento.hora
        holder.tvLugar.text = evento.lugar
        holder.tvPonente.text = evento.ponente
    }

    override fun getItemCount() = eventos.size
}
