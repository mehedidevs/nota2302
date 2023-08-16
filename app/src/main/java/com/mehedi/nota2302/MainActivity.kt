package com.mehedi.nota2302

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.room.Room
import com.mehedi.nota2302.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var db: ContactDatabase


    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        db = Room
            .databaseBuilder(
                applicationContext,
                ContactDatabase::class.java,
                "contact_db"
            ).allowMainThreadQueries()
            .build()


        binding.buttonSubmit.setOnClickListener {

            val contact = Contact(
                0,
                binding.editTextName.text.toString(),
                binding.editTextEmail.text.toString(),
                binding.editTextMobile.text.toString()
            )

            db.getContactDao().createContact(contact)
        }


        binding.buttonGet.setOnClickListener {

            val contactList: List<Contact> = db.getContactDao().getAllContact()
            var contactlist =""

            contactList.forEach {
                contactlist += "${it.name},${it.email},${it.mobile}\n\n"


            }
            binding.hudaiText.text = contactlist


        }


    }
}