package com.andr3.listaapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.andr3.listaapp.databinding.ItemBinding

class ListAdapter(
    val listener: ListAdapterListener
): RecyclerView.Adapter<ListAdapter.ListItemViewHolder>() {

    //Responsável por criar uma instância do ViewHolder, ira pegar o item como template do xml e ira passar para a classe viewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemViewHolder {

        //LayoutInflater para gerar a parte básica do XML, usando o contexto do pai (patent), o layout do item base, colocando no parent para informar como ira querer exibir e por último o "false" para não ser adicionada a raiz da view
        return ListItemViewHolder(ItemBinding.inflate( //View Base do item
            LayoutInflater.from(parent.context),
            parent, false
        ))

    }

    //ira pegar a view criada no Oncreate e vincular aos dados que queremos exibir baseado na posição
    override fun onBindViewHolder(holder: ListItemViewHolder, position: Int) {
        val text = "aula 1"
        holder.posicao.text = position.toString()
        holder.conteudo.text = text

        holder.root.setOnClickListener{
            listener.onItemClicked(text)
        }
    }

    //a quantidade de itens a serem mostrados no recycler view
    override fun getItemCount(): Int {
        return 1
    }

    //fixador de visualização (viewHolder) faz a ligação entre o XML do item e o código
    class ListItemViewHolder(binding: ItemBinding) : RecyclerView.ViewHolder(binding.root){
            var root = binding.root
            var posicao = binding.posicao
            var conteudo = binding.conteudo
    }

    interface ListAdapterListener{
        fun onItemClicked(content: String)
    }

}