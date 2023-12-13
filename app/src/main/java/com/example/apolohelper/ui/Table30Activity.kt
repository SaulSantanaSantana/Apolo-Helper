package com.example.apolohelper.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.apolohelper.databinding.ActivityTableData30Binding
import com.example.apolohelper.databinding.ActivityTableDataBinding
import com.example.apolohelper.model.AuthModel
import com.example.apolohelper.model.Puntuacion
import com.example.apolohelper.presenter.Table30Presenter
import com.example.apolohelper.presenter.Table36Presenter
import com.example.apolohelper.ui.login.LoginViewModel

class Table30Activity : AppCompatActivity() {
    private lateinit var loginViewModel: LoginViewModel
    private lateinit var binding: ActivityTableData30Binding
    private val table30Presenter = Table30Presenter(this, AuthModel())

    private lateinit var puntuacion : Puntuacion
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTableData30Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras
        puntuacion = bundle?.get("puntuacion") as Puntuacion
    }
}