package com.grupo3.agenda.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.grupo3.agenda.models.Personal

@Dao
interface PersonalDao {

    @Query(value = "SELECT * FROM Personal")
    suspend fun getAll():List<Personal>

    @Query(value = "SELECT * FROM Personal WHERE idEmpleado = :id")
    suspend fun getById(id:Long):Personal

    @Query(value = "SELECT * FROM Personal WHERE nombre LIKE '%' || :name || '%' OR apellidos LIKE '%' || :name || '%'")
    suspend fun getByName(name:String):List<Personal>

    @Insert
    suspend fun insert(personas: List<Personal>):List<Long>

    @Update
    suspend fun update(personal:Personal):Int
    @Delete
    suspend fun delete (personal:Personal):Int
}