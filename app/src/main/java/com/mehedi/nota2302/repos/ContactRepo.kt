package com.mehedi.nota2302.repos

import com.mehedi.nota2302.db.ContactDao
import com.mehedi.nota2302.models.Contact
import javax.inject.Inject

class ContactRepo @Inject constructor(private val dao: ContactDao) {


    fun getAllContact(): List<Contact> {
        return dao.getAllContact()
    }


}