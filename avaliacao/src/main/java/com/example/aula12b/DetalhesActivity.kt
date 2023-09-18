package com.example.aula12b

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aula12b.databinding.ActivityDetalhesBinding

class DetalhesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetalhesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetalhesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val position = intent.getIntExtra("position", -1)

        if (position == -1) { finish() }

        val compromisso = ListaCompromissos.getCompromisso(position)

        binding.txtData.text = compromisso.data.toString()
        binding.txtDescricao.text = compromisso.descricaoDetalhada.toString()
        binding.txtTitulo.text = compromisso.titulo.toString()
        binding.txtHoraInicio.text = compromisso.horarioInicio.toString()
        binding.txtHoraTermino.text = compromisso.horarioTermino.toString()

        binding.btnExcluir.setOnClickListener {
            ListaCompromissos.removeCompromisso(position)
            finish()
        }

    }
}