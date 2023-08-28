package com.mehedi.nota2302.ui

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.mehedi.nota2302.utils.BaseFragment
import com.mehedi.nota2302.models.Contact
import com.mehedi.nota2302.databinding.FragmentAddNoteBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AddNoteFragment : BaseFragment<FragmentAddNoteBinding>(FragmentAddNoteBinding::inflate) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.buttonSubmit.setOnClickListener {

            val contact = Contact(
                0,
                binding.editTextName.text.toString(),
                binding.editTextEmail.text.toString(),
                binding.editTextMobile.text.toString()
            )



            findNavController().popBackStack()
        }


    }

}