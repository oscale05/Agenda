package com.grupo3.agenda.models

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Personal(
    @PrimaryKey(autoGenerate = true)
    var idEmpleado:Long,
    var nombre:String,
    var apellidos:String,
    var email:String,
    var telefono:String,
    var edad:Int
)