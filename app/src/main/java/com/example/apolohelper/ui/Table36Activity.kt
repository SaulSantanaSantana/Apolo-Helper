package com.example.apolohelper.ui

import android.content.Intent
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


        binding.buttonEditData.setOnClickListener {

            val puntuacionTotal =
                Integer.parseInt(binding.editTextScore1.text.toString()) +
                        Integer.parseInt(binding.editTextScore1.text.toString()) +
                        Integer.parseInt(binding.editTextScore2.text.toString()) +
                        Integer.parseInt(binding.editTextScore3.text.toString()) +
                        Integer.parseInt(binding.editTextScore4.text.toString()) +
                        Integer.parseInt(binding.editTextScore5.text.toString()) +
                        Integer.parseInt(binding.editTextScore6.text.toString()) +
                        Integer.parseInt(binding.editTextScore7.text.toString()) +
                        Integer.parseInt(binding.editTextScore8.text.toString()) +
                        Integer.parseInt(binding.editTextScore9.text.toString()) +
                        Integer.parseInt(binding.editTextScore10.text.toString()) +
                        Integer.parseInt(binding.editTextScore11.text.toString()) +
                        Integer.parseInt(binding.editTextScore12.text.toString()) +
                        Integer.parseInt(binding.editTextScore13.text.toString()) +
                        Integer.parseInt(binding.editTextScore14.text.toString()) +
                        Integer.parseInt(binding.editTextScore15.text.toString()) +
                        Integer.parseInt(binding.editTextScore16.text.toString()) +
                        Integer.parseInt(binding.editTextScore17.text.toString()) +
                        Integer.parseInt(binding.editTextScore18.text.toString()) +
                        Integer.parseInt(binding.editTextScore19.text.toString()) +
                        Integer.parseInt(binding.editTextScore20.text.toString()) +
                        Integer.parseInt(binding.editTextScore21.text.toString()) +
                        Integer.parseInt(binding.editTextScore22.text.toString()) +
                        Integer.parseInt(binding.editTextScore23.text.toString()) +
                        Integer.parseInt(binding.editTextScore24.text.toString()) +
                        Integer.parseInt(binding.editTextScore25.text.toString()) +
                        Integer.parseInt(binding.editTextScore26.text.toString()) +
                        Integer.parseInt(binding.editTextScore27.text.toString()) +
                        Integer.parseInt(binding.editTextScore28.text.toString()) +
                        Integer.parseInt(binding.editTextScore29.text.toString()) +
                        Integer.parseInt(binding.editTextScore30.text.toString()) +
                        Integer.parseInt(binding.editTextScore31.text.toString()) +
                        Integer.parseInt(binding.editTextScore32.text.toString()) +
                        Integer.parseInt(binding.editTextScore33.text.toString()) +
                        Integer.parseInt(binding.editTextScore34.text.toString()) +
                        Integer.parseInt(binding.editTextScore35.text.toString()) +
                        Integer.parseInt(binding.editTextScore36.text.toString())

            puntuacion.AddPuntuacion(binding.editTextScore1.text.toString().toInt(),1)
            puntuacion.AddPuntuacion(binding.editTextScore2.text.toString().toInt(),2)
            puntuacion.AddPuntuacion(binding.editTextScore3.text.toString().toInt(),3)
            puntuacion.AddPuntuacion(binding.editTextScore4.text.toString().toInt(),4)
            puntuacion.AddPuntuacion(binding.editTextScore5.text.toString().toInt(),5)
            puntuacion.AddPuntuacion(binding.editTextScore6.text.toString().toInt(),6)
            puntuacion.AddPuntuacion(binding.editTextScore7.text.toString().toInt(),7)
            puntuacion.AddPuntuacion(binding.editTextScore8.text.toString().toInt(),8)
            puntuacion.AddPuntuacion(binding.editTextScore9.text.toString().toInt(),9)
            puntuacion.AddPuntuacion(binding.editTextScore10.text.toString().toInt(),10)
            puntuacion.AddPuntuacion(binding.editTextScore11.text.toString().toInt(),11)
            puntuacion.AddPuntuacion(binding.editTextScore12.text.toString().toInt(),12)
            puntuacion.AddPuntuacion(binding.editTextScore13.text.toString().toInt(),13)
            puntuacion.AddPuntuacion(binding.editTextScore14.text.toString().toInt(),14)
            puntuacion.AddPuntuacion(binding.editTextScore15.text.toString().toInt(),15)
            puntuacion.AddPuntuacion(binding.editTextScore16.text.toString().toInt(),16)
            puntuacion.AddPuntuacion(binding.editTextScore17.text.toString().toInt(),17)
            puntuacion.AddPuntuacion(binding.editTextScore18.text.toString().toInt(),18)
            puntuacion.AddPuntuacion(binding.editTextScore19.text.toString().toInt(),19)
            puntuacion.AddPuntuacion(binding.editTextScore20.text.toString().toInt(),20)
            puntuacion.AddPuntuacion(binding.editTextScore21.text.toString().toInt(),21)
            puntuacion.AddPuntuacion(binding.editTextScore22.text.toString().toInt(),22)
            puntuacion.AddPuntuacion(binding.editTextScore23.text.toString().toInt(),23)
            puntuacion.AddPuntuacion(binding.editTextScore24.text.toString().toInt(),24)
            puntuacion.AddPuntuacion(binding.editTextScore25.text.toString().toInt(),25)
            puntuacion.AddPuntuacion(binding.editTextScore26.text.toString().toInt(),26)
            puntuacion.AddPuntuacion(binding.editTextScore27.text.toString().toInt(),27)
            puntuacion.AddPuntuacion(binding.editTextScore28.text.toString().toInt(),28)
            puntuacion.AddPuntuacion(binding.editTextScore29.text.toString().toInt(),29)
            puntuacion.AddPuntuacion(binding.editTextScore30.text.toString().toInt(),30)
            puntuacion.AddPuntuacion(binding.editTextScore31.text.toString().toInt(),31)
            puntuacion.AddPuntuacion(binding.editTextScore32.text.toString().toInt(),32)
            puntuacion.AddPuntuacion(binding.editTextScore33.text.toString().toInt(),33)
            puntuacion.AddPuntuacion(binding.editTextScore34.text.toString().toInt(),34)
            puntuacion.AddPuntuacion(binding.editTextScore35.text.toString().toInt(),35)
            puntuacion.AddPuntuacion(binding.editTextScore36.text.toString().toInt(),36)



            //Hacer cosas con los puntos
            val intent = Intent(this@Table36Activity, TotalPointsActivity::class.java)
            intent.putExtra("puntuacion",puntuacion)
            startActivity(intent)


        }


    }
}