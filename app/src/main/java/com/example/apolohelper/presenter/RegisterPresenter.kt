package com.example.apolohelper.presenter

import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.apolohelper.model.AuthModelInterface
import com.example.apolohelper.ui.login.RegisterActivity

class RegisterPresenter {
    private val view: AppCompatActivity
    private val model: AuthModelInterface
    constructor(view: AppCompatActivity, model:AuthModelInterface) {
        this.view = view
        this.model = model
    }

    fun RegisterUser(name: String,email: String,password: String){
        Log.d("presenter",name + email)
        this.model.register(name,password, email)
    }

}