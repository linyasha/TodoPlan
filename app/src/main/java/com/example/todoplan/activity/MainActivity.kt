package com.example.todoplan.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.todoplan.R
import com.example.todoplan.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //Variables
    private lateinit var binding: ActivityMainBinding
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        navController = Navigation.findNavController(this, R.id.nav_host)
//        setSupportActionBar(binding.toolbar)
//
//        val itemDecorator = DividerItemDecoration(this, RecyclerView.VERTICAL)
//        bindingContent.apply {
//            recycler.layoutManager = LinearLayoutManager(recycler.context)
//            recycler.addItemDecoration(itemDecorator)
//        }

    }

}