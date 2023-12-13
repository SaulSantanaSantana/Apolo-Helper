package com.example.apolohelper.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.apolohelper.databinding.ActivityPointsDataBinding
import com.example.apolohelper.databinding.ActivityTableDataBinding
import com.example.apolohelper.databinding.ActivityTotalPointsBinding
import com.example.apolohelper.model.AuthModel
import com.example.apolohelper.model.Puntuacion
import com.example.apolohelper.presenter.Table36Presenter
import com.example.apolohelper.presenter.TotalPointsPresenter
import com.example.apolohelper.ui.login.LoginViewModel
import com.example.apolohelper.ui.login.ProfileActivity

class TotalPointsActivity : AppCompatActivity() {
    private lateinit var loginViewModel: LoginViewModel
    private lateinit var binding: ActivityTotalPointsBinding
    private val totalPointsPresenter = TotalPointsPresenter(this, AuthModel())

    private lateinit var puntuacion : Puntuacion
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTotalPointsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        val bundle = intent.extras
        puntuacion = bundle?.get("puntuacion") as Puntuacion

        totalPointsPresenter.setData(puntuacion)

        binding.buttonSaveData.setOnClickListener {
            totalPointsPresenter.storePuntuation(puntuacion)
            val intent = Intent(this@TotalPointsActivity,ProfileActivity::class.java)
            startActivity(intent)
        }

    }
    fun setData(total: Int,mean: Float,tenAverage: Float,tens:Int,sd:Float,name: String){
        binding.name.text = name
        binding.textViewTotalPointsD.text = total.toString()
        binding.textViewAvarageD.text = mean.toString()
        binding.textViewAvarageTenD.text = tenAverage.toString()
        binding.textViewTenD.text = tens.toString()
        binding.textViewDesviationD.text = sd.toString()
    }
}