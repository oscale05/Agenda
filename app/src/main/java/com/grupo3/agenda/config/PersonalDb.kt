package com.grupo3.agenda.config

import androidx.room.Database
import androidx.room.RoomDatabase
import com.grupo3.agenda.dao.PersonalDao
import com.grupo3.agenda.models.Personal


@Database(
    entities = [Personal::class],
    version = 1
)
abstract class PersonalDb:RoomDatabase() {
    abstract fun personalDao():PersonalDao
}