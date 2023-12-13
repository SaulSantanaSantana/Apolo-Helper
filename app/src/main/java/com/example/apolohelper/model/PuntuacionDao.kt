package com.example.apolohelper.model

import android.util.Log
import com.google.firebase.Firebase
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.core.Query
import com.google.firebase.firestore.toObject
import java.util.Date


class PuntuacionDao {

    private val db = FirebaseFirestore.getInstance()
    private val puntuacionCollection = db.collection("puntuaciones")

    fun storePuntuacion( puntuacion: Puntuacion,uid:String,callback: (Boolean, Exception? )-> Unit){
        val puntuacionData = hashMapOf(
            "userUid" to uid,
            "diana" to puntuacion.diana,
            "letra" to puntuacion.letra,
            "modalidad" to puntuacion.modalidad,
            "categoria" to puntuacion.categoria,
            "distancia" to puntuacion.distancia,
            "numFlechas" to puntuacion.numFlechas,
            "total" to puntuacion.total,
            "puntuaciones" to puntuacion.puntuaciones,
            "fecha" to Date()
        )
        puntuacionCollection.document(uid).set(puntuacionData).addOnSuccessListener{ documentReference ->
            callback(true,null)
        }.addOnFailureListener{ e ->
            callback(false,e)
        }
    }

    fun getLastPuntuacion(userId: String,callback: (Puntuacion?, Exception?) -> Unit){
        puntuacionCollection.whereEqualTo("userId",userId)
            .orderBy("fecha",
                com.google.firebase.firestore.Query.Direction.DESCENDING)
            .limit(1)
            .get().addOnCompleteListener { task ->
                if(task.isSuccessful){
                    val doc = task.result.documents.get(0)
                    val puntuacion = doc.toObject(Puntuacion::class.java)
                    callback(puntuacion,null)
                }
                callback(null,null)
            }
    }

}