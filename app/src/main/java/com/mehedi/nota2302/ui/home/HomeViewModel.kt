package com.mehedi.nota2302.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mehedi.nota2302.models.Contact
import com.mehedi.nota2302.repos.ContactRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(var repos: ContactRepo) : ViewModel() {
//
//
//    private var _allContact: MutableLiveData<List<Contact>> = MutableLiveData<List<Contact>>()
//
//    val allContact: LiveData<List<Contact>>
//        get() = _allContact


    fun getAllContact(): LiveData<List<Contact>> {


        return repos.getAllContact()


    }


}