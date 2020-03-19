package com.example.quizgame

import android.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.quizgame.databinding.ThemeFragmentBinding
import kotlinx.android.synthetic.main.theme_fragment.*

class ThemeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding:ThemeFragmentBinding =  DataBindingUtil.inflate(
            inflater, R.id., container, false)

        //val button1: (Button)findViewById(R.id.btn_geography)
        //Button button2 = (Button)findViewById(R.id.btn_kino);
        //Button button3 = (Button)findViewById(R.id.btn_literature);

        binding.btnGeography.setOnClickListener {

            /*val fragment = Fragment()
            //ThemeFragment frg:  ThemeFragment()
            val bundle = Bundle()
            bundle.putInt("btn_theme", 1);
            fragment.arguments = bundle;
 */

            view?.findNavController()?.navigate(ThemeFragmentDirections.actionThemeFragmentToQuizFragment())

        }


        /*
        binding.btnKino.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_themeFragment_to_quizFragment)

        }
        binding.btnLiterature.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_themeFragment_to_quizFragment)

        }

         */
        return inflater.inflate(R.layout.theme_fragment, container, false)
    }



}

