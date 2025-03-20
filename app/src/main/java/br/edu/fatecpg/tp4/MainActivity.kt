package br.edu.fatecpg.tp4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import br.edu.fatecpg.tp4.dao.filmeDao
import br.edu.fatecpg.tp4.model.Filme
import com.google.android.material.floatingactionbutton.FloatingActionButton


class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val edtnome = findViewById<EditText>(R.id.edtNome)
        val edtcategoria = findViewById<EditText>(R.id.edtCategoria)
        val edtnota = findViewById<EditText>(R.id.edtNota)
        val btsalvar = findViewById<Button>(R.id.btSalvar)
        val btlistar = findViewById<FloatingActionButton>(R.id.btListar)

        val dao = filmeDao()

        btsalvar.setOnClickListener{
           val nome = edtnome.text.toString()
           val categoria = edtcategoria.text.toString()
           val nota = edtnota.text.toString().toDouble()
            val filme = Filme(nome, categoria, nota)
            dao.addFilme(filme)

            edtnome.text.clear()
            edtcategoria.text.clear()
            edtnota.text.clear()

        }

        btlistar.setOnClickListener{
            val intent = Intent(this, ShowListActivity::class.java )
            startActivity(intent)

        }



        }
    }
