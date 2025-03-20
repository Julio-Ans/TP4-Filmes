package br.edu.fatecpg.tp4.dao

import br.edu.fatecpg.tp4.model.Filme

class filmeDao {

    companion object{
       private val filmes = mutableListOf<Filme>()
    }
    fun addFilme(filme: Filme){
        filmes.add(filme)
    }

    fun getFilmes():List<Filme>{
        return filmes
    }

}