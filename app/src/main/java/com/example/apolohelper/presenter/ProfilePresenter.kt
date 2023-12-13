package com.example.apolohelper.presenter

import android.util.Log
import com.example.apolohelper.model.AuthModelInterface
import com.example.apolohelper.ui.login.ProfileActivity
import com.example.apolohelper.ui.login.RegisterActivity

class ProfilePresenter {
    private val view: ProfileActivity
    private val model: AuthModelInterface
    constructor(view: ProfileActivity, model: AuthModelInterface) {
        this.view = view
        this.model = model
    }

    fun displayInfo(){
        model.getUserData(fun(u,_){
            if(u!=null){
                Log.d("Usuario presenter",u.nombre,Throwable("t"))
                this.view.displayData(u.nombre,u.club,u.color,u.arco)
            }
        })
    }
}