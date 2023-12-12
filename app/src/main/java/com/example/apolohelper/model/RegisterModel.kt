package com.example.apolohelper.model

import android.util.Log
import javax.security.auth.callback.Callback

interface AuthModelInterface{
    fun register(userName: String, password: String, email:String, callback: (Boolean,Exception?)->Unit)
}
class AuthModel(): AuthModelInterface{
    private val authManager=AuthManager()
    private val userDao= UserDao()
    override fun register(userName: String, password: String, email: String, callback: (Boolean,Exception?)->Unit) {
        Log.d("model",userName + email)
        authManager.register(email,password, fun(c,_) {
            if(c){
                val user = User("",userName,email,"","","",)
                userDao.storeUser(user,fun(_,_){})
                callback(true,null)
            }else if (!c){
                callback(false,null)
            }
        })
    }

}