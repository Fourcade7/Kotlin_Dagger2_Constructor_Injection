package com.pr7.kotlin_dagger2_constructor_injection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pr7.kotlin_dagger2_constructor_injection.dagger.DaggerGoogleComponent
import com.pr7.kotlin_dagger2_constructor_injection.dagger.Injector

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val component=DaggerGoogleComponent.create()
//        val chrome=Injector.component.getChrome()
//        chrome.chromebrowser()
//
//        val firebase=Injector.component.firebase
//        firebase.realtimeDatabase()
//
//        val youtube=Injector.component.getYoutube()
//        youtube.videoplaying()
        val google=Google()
    }
}