package com.example.mobileqetechtest.pages

import com.example.mobileqetechtest.R
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.example.mobileqetechtest.utils.WaitUtil

class LoginPage {
    // 1. Locate and find the below elements from LoginPage:
    //    test tag or ID "username" -----> Text input
    //    test tag or ID "password" -----> Text input
    //    test tag or ID "loginButton" --> Button

    private val username = R.id.username
    private val password = R.id.password
    private val loginButton = R.id.loginButton

    fun enterUsername(username: String): LoginPage(){
        WaitUtil.enterText(username)
        return this
    }

    fun enterPassword(userpassword: String): LoginPage(){
        WaitUtil.enterText(password)
        return this
    }

    fun clickLogin(): LoginPage(){
        clickElement(loginButton)
        return this
    }

    fun clickEmail(): LoginPage(){
        clickElement(username)
        return this
    }

    // 2.Create a method "enterUsername" to enter username value to the username field

    // 3.Create a method "enterPassword" to enter password value to the password field

    // 4. Create a method "clickLogin" to click on loginButton
}
