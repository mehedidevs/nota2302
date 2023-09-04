package com.mehedi.nota2302.ui.addnote

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.mehedi.nota2302.utils.BaseFragment
import com.mehedi.nota2302.models.Contact
import com.mehedi.nota2302.databinding.FragmentAddNoteBinding
import com.mehedi.nota2302.ui.home.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AddNoteFragment : BaseFragment<FragmentAddNoteBinding>(FragmentAddNoteBinding::inflate) {


    val viewModel: AddContactViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        binding.btvCtxt.setOnClickListener {



        }


        binding.buttonSubmit.setOnClickListener {

            val contact = Contact(
                0,
                binding.editTextName.text.toString(),
                binding.editTextEmail.text.toString(),
                binding.editTextMobile.text.toString()
            )





            viewModel.addContact(contact)



            findNavController().popBackStack()
        }


    }

}