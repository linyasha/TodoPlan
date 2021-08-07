package com.example.todoplan.activity

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat.startActivity
import com.example.todoplan.R
import com.example.todoplan.databinding.ActivityDetailsBinding
import com.example.todoplan.model.Note

class DetailsActivity : AppCompatActivity() {

    //Variables
    private lateinit var note: Note
    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }

    companion object {
        const val EXTRA_NOTE = "DetailsActivity.EXTRA_NOTE"

        fun start(caller: Activity, note: Note) {
            val intent = Intent(caller, DetailsActivity::class.java)
            intent.putExtra(EXTRA_NOTE, note)
            caller.startActivity(intent)
        }
    }
}