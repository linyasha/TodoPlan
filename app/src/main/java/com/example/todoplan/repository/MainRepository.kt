package com.example.todoplan.repository

import androidx.annotation.WorkerThread
import com.example.todoplan.data.NoteDao
import com.example.todoplan.model.Note
import kotlinx.coroutines.flow.Flow

class MainRepository(private val noteDao: NoteDao) {
    val allNotes: Flow<List<Note>> = noteDao.getAll()

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(note: Note) {
        noteDao.insert(note)
    }

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun delete(note: Note) {
        noteDao.delete(note)
    }

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun update(note: Note) {
        noteDao.update(note)
    }

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun getLiveData() {
        noteDao.getLiveData()
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