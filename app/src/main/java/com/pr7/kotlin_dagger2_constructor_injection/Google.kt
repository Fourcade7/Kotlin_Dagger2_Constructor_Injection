package com.pr7.kotlin_dagger2_constructor_injection

import com.pr7.kotlin_dagger2_constructor_injection.google.Firebase

class Google {

    val firebase:Firebase=Constants.component.firebase

    init {
        firebase.realtimeDatabase()
    }

}