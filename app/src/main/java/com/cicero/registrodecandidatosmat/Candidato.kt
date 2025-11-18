package com.cicero.registrodecandidatosmat

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Candidato (
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var nomeNaUrna: String,
    var numeroCandidato: Int,
    var cargoCandidato: String,
    var nomePartido: String
)