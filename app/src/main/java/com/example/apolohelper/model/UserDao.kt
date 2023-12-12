package com.example.apolohelper.model

import com.google.firebase.Firebase
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.toObject


class UserDao {

    private val db = FirebaseFirestore.getInstance()
    private val userCollection = db.collection("usuario")

    fun storeUser(  user: User,uid:String,callback: (Boolean, Exception? )-> Unit){
      val userData = hashMapOf(
        "nombre" to user.nombre,
        "correo" to user.correo,
        "imgUrl" to user.imgUrl,
        "club" to user.club, 
        "color" to user.color,
        "arco" to user.arco
       )
        userCollection.document(uid).set(userData).addOnSuccessListener{ documentReference ->
            callback(true,null)
        }.addOnFailureListener{ e ->
            callback(false,e)
        }
    }

    fun getUser(userId: String,callback: (User?, Exception?) -> Unit){
        val userDocument = userCollection.document(userId).get().addOnCompleteListener{ task->
            if(task.isSuccessful){
                val doc = task.result
                if(doc != null && doc.exists()){
                    val user = doc.toObject(User::class.java)
                    callback(user,null)
                }else{
                    callback(null,null)
                }
            }else{
                callback(null,task.exception)
            }
        }
    }

    fun updateUser(userId : String, user: User, callback: (Boolean, Exception?)-> Unit){
      val userDocument = userCollection.document(userId)
        val userData = mapOf(
            "nombre" to user.nombre,
            "correo" to user.correo,
            "imgUrl" to user.imgUrl,
            "club" to user.club,
            "color" to user.color,
            "arco" to user.arco
        )

        userDocument.update(userData)
            .addOnSuccessListener {
                callback(true,null)
            }
            .addOnFailureListener{e->
                callback(false,e)
            }
    }



}