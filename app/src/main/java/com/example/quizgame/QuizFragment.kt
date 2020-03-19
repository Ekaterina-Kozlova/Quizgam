package com.example.quizgame

import android.R.attr.defaultValue
import android.R.attr.key
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.quizgame.databinding.QuizFragmentBinding


class QuizFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding:QuizFragmentBinding=  DataBindingUtil.inflate(
            inflater, R.layout.quiz_fragment, container, false)

        val bundle = this.arguments
        val myInt = bundle!!.getInt("btn_theme", defaultValue)
        if(myInt==1){
            Log.i("MainActivity", "11111111111111111111111111111111111")
        }

        return inflater.inflate(R.layout.quiz_fragment, container, false)
    }

}
