package com.example.kaleblogin

import org.junit.Test
import org.junit.Assert.*

class CredentialsManagerTest {

    @Test
    fun givenEmptyEmail_thenReturnFalse() {
        val credentialsManager = CredentialsManager()
        val isEmailValid = credentialsManager.isEmailValid("")
        assertFalse(isEmailValid)
    }

    @Test
    fun givenInvalidEmailFormat_thenReturnFalse() {
        val credentialsManager = CredentialsManager()
        val isEmailValid = credentialsManager.isEmailValid("invalid-email")
        assertFalse(isEmailValid)
    }

    @Test
    fun givenValidEmail_thenReturnTrue() {
        val credentialsManager = CredentialsManager()
        val isEmailValid = credentialsManager.isEmailValid("test@example.com")
        assertTrue(isEmailValid)
    }

    @Test
    fun givenEmptyPassword_thenReturnFalse() {
        val credentialsManager = CredentialsManager()
        val isPasswordValid = credentialsManager.isPasswordValid("")
        assertFalse(isPasswordValid)
    }

    @Test
    fun givenValidPassword_thenReturnTrue() {
        val credentialsManager = CredentialsManager()
        val isPasswordValid = credentialsManager.isPasswordValid("password123")
        assertTrue(isPasswordValid)
    }

    @Test
    fun givenShortPassword_thenReturnFalse() {
        val credentialsManager = CredentialsManager()
        val isPasswordValid = credentialsManager.isPasswordValid("123")
        assertFalse(isPasswordValid)
    }
}