package com.example.quizgame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.quizgame.databinding.ActivityMainBinding
import com.example.quizgame.databinding.TitleFragmentBinding

/**
 * A simple [Fragment] subclass.
 */
private lateinit var binding: ActivityMainBinding

class TitleFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                                savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<TitleFragmentBinding>(
            inflater, R.layout.title_fragment, container, false)
        return binding.root
    }

}
