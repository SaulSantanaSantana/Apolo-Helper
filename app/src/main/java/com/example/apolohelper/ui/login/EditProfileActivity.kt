package com.example.apolohelper.ui.login

import android.content.Intent
import android.os.Bundle
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
    private val loginPresenter = EditProfilePresenter(this, AuthModel())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityProfileEditBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}