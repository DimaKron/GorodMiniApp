package com.alterevit.gorodminiapp.library

import androidx.fragment.app.Fragment

interface MiniAppCallback{

    fun getUid(): Long?

    fun pushFragment(fragment: Fragment)

}