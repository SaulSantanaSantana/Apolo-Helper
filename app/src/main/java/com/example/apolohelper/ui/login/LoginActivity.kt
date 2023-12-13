package com.example.apolohelper.ui.login

import android.app.Activity
import android.app.AlertDialog
import android.content.Intent
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

import com.example.apolohelper.databinding.ActivityLoginBinding

import com.example.apolohelper.R
import com.example.apolohelper.model.AuthModel
import com.example.apolohelper.presenter.LoginPresenter
import com.example.apolohelper.presenter.RegisterPresenter


class LoginActivity : AppCompatActivity() {

    private lateinit var loginViewModel: LoginViewModel
    private lateinit var binding: ActivityLoginBinding
    private val loginPresenter = LoginPresenter(this, AuthModel())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val btnLog: Button? = findViewById(R.id.buttonLogin)
        btnLog?.setOnClickListener {
            checkData(binding.email?.text.toString(), binding.password.text.toString())
        }

        val btnRegistro: Button? = binding.register
        btnRegistro?.setOnClickListener {
            val intent = Intent(this@LoginActivity, RegisterActivity::class.java)
            startActivity(intent)
        }
    }

    fun showPopupMessage(title: String, message: String){
        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setTitle(title)
        alertDialogBuilder.setMessage(message)
        alertDialogBuilder.setPositiveButton("ok"){dialog,_ ->
            dialog.dismiss()
        }
        val alertDialog = alertDialogBuilder.create()
        alertDialog.show()
    }

    fun checkData(mail: String, password:String){
        val regex = Regex("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")
        if(regex.matches(mail) && password.isNotEmpty()){
            loginPresenter.LogUser(mail, password)

        }else{
            showPopupMessage("Inicio de sesión", "Sus credenciales no son válidas")
        }

    }
    fun goToProfile(){
        val intent = Intent(this@LoginActivity, ProfileActivity::class.java)
        startActivity(intent)
    }
}

