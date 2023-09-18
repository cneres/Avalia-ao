package com.example.aula12b

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CompromissoAdapter (var context: Context): RecyclerView.Adapter<CompromissoViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CompromissoViewHolder {
       val layoutCompromisso = LayoutInflater.from(parent.context)
           .inflate(R.layout.layout_compromisso, parent, false)
        return CompromissoViewHolder(layoutCompromisso)
    }

    override fun onBindViewHolder(holder: CompromissoViewHolder, position: Int) {
        val compromisso = ListaCompromissos.getCompromisso(position)
        holder.txtTituloData.text = "${compromisso.titulo} (${compromisso.data})"

        holder.txtTituloData.setOnLongClickListener {
            // enviar a posição do elemento atual para a DetalhesActivity
            var intent = Intent(context, DetalhesActivity::class.java)
            intent.putExtra("position", position)
            context.startActivity(intent)
            true
        }

    }

    override fun getItemCount(): Int {
       return ListaCompromissos.getListSize()
    }
}