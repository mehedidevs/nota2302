package com.mehedi.nota2302.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.mehedi.nota2302.models.Contact

@Database(entities = [Contact::class], version = 1)
abstract class ContactDatabase : RoomDatabase() {

    abstract fun getContactDao(): ContactDao

}