package com.alterevit.gorodminiapp.library

import androidx.fragment.app.Fragment

interface MiniAppCallback{

    fun getUid(): String?

    fun pushFragment(fragment: Fragment)

}