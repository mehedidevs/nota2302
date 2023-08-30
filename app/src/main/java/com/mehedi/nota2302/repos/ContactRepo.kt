package com.mehedi.nota2302.repos

import androidx.lifecycle.LiveData
import com.mehedi.nota2302.db.ContactDao
import com.mehedi.nota2302.models.Contact
import javax.inject.Inject

class ContactRepo @Inject constructor(private val dao: ContactDao) {



     fun getAllContact(): LiveData<List<Contact>> {
        return dao.getAllContact()
    }

    suspend fun addContact(contact: Contact) {
        dao.createContact(contact)

    }


}