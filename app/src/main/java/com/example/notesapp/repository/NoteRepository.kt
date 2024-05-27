package com.example.notesapp.repository

import com.example.notesapp.db.NoteDatabase
import com.example.notesapp.model.Note

class NoteRepository(private val db: NoteDatabase) {
    suspend fun addNote(note: Note) = db.noteDao().insert(note)
    suspend fun updateNote(note: Note) = db.noteDao().update(note)
    suspend fun deleteNote(note: Note) = db.noteDao().delete(note)
    fun getAllNotes() = db.noteDao().getAllNotes()
    fun searchNote(query: String?) = db.noteDao().searchNote(query)

}