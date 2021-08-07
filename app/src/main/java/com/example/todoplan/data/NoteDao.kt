package com.example.todoplan.data

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.todoplan.model.Note
import kotlinx.coroutines.flow.Flow
import org.w3c.dom.Node

@Dao
interface NoteDao {

    @Query("SELECT * FROM Note")
    fun getAll(): Flow<List<Note>>

    @Query("SELECT * FROM Note")
    fun getLiveData(): LiveData<List<Node>>

    @Query("SELECT * FROM Note WHERE id IN (:noteIds)")
    fun loadAllByIds(noteIds: IntArray): List<Note>

    @Query("SELECT * FROM Note WHERE id LIKE :id LIMIT 1")
    fun findNoteById(id: Int): Note

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(user: Note)

    @Delete
    fun delete(user: Note)

    @Update
    fun update(note: Note)
}