package com.example.ingeweek.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ingeweek.R
import com.example.ingeweek.data.Seminario

class SeminariosAdapter(private val lista: List<Seminario>) :
    RecyclerView.Adapter<SeminariosAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvTitulo: TextView = itemView.findViewById(R.id.tvTituloSeminario)
        val tvHora: TextView = itemView.findViewById(R.id.tvHoraSeminario)
        val tvPonente: TextView = itemView.findViewById(R.id.tvPonenteSeminario)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_seminario, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = lista.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val seminario = lista[position]
        holder.tvTitulo.text = seminario.titulo
        holder.tvHora.text = seminario.hora
        holder.tvPonente.text = seminario.ponente
    }
}
