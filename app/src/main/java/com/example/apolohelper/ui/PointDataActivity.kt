package com.example.apolohelper.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.apolohelper.R
import com.example.apolohelper.databinding.ActivityLoginBinding
import com.example.apolohelper.databinding.ActivityPointsDataBinding
import com.example.apolohelper.model.AuthModel
import com.example.apolohelper.model.Puntuacion
import com.example.apolohelper.presenter.LoginPresenter
import com.example.apolohelper.presenter.PointDataPresenter
import com.example.apolohelper.ui.login.LoginViewModel
import com.example.apolohelper.ui.login.RegisterActivity

class PointDataActivity : AppCompatActivity(){

    private lateinit var loginViewModel: LoginViewModel
    private lateinit var binding: ActivityPointsDataBinding
    private val PointDataPresenter = PointDataPresenter(this, AuthModel())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPointsDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonEditData.setOnClickListener {
            val puntuacion: Puntuacion = getData()
            if(puntuacion.numFlechas == 30){
                val intent = Intent(this@PointDataActivity, Table30Activity::class.java)
                intent.putExtra("puntuacion",puntuacion)
                startActivity(intent)
            }else if(puntuacion.numFlechas == 36){
                val intent = Intent(this@PointDataActivity, Table36Activity::class.java)
                intent.putExtra("puntuacion",puntuacion)
                startActivity(intent)
            }else{
                binding.textViewNumeroFlechas.error = "El número de flechas ha de ser 30 o 36 según su modalidad"
            }

        }


    }

    fun getData(): Puntuacion {
        return Puntuacion(
            diana = binding.editTextDiana.text.toString(),
            letra = binding.editTextLetra.text.toString(),
            modalidad = binding.editTextModalidad.text.toString(),
            categoria = binding.editTextCategoria.text.toString(),
            distancia = binding.editTextDiastancia.text.toString().toInt(),
            numFlechas = binding.editTextNumeroFlechas.text.toString().toInt()
            )
    }
}