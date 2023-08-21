package com.mehedi.nota2302

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.mehedi.nota2302.databinding.ItemContactBinding

class ContactAdapter(val contactList: List<Contact>, var listener: ContactAdapter.Listener) :
    RecyclerView.Adapter<ContactVH>() {


    interface Listener {
        fun contactClick(contact: Contact)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactVH {


        val contactVH = ContactVH(
            ItemContactBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

        return contactVH

    }

    override fun getItemCount(): Int {
        return contactList.size
    }

    override fun onBindViewHolder(holder: ContactVH, position: Int) {
        var contact = contactList[position]

        holder.binding.nameTv.text = contact.name
        holder.binding.emailTv.text = contact.email
        holder.binding.mobileTv.text = contact.mobile

        holder.itemView.setOnClickListener {
            listener.contactClick(contact)


        }


    }


}