package com.andr3.listaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<RecyclerView>(R.id.lista) //passando o recyclerview para a mainActivity

        listView.layoutManager = LinearLayoutManager(this) //Informando ao linear layout que ele está vínculado a activity desse arquivo (no caso mainActivity)
        listView.adapter = ListAdapter()
    }
}