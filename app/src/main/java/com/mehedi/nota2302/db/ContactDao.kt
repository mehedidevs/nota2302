package com.mehedi.nota2302.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.mehedi.nota2302.models.Contact

@Dao
interface ContactDao {

    // CRUD
    @Insert
    suspend fun createContact(contact: Contact)

    @Update
    suspend fun updateContact(contact: Contact)

    @Delete
    suspend fun deleteContact(contact: Contact)

    @Query("SELECT * FROM Contact")
    suspend fun getAllContact(): List<Contact>


}