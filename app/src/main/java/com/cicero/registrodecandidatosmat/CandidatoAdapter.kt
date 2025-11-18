package com.cicero.registrodecandidatosmat

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cicero.registrodecandidatosmat.CandidatoAdapter.CandidatoViewHolder
import com.cicero.registrodecandidatosmat.databinding.ItemCandidatoBinding

class CandidatoAdapter(var candidatoDAO: CandidatoDAO) :
    RecyclerView.Adapter<CandidatoViewHolder>() {
    private var listaCandidatos = mutableListOf<Candidato>()

    inner class CandidatoViewHolder(var binding: ItemCandidatoBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(posicao: Int) {
            var candidato = listaCandidatos[posicao]
            binding.tvNomeUrna.text = candidato.nomeNaUrna
            binding.tvNumero.text = candidato.numeroCandidato.toString()
            binding.tvCargo.text = candidato.cargoCandidato
            binding.tvPartido.text = candidato.nomePartido

            binding.btEditar.setOnClickListener { view ->
            }

            binding.btExcluir.setOnClickListener { view ->
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            CandidatoViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemCandidatoBinding.inflate(layoutInflater, parent, false)
        return CandidatoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CandidatoViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int {
        return listaCandidatos.size
    }
}