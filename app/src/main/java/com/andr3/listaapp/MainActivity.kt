package com.andr3.listaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.andr3.listaapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root) //Raiz, layout principal

        val listView = binding.lista //passando o recyclerview para a mainActivity

        listView.layoutManager = LinearLayoutManager(this) //Informando ao linear layout que ele está vínculado a activity desse arquivo (no caso mainActivity)
        listView.adapter = ListAdapter()
    }
}