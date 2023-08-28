package com.mehedi.nota2302.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.mehedi.nota2302.models.Contact
import com.mehedi.nota2302.databinding.ItemContactBinding

class ContactAdapter(
    private val contactList: List<Contact>,
    private var listener: Listener
) :
    Adapter<ContactAdapter.ContactVH>() {


    interface Listener {
        fun contactClick(contact: Contact)
    }

    class ContactVH(val binding: ItemContactBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactVH {
        return ContactVH(
            ItemContactBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    override fun getItemCount(): Int {
        return contactList.size
    }

    override fun onBindViewHolder(holder: ContactVH, position: Int) {
        val contact = contactList[position]

        holder.binding.nameTv.text = contact.name
        holder.binding.emailTv.text = contact.email
        holder.binding.mobileTv.text = contact.mobile

        holder.itemView.setOnClickListener {
            listener.contactClick(contact)


        }


    }


}