package com.akirachix.new_mentorgram

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.akirachix.inotaplus.MainActivity
import com.akirachix.inotaplus.databinding.ActivityLoginBinding


class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.idRegister.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
//        enableEdgeToEdge()
//        setContentView(R.layout.activity_login)
//        val idRegister = findViewById<TextView>(R.id.idRegister)
//        idRegister.setOnClickListener {
//            val intent = Intent( this, MainActivity::class.java)
//            startActivity(intent)
//        }


        binding.button2.setOnClickListener {
            validateRegistrationLogin()
        }
    }


    fun validateRegistrationLogin(){
        var formError=false
        val firstName=binding.etFullName.text.toString()
        if(firstName.isBlank()){
            formError=true
            binding.tilFistNameLogin.error="Last name is required"
        }

        val password=binding.etPasswordLogin.text.toString()
        if(password.isBlank()){
            formError=true
            binding.tilPasswordLogin.error="Password is required"
        }
        val registrationNumber=binding.etMembershipNumberLogin.text.toString()
        if(registrationNumber.isBlank()){
            formError=true
            binding.tilMembershipNumberLogin.error="Password is required"
        }

    }
    fun clearForms(){
        binding.tilFistNameLogin.error=null
        binding.tilPasswordLogin.error=null
        binding.tilMembershipNumberLogin.error=null

    }
}