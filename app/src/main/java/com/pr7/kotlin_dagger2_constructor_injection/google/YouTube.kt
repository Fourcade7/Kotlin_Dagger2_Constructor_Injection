package com.pr7.kotlin_dagger2_constructor_injection.google

import android.util.Log
import com.pr7.kotlin_dagger2_constructor_injection.Constants.TAG
import javax.inject.Inject

class YouTube @Inject constructor(){
    init {
        Log.d(TAG, "Youtube class has invoked: ")
    }

    fun videoplaying(){
        Log.d(TAG, "videoplaying video is playing...: ")
    }
}