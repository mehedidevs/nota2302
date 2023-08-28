package com.mehedi.nota2302.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.mehedi.nota2302.utils.BaseFragment
import com.mehedi.nota2302.models.Contact
import com.mehedi.nota2302.R
import com.mehedi.nota2302.databinding.FragmentHomeBinding
import com.mehedi.nota2302.repos.ContactRepo
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment :
    BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate),
    ContactAdapter.Listener {

    val viewModel: HomeViewModel by viewModels()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)





        viewModel.allContact.observe(viewLifecycleOwner) {

            val adapter = ContactAdapter(it, this)

            binding.contactRCV.adapter = adapter


        }





        binding.addBtn.setOnClickListener {

            findNavController().navigate(R.id.action_homeFragment_to_addNoteFragment)


        }


    }

    override fun contactClick(contact: Contact) {


    }


}