package com.andr3.listaapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListAdapter: RecyclerView.Adapter<ListAdapter.ListItemViewHolder>() {


    //Responsável por criar uma instância do ViewHolder, ira pegar o item como template do xml e ira passar para a classe viewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemViewHolder {

        //LayoutInflater para gerar a parte básica do XML, usando o contexto do pai (patent), o layout do item base, colocando no parent para informar como ira querer exibir e por último o "false" para não ser adicionada a raiz da view
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent,false)//View Base do item

        //passando para o ViewHolder
        return ListItemViewHolder(view)
    }

    //ira pegar a view criada no Oncreate e vincular aos dados que queremos exibir baseado na posição
    override fun onBindViewHolder(holder: ListItemViewHolder, position: Int) {
        holder.posicao.text = position.toString()
        holder.conteudo.text = "aula 1"
    }

    //a quantidade de itens a serem mostrados no recycler view
    override fun getItemCount(): Int {
        return 1
    }

    //fixador de visualização (viewHolder) faz a ligação entre o XML do item e o código
    class ListItemViewHolder(view:View) : RecyclerView.ViewHolder(view){
            var posicao = view.findViewById<TextView>(R.id.posicao)
            var conteudo = view.findViewById<TextView>(R.id.conteudo)
    }

}