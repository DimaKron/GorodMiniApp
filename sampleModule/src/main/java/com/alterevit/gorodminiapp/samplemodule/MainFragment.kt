package com.alterevit.gorodminiapp.samplemodule

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.alterevit.gorodminiapp.library.MiniAppCallback
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment: Fragment(){

    companion object{
        fun newInstance() = MainFragment()
    }

    private var eventListener: MiniAppCallback? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        eventListener = context as? MiniAppCallback
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View  =
        inflater.inflate(R.layout.fragment_main, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button.setOnClickListener { textView.text = eventListener?.getUid() }
    }

}