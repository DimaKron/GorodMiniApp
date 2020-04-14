package com.alterevit.gorodminiapp.library

import androidx.fragment.app.Fragment

interface MiniAppCallback{

    fun getToken(): String?

    fun pushFragment(fragment: Fragment)

    fun logEvent(action: String, category: String, label: String? = null, value: Long? = null)

}