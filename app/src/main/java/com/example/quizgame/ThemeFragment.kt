package com.example.quizgame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.quizgame.databinding.ThemeFragmentBinding


class ThemeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: ThemeFragmentBinding =  DataBindingUtil.inflate(
            inflater, R.layout.theme_fragment, container, false)

        return inflater.inflate(R.layout.theme_fragment, container, false)
    }



}

