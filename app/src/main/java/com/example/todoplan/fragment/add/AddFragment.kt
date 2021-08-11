package com.example.todoplan.fragment.add

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.todoplan.R
import com.example.todoplan.databinding.FragmentAddBinding

class AddFragment : Fragment() {

    //Variables
    private var binding: FragmentAddBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAddBinding.inflate(layoutInflater)
        return binding?.root
    }



    override fun onDestroy() {
        binding = null
        super.onDestroy()
    }
}