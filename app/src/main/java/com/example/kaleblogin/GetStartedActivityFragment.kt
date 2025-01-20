package com.example.kaleblogin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class GetStartedActivityFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.activity_getstarted, container, false)

        // Find the button in the layout
        val createAccountButton: TextView = view.findViewById(R.id.textView)

        // Set an OnClickListener to trigger signin when the button is clicked
        createAccountButton.setOnClickListener {
            signin() // Call the signin method within this fragment
        }

        // Inflate the layout for this fragment
        return view
    }

    private fun signin() {
        // Create an instance of the SignInFragment
        val signinFragment = SigninFragment()

        // Replace the current fragment with SignInFragment
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, signinFragment) // Replace with SignInFragment
            .addToBackStack(null) // Add this transaction to the back stack
            .commit()
    }
}
