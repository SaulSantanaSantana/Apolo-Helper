package com.example.apolohelper.ui.login

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.apolohelper.R
import com.example.apolohelper.databinding.ActivityLoginBinding
import com.example.apolohelper.databinding.ActivityProfileEditBinding
import com.example.apolohelper.model.AuthModel
import com.example.apolohelper.presenter.EditProfilePresenter
import com.example.apolohelper.presenter.LoginPresenter

class EditProfileActivity : AppCompatActivity() {

    private lateinit var loginViewModel: LoginViewModel
    private lateinit var binding: ActivityProfileEditBinding
    private val editProfilePresenter = EditProfilePresenter(this, AuthModel())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityProfileEditBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonEditData.setOnClickListener{
            updateUserData()
        }

        editProfilePresenter.displayInfo()
    }

    fun displayData(nombre:String, club:String, dragonera:String,arco:String){
        binding.name.text = nombre
        binding.editTextClub.setText(club)
        binding.editTextDragonera.setText(dragonera)
        binding.editTextArch.setText(arco)
    }

    fun updateUserData(){
        editProfilePresenter.updateData( binding.editTextClub.text.toString(),  binding.editTextDragonera.text.toString(), binding.editTextArch.text.toString())
    }

    fun returnToProfile(){
        val intent = Intent(this@EditProfileActivity, ProfileActivity::class.java)
        startActivity(intent)
    }

}