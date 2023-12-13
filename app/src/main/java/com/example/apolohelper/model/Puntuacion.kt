package com.example.apolohelper.model

import com.google.protobuf.Internal.IntList
import java.io.Serializable

data class Puntuacion(
    val userUid: String = "",
    val diana: String ="",
    val letra:String = "",
    val modalidad: String = "",
    val categoria: String = "",
    val distancia: Int = 15,
    val numFlechas: Int = 6,
): Serializable{
    var total: Int = 0
    val puntuaciones: MutableList<Int> = mutableListOf()
    fun AddPuntuation(puntuacion: Int){
        puntuaciones.add(puntuacion)
        total = 0
        puntuaciones.forEach { p-> total += p}
    }
    fun AddPuntuacion(puntuacion: Int, pos: Int){
        puntuaciones.add(pos,puntuacion)
        total = 0
        puntuaciones.forEach { p-> total += p}
    }
}
