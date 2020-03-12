package com.alterevit.gorodminiapp.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alterevit.gorodminiapp.samplemodule.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(supportFragmentManager.findFragmentById(R.id.containerLayout) == null){
            supportFragmentManager.beginTransaction()
                .add(R.id.containerLayout, MainFragment.newInstance())
                .commit()
        }
    }
}
