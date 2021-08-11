package com.example.todoplan.data.repository

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import com.example.todoplan.data.NoteDao
import com.example.todoplan.data.model.Note

class NoteRepository(private val noteDao: NoteDao) {

    val allNotes: LiveData<List<Note>> = noteDao.getLiveData()

    suspend fun insert(note: Note) {
        noteDao.insert(note)
    }

    suspend fun delete(note: Note) {
        noteDao.delete(note)
    }


    suspend fun update(note: Note) {
        noteDao.update(note)
    }

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun getAll() {
        noteDao.getAll()
    }

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun loadAllByIds(ids: IntArray) {
        noteDao.loadAllByIds(ids)
    }

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun findNoteById(id: Int) {
        noteDao.findNoteById(id)
    }

}