package com.example.mytestproject

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels

class SecondFragment() : Fragment(R.layout.second_fragment) {

    val viewModel by viewModels<SecondFragmentViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("TAG", "$this onViewCreated")
        Log.d("TAG", viewModel.toString())
    }

}
