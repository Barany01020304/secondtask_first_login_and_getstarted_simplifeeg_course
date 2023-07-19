package com.example.firstloginandgetstartedsomplifeegcourse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.firstloginandgetstartedsomplifeegcourse.pref.SharedaPrefHelper

class GetStarted : AppCompatActivity() {
    lateinit var loginText:TextView
    lateinit var nameEditText: EditText
    lateinit var emailEditText: EditText
    lateinit var passwordEditText: EditText
    lateinit var signupButton: Button
    lateinit var sharedaPrefHelper: SharedaPrefHelper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_started)
        defineView()
        loginText.setOnClickListener {
            moveto(MainActivity::class.java as Class<Any>)}
        signupButton.setOnClickListener {
            setSharedValue()
            moveto(DataActivity::class.java as Class<Any>)
        }
    }



    private fun setSharedValue() {
        sharedaPrefHelper = SharedaPrefHelper(this)
        sharedaPrefHelper.apply {
            name = nameEditText.text.toString()
            email = emailEditText.text.toString()
            password = passwordEditText.text.toString()
        }
    }


    private fun defineView() {
        loginText = findViewById(R.id.login_text)
        nameEditText = findViewById(R.id.username_edit_text)
        emailEditText = findViewById(R.id.email_edit_text)
        passwordEditText = findViewById(R.id.password_edit_text)
        signupButton = findViewById(R.id.sign_up_button)
    }

    private fun moveto(nextPage:Class<Any>){
        val intent= Intent(this,nextPage)
        startActivity(intent)

    }
}