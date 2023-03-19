package com.pr7.kotlin_dagger2_constructor_injection.dagger

import com.pr7.kotlin_dagger2_constructor_injection.google.Chrome
import com.pr7.kotlin_dagger2_constructor_injection.google.Firebase
import com.pr7.kotlin_dagger2_constructor_injection.google.YouTube
import dagger.Component


@Component
interface GoogleComponent {

    fun getChrome():Chrome
    val firebase:Firebase
    fun getYoutube():YouTube
}