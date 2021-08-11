package com.example.todoplan.data

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.todoplan.data.model.Note

@Dao
interface NoteDao {

    @Query("SELECT * FROM Note")
    fun getAll(): List<Note>

    @Query("SELECT * FROM Note")
    fun getLiveData(): LiveData<List<Note>>

    @Query("SELECT * FROM Note WHERE id IN (:noteIds)")
    fun loadAllByIds(noteIds: IntArray): List<Note>

    @Query("SELECT * FROM Note WHERE id LIKE :id LIMIT 1")
    fun findNoteById(id: Int): Note

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(user: Note)

    @Delete
    fun delete(user: Note)

    @Update
    fun update(note: Note)
}