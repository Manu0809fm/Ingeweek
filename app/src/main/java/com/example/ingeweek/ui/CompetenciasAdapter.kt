package com.example.ingeweek.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ingeweek.R
import com.example.ingeweek.data.Competencia

class CompetenciasAdapter(private val competencias: List<Competencia>) :
    RecyclerView.Adapter<CompetenciasAdapter.CompetenciaViewHolder>() {

    class CompetenciaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvNombre: TextView = itemView.findViewById(R.id.tvNombre)
        val tvHora: TextView = itemView.findViewById(R.id.tvHora)
        val tvLugar: TextView = itemView.findViewById(R.id.tvLugar)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CompetenciaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_competencia, parent, false)
        return CompetenciaViewHolder(view)
    }

    override fun onBindViewHolder(holder: CompetenciaViewHolder, position: Int) {
        val competencia = competencias[position]
        holder.tvNombre.text = competencia.nombre
        holder.tvHora.text = competencia.hora
        holder.tvLugar.text = competencia.lugar
    }

    override fun getItemCount(): Int = competencias.size
}
