package com.example.apolohelper.presenter

import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.apolohelper.model.AuthModelInterface
import com.example.apolohelper.ui.login.RegisterActivity

class RegisterPresenter {
    private val view: RegisterActivity
    private val model: AuthModelInterface
    constructor(view: RegisterActivity, model:AuthModelInterface) {
        this.view = view
        this.model = model
    }

    fun RegisterUser(name: String,email: String,password: String){
        if(view.validateForm()){
            this.model.register(name,password, email,fun(c,_){
                if(c){
                    view.showPopupMessage("registro","Registro Completado")
                }
                else{
                    view.showPopupMessage("registro","Registro Fallido")
                }
            })
        }

    }

}