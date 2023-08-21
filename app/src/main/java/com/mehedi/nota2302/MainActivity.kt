package com.mehedi.nota2302

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.room.Room
import com.mehedi.nota2302.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), ContactAdapter.Listener {

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

            val adapter = ContactAdapter(contactList, this@MainActivity)

            binding.contactRCV.adapter = adapter


        }


    }

    override fun contactClick(contact: Contact) {

        val intent = Intent(this@MainActivity, DetailsActivity::class.java)
        intent.putExtra(DetailsActivity.contactKey, contact)
        startActivity(intent)


    }
}