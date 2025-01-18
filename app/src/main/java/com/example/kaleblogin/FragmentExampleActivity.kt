package com.example.kaleblogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class FragmentExampleActivity : AppCompatActivity() {

    private var showingFragmentA = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_example)

        // Load the initial fragment
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, FragmentA())
            .commit()

        val switchButton: Button = findViewById(R.id.switch_fragment_button)
        switchButton.setOnClickListener {
            if (showingFragmentA) {
                replaceFragment(FragmentB())
            } else {
                replaceFragment(FragmentA())
            }
            showingFragmentA = !showingFragmentA
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}