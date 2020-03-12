package com.example.quizgame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.quizgame.databinding.ActivityMainBinding
import com.example.quizgame.databinding.TitleFragmentBinding

/**
 * A simple [Fragment] subclass.
 */
private lateinit var binding: ActivityMainBinding

class TitleFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                                savedInstanceState: Bundle?): View? {
        //val binding = DataBindingUtil.inflate<TitleFragmentBinding>(
        //    inflater, R.layout.title_fragment, container, false)
        val binding:TitleFragmentBinding = DataBindingUtil.inflate(
            inflater, R.layout.title_fragment, container, false)
        binding.btnStart.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_titleFragment_to_themeFragment)
        }
        return binding.root
    }

}
