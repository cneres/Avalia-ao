package com.example.aula12b

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.aula12b.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var compromissoAdapter: CompromissoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        compromissoAdapter = CompromissoAdapter(this)
        binding.rcvCompromissos.layoutManager = LinearLayoutManager(this)
        binding.rcvCompromissos.adapter = compromissoAdapter

        binding.btnAdd.setOnClickListener {

            if (binding.addCompromisso.text.isNotEmpty()){
                ListaCompromissos.addCompromisso(Compromisso(binding.addCompromisso.text.toString()))
                compromissoAdapter.notifyItemInserted(ListaCompromissos.getListSize() - 1)
                binding.addCompromisso.text.clear()
            }

        }

    }

    override fun onStart() {
        super.onStart()
        compromissoAdapter.notifyDataSetChanged()
    }
}