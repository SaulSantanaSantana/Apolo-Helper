package com.example.apolohelper.ui.login

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.apolohelper.R
import com.example.apolohelper.databinding.ActivityProfileBinding
import com.example.apolohelper.databinding.ActivityRegisterBinding
import com.example.apolohelper.model.AuthModel
import com.example.apolohelper.presenter.ProfilePresenter
import com.example.apolohelper.presenter.RegisterPresenter
import com.example.apolohelper.ui.PointDataActivity

class ProfileActivity: AppCompatActivity(){
    private lateinit var loginViewModel: LoginViewModel
    private lateinit var binding: ActivityProfileBinding
    private val profilePresenter = ProfilePresenter(this,AuthModel())
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Edit.setOnClickListener{
            val intent = Intent(this@ProfileActivity, EditProfileActivity::class.java)
            startActivity(intent)
        }
        profilePresenter.displayInfo()

        binding.imageView.setOnClickListener{
            val intent = Intent(this@ProfileActivity, PointDataActivity::class.java)
            startActivity(intent)
        }

        binding.btnLogOut.setOnClickListener {
            profilePresenter.logOut()
            val intent = Intent(this@ProfileActivity, LoginActivity::class.java)
            startActivity(intent)

        }

    }

    fun displayData(nombre:String, club:String, dragonera:String,arco:String){
        Log.d("Usuario dData",nombre,Throwable("t"))
        binding.name.text = nombre
        binding.textViewClubInfo.text = club
        binding.textViewDragoneraInfo.text = dragonera
        binding.textViewArchInfo.text = arco
    }
}