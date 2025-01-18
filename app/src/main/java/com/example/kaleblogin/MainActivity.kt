package com.example.kaleblogin

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Fix for system bars inset
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            return@setOnApplyWindowInsetsListener insets // Fix the return type issue
        }

        // Setting up button listener
        val btnOpenFragments = findViewById<Button>(R.id.btnOpenFragments)
        btnOpenFragments.setOnClickListener {
            val intent = Intent(this, FragmentExampleActivity::class.java)
            startActivity(intent)
        }
    }

    fun createaccount(view: View) {
        val intent = Intent(this, GetStartedActivity::class.java)
        startActivity(intent)
    }

    fun validateForm(view: View) {
        val email = findViewById<EditText>(R.id.emailEditText).text.toString()
        val password = findViewById<EditText>(R.id.passwordEditText).text.toString()

        // Instantiate CredentialsManager
        val credentialsManager = CredentialsManager()

        // Validate email using the CredentialsManager
        if (!credentialsManager.isEmailValid(email)) {
            findViewById<EditText>(R.id.emailEditText).error = "Invalid email"
        }
        // Validate password using the CredentialsManager
        else if (!credentialsManager.isPasswordValid(password)) {
            findViewById<EditText>(R.id.passwordEditText).error = "Wrong Password!"
        } else {
            Toast.makeText(this, "Login successful!", Toast.LENGTH_SHORT).show()
        }
    }

    fun signin(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
