package com.example.apolohelper.model

import android.util.Log

interface AuthModelInterface{
    fun register(userName: String, password: String, email:String)
}
class AuthModel(): AuthModelInterface{
    private val authManager=AuthManager()
    private val userDao= UserDao()
    override fun register(userName: String, password: String, email: String) {
        Log.d("model",userName + email)
        authManager.register(email,password, fun(c,_) {
            if(c){
                val user = User("",userName,email,"","","",)
                userDao.storeUser(user,fun(_,_){})
            }
        })
    }

}