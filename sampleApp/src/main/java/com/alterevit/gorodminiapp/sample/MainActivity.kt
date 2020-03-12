package com.alterevit.gorodminiapp.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alterevit.gorodminiapp.library.MiniAppEventListener
import com.alterevit.gorodminiapp.samplemodule.MainFragment
import java.util.*

class MainActivity : AppCompatActivity(), MiniAppEventListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(supportFragmentManager.findFragmentById(R.id.containerLayout) == null){
            supportFragmentManager.beginTransaction()
                .add(R.id.containerLayout, MainFragment.newInstance())
                .commit()
        }
    }

    override fun getUid() = "RaNdoM_uID${UUID.randomUUID()}"
}
