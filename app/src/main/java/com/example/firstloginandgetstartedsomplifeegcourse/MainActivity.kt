package com.example.firstloginandgetstartedsomplifeegcourse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.firstloginandgetstartedsomplifeegcourse.pref.SharedaPrefHelper

class MainActivity : AppCompatActivity() {
    lateinit var registerText:TextView
    lateinit var userNameEdittext: EditText
    lateinit var passwordEditText: EditText
    lateinit var signinButton: Button
    lateinit var sharedaPrefHelper: SharedaPrefHelper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        declareView()
        signinButton.setOnClickListener {
            sharedaPrefHelper= SharedaPrefHelper(this)
            sharedaPrefHelper.username=userNameEdittext.text.toString()
            sharedaPrefHelper.password=passwordEditText.text.toString()

        }


        registerText.setOnClickListener {
            moveto(GetStarted::class.java as Class<Any>)
        }
    }

    private fun declareView() {
        registerText = findViewById(R.id.register_now_text)
        userNameEdittext = findViewById(R.id.username_edit_text)
        passwordEditText = findViewById(R.id.password_edit_text)
        signinButton = findViewById(R.id.sign_in_button)
    }

    private fun moveto(nextPage:Class<Any>){
        val intent=Intent(this,nextPage)
        startActivity(intent)

    }
}