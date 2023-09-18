package com.example.aula12b

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CompromissoViewHolder (layoutCompromisso: View) : RecyclerView.ViewHolder(layoutCompromisso) {
    var txtTituloData = layoutCompromisso.findViewById<TextView>(R.id.txtTituloData)
}