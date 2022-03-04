package com.andr3.listaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.andr3.listaapp.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity(), ListAdapter.ListAdapterListener {

    private lateinit var binding: ActivityMainBinding
    private val itemList: MutableList<ListItem> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root) //Raiz, layout principal

        val listView = binding.lista //passando o recyclerview para a mainActivity

        createMockData()

        listView.layoutManager = LinearLayoutManager(this) //Informando ao linear layout que ele está vínculado a activity desse arquivo (no caso mainActivity)
        listView.adapter = ListAdapter(itemList,this)
    }
    private fun createMockData(){
        itemList.add(ListItem("Manaus", "AM"))
        itemList.add(ListItem("Belém", "PA"))
        itemList.add(ListItem("São Paulo", "SP"))
        itemList.add(ListItem("Rio de Janeiro", "RJ"))
        itemList.add(ListItem("Belo Horizonte", "MG"))
        itemList.add(ListItem("Salvador", "BA"))
        itemList.add(ListItem("Florianópolis", "SC"))
        itemList.add(ListItem("Curitiba", "PR"))
    }

    override fun onItemClicked(content: String) { //Evento de Click com Binding

        Snackbar.make(binding.root, content, Snackbar.LENGTH_SHORT).show() //Similar ao Toast, mensagem que ira aparecer por um momento breve
    }
}