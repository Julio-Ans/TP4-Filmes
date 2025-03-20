package br.edu.fatecpg.tp4

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.edu.fatecpg.tp4.adapter.filmeAdapter
import br.edu.fatecpg.tp4.dao.filmeDao

class ShowListActivity : AppCompatActivity(R.layout.activity_show_list) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val dao = filmeDao()
        val filmes = dao.getFilmes()

        val rvFilmes = findViewById<RecyclerView>(R.id.rv_lista_filmes)
        rvFilmes.layoutManager = LinearLayoutManager(this)
        rvFilmes.adapter = filmeAdapter(filmes)


    }
    }
