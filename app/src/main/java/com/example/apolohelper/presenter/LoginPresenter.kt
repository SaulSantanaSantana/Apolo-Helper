package com.example.apolohelper.presenter

import android.content.Intent
import android.util.Log
import androidx.core.content.ContextCompat.startActivity
import com.example.apolohelper.model.AuthModelInterface
import com.example.apolohelper.ui.login.LoginActivity
import com.example.apolohelper.ui.login.RegisterActivity

class LoginPresenter {
    private val view: LoginActivity
    private val model: AuthModelInterface
    constructor(view: LoginActivity, model: AuthModelInterface) {
        this.view = view
        this.model = model
    }

    fun LogUser(email: String,password: String){
        this.model.logInUser(password, email,fun(c,_){
            Log.d("email",email)
            Log.d("password",password)
            if(c){

                view.showPopupMessage("Inicio de Sesión","UwU")
            }
            else{
                view.showPopupMessage("Inicio de Sesión","Inicio de Sesión fallido, compruebe sus credenciales.")
            }
        })
    }
}

