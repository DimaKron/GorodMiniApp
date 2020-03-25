package com.alterevit.gorodminiapp.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.alterevit.gorodminiapp.library.MiniAppCallback
import com.alterevit.gorodminiapp.samplemodule.MainFragment
import kotlin.random.Random

class MainActivity : AppCompatActivity(), MiniAppCallback {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(supportFragmentManager.findFragmentById(R.id.containerLayout) == null){
            supportFragmentManager.beginTransaction()
                .add(R.id.containerLayout, MainFragment.newInstance())
                .commit()
        }
    }

    override fun getUid() = Random.nextLong()

    override fun pushFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.containerLayout, MainFragment.newInstance())
            .addToBackStack(null)
            .commit()
    }
}
