package com.example.apolohelper.presenter

import android.content.Intent
import android.util.Log
import com.example.apolohelper.model.AuthModelInterface
import com.example.apolohelper.model.User
import com.example.apolohelper.ui.login.EditProfileActivity
import com.example.apolohelper.ui.login.ProfileActivity

class EditProfilePresenter {
    private val view: EditProfileActivity
    private val model: AuthModelInterface
    constructor(view: EditProfileActivity, model: AuthModelInterface) {
        this.view = view
        this.model = model
    }

    fun displayInfo(){
        model.getUserData(fun(u,_){
            if(u!=null){
                this.view.displayData(u.nombre,u.club,u.color,u.arco)
            }
        })
    }

    fun updateData(club: String, color: String, arco:String){
        var user = User("","","",club,color,arco)
        model.updateUser(user);
        this.view.returnToProfile()
    }
}