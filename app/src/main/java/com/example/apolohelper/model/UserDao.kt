package com.example.apolohelper.model

import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore

class UserDao {

    private val db = Firebase.firestore
    private val userCollection = db.collection("usuario")

    fun storeUser(  user: User,callback: (Boolean, Exception? )-> Unit){
      val userData = hashMapOf(
        "nombre" to user.nombre,
        "correo" to user.correo,
        "imgUrl" to user.imgUrl,
        "club" to user.club, 
        "color" to user.color,
        "arco" to user.arco
       )

      userCollection.add(userData).addOnSuccessListener{ documentReference ->
        callback(true,null)
      }.addOnFailureListener{ e ->
        callback(false,e)
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