package com.pr7.kotlin_dagger2_constructor_injection.google

import android.util.Log
import com.pr7.kotlin_dagger2_constructor_injection.Constants.TAG
import javax.inject.Inject

class Firebase @Inject constructor() {

    init {
        Log.d(TAG, "Firebase Class has invoked: ")
    }

    fun realtimeDatabase(){
        Log.d(TAG, "realtimeDatabase: is running")
    }
}