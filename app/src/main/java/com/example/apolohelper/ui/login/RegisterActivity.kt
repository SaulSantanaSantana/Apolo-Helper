package com.example.apolohelper.ui.login

import android.app.Activity
import android.content.Intent
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

import com.example.apolohelper.databinding.ActivityRegisterBinding

import com.example.apolohelper.R
import com.example.apolohelper.model.AuthManager
import com.example.apolohelper.model.AuthModel
import com.example.apolohelper.model.UserDao
import com.example.apolohelper.presenter.RegisterPresenter

class RegisterActivity() : AppCompatActivity(){
    private lateinit var loginViewModel: LoginViewModel
    private val registerPresenter = RegisterPresenter(this,AuthModel())
    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnIniciarSesion: Button = findViewById(R.id.iniciarSesion)

        btnIniciarSesion.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                // Crear un Intent para iniciar la segunda actividad
                val intent = Intent(this@RegisterActivity, LoginActivity::class.java)
                startActivity(intent)
            }
        })

        val btnRegistro: Button = binding.registrarse
        btnRegistro.setOnClickListener {
            registerPresenter.RegisterUser(binding.nombre.text.toString(),binding.email.text.toString(),binding.contraseA.text.toString())
        }
    }
}