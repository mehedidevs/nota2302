package com.mehedi.nota2302.ui.addnote

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mehedi.nota2302.di.NotaApp
import com.mehedi.nota2302.models.Contact
import com.mehedi.nota2302.repos.ContactRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AddContactViewModel @Inject constructor(var repo: ContactRepo) :
    ViewModel() {


    fun addContact(contact: Contact) {

        viewModelScope.launch {
            repo.addContact(contact)
        }


    }


}