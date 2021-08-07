package com.example.todoplan
import android.app.Application
import com.example.todoplan.data.AppDataBase

class Application: Application() {
    private val database by lazy {
        AppDataBase.getDatabase(this)
    }
    val notedao by lazy {
        database.noteDao()
    }


}