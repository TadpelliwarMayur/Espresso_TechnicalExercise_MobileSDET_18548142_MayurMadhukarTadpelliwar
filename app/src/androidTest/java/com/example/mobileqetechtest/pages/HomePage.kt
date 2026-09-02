package com.example.mobileqetechtest.pages

import com.example.mobileqetechtest.R
import com.example.mobileqetechtest.utils.WaitUtil


class HomePage {
    // 1. Locate and find the below element from Home page:
    //      test tag or ID "home" or ID R.id.home ---> Text label


    private val home = R.id.home


    fun verifyLabelPresent(): HomePage {
        WaitUtil.verifyElementPresent(home)
        return this
    }


    // 2. Return whether the home label found using method "isHomeDisplayed()"
}
