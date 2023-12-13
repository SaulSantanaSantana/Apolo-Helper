package com.example.apolohelper.ui

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.adapters.TableLayoutBindingAdapter
import com.example.apolohelper.databinding.ActivityPointsDataBinding
import com.example.apolohelper.databinding.ActivityTableDataBinding
import com.example.apolohelper.model.AuthModel
import com.example.apolohelper.model.Puntuacion
import com.example.apolohelper.presenter.PointDataPresenter
import com.example.apolohelper.presenter.Table36Presenter
import com.example.apolohelper.ui.login.LoginViewModel

class Table36Activity: AppCompatActivity() {
    private lateinit var loginViewModel: LoginViewModel
    private lateinit var binding: ActivityTableDataBinding
    private val table36Presenter = Table36Presenter(this, AuthModel())

    private lateinit var puntuacion : Puntuacion
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTableDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras
        puntuacion = bundle?.get("puntuacion") as Puntuacion
        Log.d("puntuacion",puntuacion?.diana, Throwable())

        binding.editTextScore1.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                
            }
            override fun afterTextChanged(s: Editable?) {
                if(s.toString()!=""){puntuacion.AddPuntuacion(s.toString().toInt(),0)}
            }
        })
        binding.editTextScore2.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                
            }
            override fun afterTextChanged(s: Editable?) {
                if(s.toString()!=""){puntuacion.AddPuntuacion(s.toString().toInt(),1)}
            }
        })
        binding.editTextScore3.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                
            }
            override fun afterTextChanged(s: Editable?) {
                if(s.toString()!=""){puntuacion.AddPuntuacion(s.toString().toInt(),2)}
            }
        })
        binding.editTextScore4.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                
            }
            override fun afterTextChanged(s: Editable?) {
                if(s.toString()!=""){puntuacion.AddPuntuacion(s.toString().toInt(),3)}
            }
        })
        binding.editTextScore5.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                
            }
            override fun afterTextChanged(s: Editable?) {
                if(s.toString()!=""){puntuacion.AddPuntuacion(s.toString().toInt(),4)}
            }
        })
        binding.editTextScore6.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                
            }
            override fun afterTextChanged(s: Editable?) {
                if(s.toString()!=""){puntuacion.AddPuntuacion(s.toString().toInt(),5)}
            }
        })
        binding.editTextScore7.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                
            }
            override fun afterTextChanged(s: Editable?) {
                if(s.toString()!=""){puntuacion.AddPuntuacion(s.toString().toInt(),6)}
            }
        })
        binding.editTextScore8.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                
            }
            override fun afterTextChanged(s: Editable?) {
                if(s.toString()!=""){puntuacion.AddPuntuacion(s.toString().toInt(),7)}
            }
        })
        binding.editTextScore9.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                
            }
            override fun afterTextChanged(s: Editable?) {
                if(s.toString()!=""){puntuacion.AddPuntuacion(s.toString().toInt(),8)}
            }
        })
        binding.editTextScore10.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                
            }
            override fun afterTextChanged(s: Editable?) {
                if(s.toString()!=""){puntuacion.AddPuntuacion(s.toString().toInt(),9)}
            }
        })
        binding.editTextScore11.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                
            }
            override fun afterTextChanged(s: Editable?) {
                if(s.toString()!=""){puntuacion.AddPuntuacion(s.toString().toInt(),10)}
            }
        })
        binding.editTextScore12.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                
            }
            override fun afterTextChanged(s: Editable?) {
                if(s.toString()!=""){puntuacion.AddPuntuacion(s.toString().toInt(),11)}
            }
        })
        binding.editTextScore13.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                
            }
            override fun afterTextChanged(s: Editable?) {
                if(s.toString()!=""){puntuacion.AddPuntuacion(s.toString().toInt(),12)}
            }
        })
        binding.editTextScore14.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                
            }
            override fun afterTextChanged(s: Editable?) {
                if(s.toString()!=""){puntuacion.AddPuntuacion(s.toString().toInt(),13)}
            }
        })
        binding.editTextScore15.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                
            }
            override fun afterTextChanged(s: Editable?) {
                if(s.toString()!=""){puntuacion.AddPuntuacion(s.toString().toInt(),14)}
            }
        })
        binding.editTextScore16.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                
            }
            override fun afterTextChanged(s: Editable?) {
                if(s.toString()!=""){puntuacion.AddPuntuacion(s.toString().toInt(),15)}
            }
        })
        binding.editTextScore17.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                
            }
            override fun afterTextChanged(s: Editable?) {
                if(s.toString()!=""){puntuacion.AddPuntuacion(s.toString().toInt(),16)}
            }
        })
        binding.editTextScore18.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                
            }
            override fun afterTextChanged(s: Editable?) {
                if(s.toString()!=""){puntuacion.AddPuntuacion(s.toString().toInt(),17)}
            }
        })
        binding.editTextScore19.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                
            }
            override fun afterTextChanged(s: Editable?) {
                if(s.toString()!=""){puntuacion.AddPuntuacion(s.toString().toInt(),18)}
            }
        })
        binding.editTextScore20.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                
            }
            override fun afterTextChanged(s: Editable?) {
                if(s.toString()!=""){puntuacion.AddPuntuacion(s.toString().toInt(),19)}
            }
        })
        binding.editTextScore21.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                
            }
            override fun afterTextChanged(s: Editable?) {
                if(s.toString()!=""){puntuacion.AddPuntuacion(s.toString().toInt(),20)}
            }
        })
        binding.editTextScore22.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                
            }
            override fun afterTextChanged(s: Editable?) {
                if(s.toString()!=""){puntuacion.AddPuntuacion(s.toString().toInt(),21)}
            }
        })
        binding.editTextScore23.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                
            }
            override fun afterTextChanged(s: Editable?) {
                if(s.toString()!=""){puntuacion.AddPuntuacion(s.toString().toInt(),22)}
            }
        })
        binding.editTextScore24.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                
            }
            override fun afterTextChanged(s: Editable?) {
                if(s.toString()!=""){puntuacion.AddPuntuacion(s.toString().toInt(),23)}
            }
        })
        binding.editTextScore25.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                
            }
            override fun afterTextChanged(s: Editable?) {
                if(s.toString()!=""){puntuacion.AddPuntuacion(s.toString().toInt(),24)}
            }
        })
        binding.editTextScore26.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                
            }
            override fun afterTextChanged(s: Editable?) {
                if(s.toString()!=""){puntuacion.AddPuntuacion(s.toString().toInt(),25)}
            }
        })
        binding.editTextScore27.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                
            }
            override fun afterTextChanged(s: Editable?) {
                if(s.toString()!=""){puntuacion.AddPuntuacion(s.toString().toInt(),26)}
            }
        })
        binding.editTextScore28.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                
            }
            override fun afterTextChanged(s: Editable?) {
                if(s.toString()!=""){puntuacion.AddPuntuacion(s.toString().toInt(),27)}
            }
        })
        binding.editTextScore29.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                
            }
            override fun afterTextChanged(s: Editable?) {
                if(s.toString()!=""){puntuacion.AddPuntuacion(s.toString().toInt(),28)}
            }
        })
        binding.editTextScore30.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                
            }
            override fun afterTextChanged(s: Editable?) {
                if(s.toString()!=""){puntuacion.AddPuntuacion(s.toString().toInt(),29)}
            }
        })
        binding.editTextScore31.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                
            }
            override fun afterTextChanged(s: Editable?) {
                if(s.toString()!=""){puntuacion.AddPuntuacion(s.toString().toInt(),30)}
            }
        })
        binding.editTextScore32.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                
            }
            override fun afterTextChanged(s: Editable?) {
                if(s.toString()!=""){puntuacion.AddPuntuacion(s.toString().toInt(),31)}
            }
        })
        binding.editTextScore33.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                
            }
            override fun afterTextChanged(s: Editable?) {
                if(s.toString()!=""){puntuacion.AddPuntuacion(s.toString().toInt(),32)}
            }
        })
        binding.editTextScore34.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                
            }
            override fun afterTextChanged(s: Editable?) {
                if(s.toString()!=""){puntuacion.AddPuntuacion(s.toString().toInt(),33)}
            }
        })
        binding.editTextScore35.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                
            }
            override fun afterTextChanged(s: Editable?) {
                if(s.toString()!=""){puntuacion.AddPuntuacion(s.toString().toInt(),34)}
            }
        })
        binding.editTextScore36.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                
            }
            override fun afterTextChanged(s: Editable?) {
                if(s.toString()!=""){puntuacion.AddPuntuacion(s.toString().toInt(),35)}
            }
        })


        binding.buttonEditData.setOnClickListener {
            Log.d("puntuacion", puntuacion.total.toString())
        }


    }
}