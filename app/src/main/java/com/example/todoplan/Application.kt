package com.example.todoplan
import android.app.Application
import com.example.todoplan.data.NoteDataBase

class Application: Application() {
    private val database by lazy {
        NoteDataBase.getDatabase(this)
    }
    val notedao by lazy {
        database.noteDao()
    }


}