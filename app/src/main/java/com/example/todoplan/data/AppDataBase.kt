package com.example.todoplan.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.todoplan.model.Note

@Database(entities = [Note::class], version = 1)
abstract class AppDataBase: RoomDatabase() {
    abstract fun noteDao(): NoteDao

    companion object {
        @Volatile
        private var INSTANSE: AppDataBase? = null

        fun getDatabase(
            context: Context
        ): AppDataBase {
            return INSTANSE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDataBase::class.java,
                    "note_database"
                )
                    .build()
                INSTANSE = instance
                instance
            }
        }
    }
}