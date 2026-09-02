package com.example.mobileqetechtest.tests

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.mobileqetechtest.MainActivity
import com.example.mobileqetechtest.base.BaseTest
import com.example.mobileqetechtest.pages.HomePage
import com.example.mobileqetechtest.pages.LoginPage
import com.example.mobileqetechtest.pages.OtpPage
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class LoginTest: BaseTest() {

    // Write  code to initialise the JUnit test rule
    @get:Rule
    val rule = AndroidScenarioRule(MainActivity::class.java)

    @Test
    fun successfulLogin() {
        // Write a successful login test for the Android app login scenario by:
        // 1. Entering username and password in the LoginPage and click the Login Button
        // 2. Entering OtpInput in the OtpPage and click verify
        // 3. Finally verify that the HomePage with home label is displayed,
        //     if not fail the test with the message "Home Page is not displayed".

        LoginPage()
            .enterUsername("username")
            .enterPassword("password")
            .clickLogin()

        OtpPage()
            .enterOtp("1234")
            .clickVerify()

        HomePage()
            .verifyLabelPresent()
    }
}