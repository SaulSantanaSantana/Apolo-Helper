package com.example.apolohelper.model

import android.util.Log
import javax.security.auth.callback.Callback

interface AuthModelInterface{
    fun register(userName: String, password: String, email:String, callback: (Boolean,Exception?)->Unit)
    fun logInUser(email:String, password: String, callback: (Boolean,Exception?)->Unit)

    fun getUserData(callback: (User?, Exception?) -> Unit)

    fun updateUser(user: User)
}
class AuthModel(): AuthModelInterface{
    private val authManager=AuthManager()
    private val userDao= UserDao()
    override fun register(userName: String, password: String, email: String, callback: (Boolean,Exception?)->Unit) {
        authManager.register(email,password, fun(c,id,_) {
            if(c && id!=null){
                val user = User("",userName,email,"","","",)
                userDao.storeUser(user,id,fun(_,_){})
                callback(true,null)
            }else if (!c){
                callback(false,null)
            }
        })
    }
    override fun logInUser(email: String, password: String, callback: (Boolean,Exception?)->Unit){
        authManager.logInUser(email,password, fun(c,_){
            if(c){
                callback(true,null)
            }else{
                callback(false,null)
            }
        })
    }

    override fun getUserData(callback: (User?, Exception?) -> Unit){

       val userUid = authManager.getUserUid()
        val userDao = UserDao()
        if (userUid != null) {
            userDao.getUser(userUid,fun(u,_){
                if(u!=null){
                    callback(u,null)
                }else{
                    callback(null,null)
                }
            })
        }
    }

    override fun updateUser(user: User){
        val userUid = authManager.getUserUid()
        val userDao = UserDao()
        if (userUid != null) {
            userDao.updateUser(userUid, user, fun(_,_){})
        }

    }

}