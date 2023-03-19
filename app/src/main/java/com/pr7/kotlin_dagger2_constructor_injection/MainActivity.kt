package com.pr7.kotlin_dagger2_constructor_injection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pr7.kotlin_dagger2_constructor_injection.dagger.DaggerGoogleComponent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val component=DaggerGoogleComponent.create()
//        val chrome=Constants.component.getChrome()
//        chrome.chromebrowser()

//        val firebase=Constants.component.firebase
//        firebase.realtimeDatabase()

//        val youtube=Constants.component.getYoutube()
//        youtube.videoplaying()
        val google=Google()
    }
}