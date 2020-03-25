package com.alterevit.gorodminiapp.library

import androidx.fragment.app.Fragment

interface MiniAppCallback{

    fun getToken(): String?

    fun pushFragment(fragment: Fragment)

}