package com.example.todoplan.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.todoplan.data.model.Note

@Database(entities = [Note::class], version = 1, exportSchema = false)
abstract class NoteDataBase: RoomDatabase() {
    abstract fun noteDao(): NoteDao

    companion object {
        @Volatile
        private var INSTANSE: NoteDataBase? = null

        fun getDatabase(
            context: Context
        ): NoteDataBase {
            return INSTANSE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    NoteDataBase::class.java,
                    "note_database"
                ).build()
                INSTANSE = instance
                instance
            }
        }
    }
}