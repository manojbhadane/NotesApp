package com.an.notesapp.model.repository

import com.an.notesapp.model.db.Note
import com.an.notesapp.model.db.NoteDao
import javax.inject.Inject

class NoteRepository @Inject constructor(
    private val noteDao: NoteDao
) {
    suspend fun insertNote(note: Note) = noteDao.insertNote(note)
    suspend fun updateNote(note: Note) = noteDao.updateNote(note)
    suspend fun deleteNote(note: Note) = noteDao.deleteNote(note)
    suspend fun getNotes(): List<Note> = noteDao.fetchAllNotes()
    suspend fun getNote(noteId: Long): Note = noteDao.getNote(noteId)
}