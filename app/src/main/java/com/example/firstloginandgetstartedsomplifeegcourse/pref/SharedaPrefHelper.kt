package com.example.firstloginandgetstartedsomplifeegcourse.pref

import android.content.Context
import android.content.SharedPreferences

class SharedaPrefHelper(var context:Context) {
    companion object{
        private const val prefName="loginAnd"
        private const val keyName="name"
        private const val keyEmail="email"
        private const val keyPassword="password"
        private const val keyUserName="username"
    }
    private val pref:SharedPreferences by lazy {
        context.getSharedPreferences(prefName,Context.MODE_PRIVATE)
    }
     var name:String?
        get() = pref.getString(keyName,"name")
        set(value)=pref.edit().putString(keyName,value).apply()
     var email:String?
        get() = pref.getString(keyEmail,"email")
        set(value) = pref.edit().putString(keyEmail,value).apply()
     var password:String?
        get() = pref.getString(keyPassword,"password")
        set(value) = pref.edit().putString(keyPassword,value).apply()
     var username:String?
        get() = pref.getString(keyUserName,"username")
        set(value) = pref.edit().putString(keyUserName,value).apply()
}