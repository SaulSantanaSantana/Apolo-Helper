package com.example.apolohelper.model

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.firebase.auth.FirebaseAuth



class AuthManager {

    private lateinit var auth: FirebaseAuth

    init {
        auth = FirebaseAuth.getInstance()
        // añadir listener boton de google
    }

    fun register(email: String, password: String, callback: (Boolean,String?, Exception?) -> Unit) {
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    task.result.user?.let { callback(true, it.uid , null) } // Successful registration
                } else {
                    callback(false, null ,task.exception) // Registration failure with exception
                }
            }
    }

    fun logInUser(email: String, password: String, callback: (Boolean, Exception?) -> Unit) {
        auth.signInWithEmailAndPassword(password, email)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    callback(true, null) // Successful login
                } else {
                    callback(false, task.exception) // Login failure with exception
                }
            }
    }

    fun getUserUid(): String? {
        return auth.currentUser?.uid
    }


    fun logOut() {
        auth.signOut()
    }
}

