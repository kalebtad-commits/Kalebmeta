package com.example.kaleblogin

import android.content.Intent
import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.io.Console
import android.util.Log

class SigninFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_signin, container, false)

        // Find the button in the layout
        val createAccountButton: TextView = view.findViewById(R.id.textView3)

        // Set an OnClickListener to trigger createAccount when the button is clicked
        createAccountButton.setOnClickListener {
            createaccount()
        }


        // Inflate the layout for this fragment
        return view
    }



    fun createaccount() {
        Log.e("debugg","Hello -debugging");
        // Replace the fragment in the container with the new fragment
        val getstartedFragment = GetStartedActivityFragment() // Replace with your target fragment\

        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, getstartedFragment) // Ensure fragment_container is the correct container ID
            .addToBackStack(null) // Optional: Add to back stack
            .commit()
    }
//
//    fun validateForm(view: View) {
//
//        val email = findViewById<EditText>(R.id.emailEditText).text.toString()
//        val password = findViewById<EditText>(R.id.passwordEditText).text.toString()
//
//        // Instantiate CredentialsManager
//        val credentialsManager = CredentialsManager()
//
//        // Validate email using the CredentialsManager
//        if (!credentialsManager.isEmailValid(email)) {
//            findViewById<EditText>(R.id.emailEditText).error = "Invalid email"
//        }
//        // Validate password using the CredentialsManager
//        else if (!credentialsManager.isPasswordValid(password)) {
//            findViewById<EditText>(R.id.passwordEditText).error = "Wrong Password!"
//        } else {
//            Toast.makeText(this, "Login successful!", Toast.LENGTH_SHORT).show()
//        }
//    }
//
//    fun signin(view: View) {
//        val intent = Intent(this, MainActivity::class.java)
//        startActivity(intent)
//    }
}