package com.example.apolohelper.ui.login

import android.app.Activity
import android.app.AlertDialog
import android.content.Intent
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.os.Message
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity
import android.text.Editable
import android.text.TextWatcher
import android.util.Patterns
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

    fun validateForm(): Boolean{
        var passed: Boolean= true
        val name = binding.nombre.text.toString().trim()
        val email = binding.email.text.toString().trim()
        val password = binding.contraseA.text.toString().trim()
        binding.email.error = null
        binding.nombre.error = null
        binding.contraseA.error = null
        binding.checkBoxInfo.error = null
        binding.checkBoxTerminos.error = null

        if(name.isEmpty()){
            binding.nombre.error="Nombre requerido"
            passed = false
        }
        if(password.isEmpty()){
            binding.contraseA.error="Contraseña requerida"
            passed = false
        }
        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            binding.email.error = "La dirección de Email no es válida"
            passed = false
        }
        if(email.isEmpty()){
            binding.email.error="Email requerido"
            passed = false
        }
        if(!binding.checkBoxInfo.isChecked){
            binding.checkBoxInfo.error="Confirme"
            passed = false
        }
        if(!binding.checkBoxTerminos.isChecked){
            binding.checkBoxTerminos.error="Acepte los terminos"
            passed = false
        }

        return passed
    }
}
