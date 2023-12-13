package com.example.apolohelper.presenter

import com.example.apolohelper.model.AuthModelInterface
import com.example.apolohelper.model.Puntuacion
import com.example.apolohelper.ui.Table36Activity
import com.example.apolohelper.ui.TotalPointsActivity

class TotalPointsPresenter {
    private val view: TotalPointsActivity
    private val model: AuthModelInterface
    constructor(view: TotalPointsActivity, model: AuthModelInterface) {
        this.view = view
        this.model = model
    }

    fun setData(puntuacion:Puntuacion){
        model.getUserData { user, _ ->
            val name = user?.nombre
            val total = puntuacion.total
            val sd = puntuacion.sd()
            val tens = puntuacion.NumberOfTens()
            val mean = puntuacion.mean()
            val mediaDieces = puntuacion.tenPercentage()
            if (name != null) {
                view.setData(total,mean,mediaDieces,tens,sd.toFloat(),name)
            }
        }

    }

    fun storePuntuation(puntuacion: Puntuacion){
        model.storePuntuacion(puntuacion)
    }
}