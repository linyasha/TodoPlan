package com.example.todoplan.fragment.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.todoplan.R
import com.example.todoplan.activity.MainActivity
import com.example.todoplan.databinding.FragmentAddBinding
import com.example.todoplan.databinding.FragmentListBinding

class ListFragment : Fragment() {

    //Variables
    private var binding: FragmentListBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListBinding.inflate(layoutInflater)
        return binding?.root
    }

    override fun onStart() {
        super.onStart()
        binding?.fab!!.setOnClickListener {
            (activity as MainActivity).navController.navigate(R.id.action_listFragment_to_addFragment)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

    override fun onDestroy() {
        binding = null
        super.onDestroy()
    }

}