package com.example.mobileqetechtest.pages

import com.example.mobileqetechtest.R
import com.example.mobileqetechtest.utils.WaitUtil

class OtpPage {
    // 1. Locate and find the below elements from OtpPage:
    //     test tag or ID "otpInput" -------> Text input
    //     test tag or ID "verifyButton" ---> Button

    private val otpInput = R.id.otpInput
    private val verifyButton = R.id.verifyButton


    fun enterOtp(otp: String): OtpPage(){
        WaitUtil.enterText(otp)
        return this
    }

    fun clickVerify(): OtpPage(){
        WaitUtil.clickElement(verifyButton)
        return this
    }
    // 2. Create a method "enterOtp" to enter otpInput value to the otpInput field

    // 3. Create a method "clickVerify" to verify the  entered otpInput value
}
