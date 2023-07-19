package com.example.firstloginandgetstartedsomplifeegcourse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.firstloginandgetstartedsomplifeegcourse.pref.SharedaPrefHelper

class DataActivity : AppCompatActivity() {
    lateinit var dataTextView: TextView
    lateinit var sharedaPrefHelper: SharedaPrefHelper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)
        dataTextView=findViewById(R.id.data_textview)
        sharedaPrefHelper=SharedaPrefHelper(this)
        dataTextView.text="your name is ${sharedaPrefHelper.name}\n your email is ${sharedaPrefHelper.email}\n your password is ${sharedaPrefHelper.password}\n and your user name is ${sharedaPrefHelper.username}"

    }
}