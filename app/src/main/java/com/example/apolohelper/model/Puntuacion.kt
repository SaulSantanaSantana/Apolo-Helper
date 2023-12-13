package com.example.apolohelper.model

import com.google.protobuf.Internal.IntList
import java.io.Serializable
import kotlin.math.pow
import kotlin.math.sqrt

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
        puntuaciones.add(pos-1,puntuacion)
        total = 0
        puntuaciones.forEach { p-> total += p}
    }

    fun tenPercentage():Float{
        return (NumberOfTens().toFloat()/numFlechas)
    }

    fun NumberOfTens(): Int {
        var nTens : Int = 0
        puntuaciones.forEach { p -> if(p==10){nTens++} }
        return(nTens)
    }

    fun sd(): Double {
        val mean = puntuaciones.average()
        val sumOfSquaredDifferences = puntuaciones.map { (it - mean).pow(2) }.sum()
        val variance = sumOfSquaredDifferences/ puntuaciones.size
        return sqrt(variance)
    }

    fun mean(): Float{
        return puntuaciones.average().toFloat()
    }
}
