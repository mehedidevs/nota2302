package com.mehedi.nota2302.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.mehedi.nota2302.models.Contact

@Database(entities = [Contact::class], version = 1)
abstract class ContactDatabase : RoomDatabase() {

    abstract fun getContactDao(): ContactDao


    companion object {

        private var db: ContactDatabase? = null

        fun getInstance(context: Context): ContactDatabase {

            return if (db == null) {

                db = Room
                    .databaseBuilder(
                        context,
                        ContactDatabase::class.java,
                        "contact_db"
                    ).build()

                db as ContactDatabase

            } else {
                db as ContactDatabase

            }


        }


    }

}