package com.pr7.kotlin_dagger2_constructor_injection.google

import android.util.Log
import com.pr7.kotlin_dagger2_constructor_injection.Constants.TAG
import javax.inject.Inject

class Chrome @Inject constructor(
    val firebase: Firebase,
    val youTube: YouTube
) {
    init {
        Log.d(TAG, "Chrome Class has invoked: ")
        firebase.realtimeDatabase()
        youTube.videoplaying()
    }

    fun chromebrowser(){
        Log.d(TAG, "chromebrowser: is running...")
    }
}