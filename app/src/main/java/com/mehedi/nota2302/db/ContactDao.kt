package com.mehedi.nota2302.db

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
    fun createContact(contact: Contact)

    @Update
    fun updateContact(contact: Contact)

    @Delete
    fun deleteContact(contact: Contact)

    @Query("SELECT * FROM Contact")
    fun getAllContact() : List<Contact>






}