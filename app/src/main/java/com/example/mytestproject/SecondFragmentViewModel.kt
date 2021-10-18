package com.example.mytestproject

import android.util.Log
import androidx.lifecycle.ViewModel

class SecondFragmentViewModel : ViewModel() {

    override fun onCleared() {
        super.onCleared()
        Log.d("TAG", "$this cleared")
    }

}
