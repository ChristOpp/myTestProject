package com.example.mytestproject

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.mytestproject.databinding.FirstFragmentBinding

class FirstFragment : Fragment(R.layout.first_fragment) {

    val viewModel by viewModels<FirstFragmentViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("TAG", "$this onViewCreated")
        Log.d("TAG", viewModel.toString())

        val viewBinding = FirstFragmentBinding.bind(view)
        viewBinding.btn.setOnClickListener {
                findNavController().navigate(R.id.action_myFragment_to_mySecondFragment)
        }
    }

    override fun onStop() {
        super.onStop()
        Log.d("TAG", "$this onStop")
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAG", "$this onPause")
    }

}
