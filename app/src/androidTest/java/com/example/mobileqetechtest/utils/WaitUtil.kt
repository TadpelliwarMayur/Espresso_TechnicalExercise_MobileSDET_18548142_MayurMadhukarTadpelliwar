package com.example.mobileqetechtest.utils


import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.withId

object WaitUtil {
    fun enterText(viewId: Int, text: String){
        onView(withId(viewId)).perform(clearText(),typeText(text), closeSoftKeyboard())
    }

    fun clickElement(viewId: Int){
        onView(withId(viewId)).perform(click())
    }

    fun verifyElementPresent(viewId: Int, expectedLable: String){
        onView(withId(viewId)).check(withText(expectedLable))
    }
}
