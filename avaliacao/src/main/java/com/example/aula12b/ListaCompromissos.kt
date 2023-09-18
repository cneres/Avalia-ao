package com.example.aula12b

class ListaCompromissos private constructor(){

    companion object {

        private var listaCompromissos = mutableListOf<Compromisso>()

        init {
            listaCompromissos.add(Compromisso(data =  "10/01/2001", descricaoDetalhada = "Ir ao correio", horarioInicio = "10:45h", horarioTermino = "12:00h", titulo = "Buscar pacote da Shein" ))
            listaCompromissos.add(Compromisso(data =  "20/02/2002", descricaoDetalhada = "Buscar cachorro", horarioInicio = "14:45h", horarioTermino = "15:00h", titulo = "Buscar pet na consulta do vet" ))
        }

        fun addCompromisso(compromisso: Compromisso){
            listaCompromissos.add(compromisso)
        }

        fun getCompromisso(position: Int): Compromisso {
            return listaCompromissos.get(position)
        }

        fun removeCompromisso(position: Int){
            listaCompromissos.removeAt(position)
        }

        fun getListSize() : Int {
            return listaCompromissos.size
        }

    }

}