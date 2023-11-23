package com.example.apolohelper.model

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.apolohelper.R
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.firebase.auth.FirebaseAuth

class AuthManager : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_register) --> añadir la vista

        auth= FirebaseAuth.getInstance()

        //añadir listener boton de google
    }

    public override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.
        val currentUser = auth.currentUser
        if (currentUser != null) {
            //Redirigir a pantalla de login
        }
    }

    fun Register(email : String, password : String ){
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    val user = auth.currentUser
                    //updateUI(user)
                    //logica de usuairo entrando
                } else {
                    //Fallo de registro
                }
            }
    }

    fun LogInUser(email: String, password: String){
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    val user = auth.currentUser
                    //updateUI(user)
                } else {
                    // If sign in fails, display a message to the user.
                }
            }
    }

    fun LogOut(){
        auth.signOut()
    }



}