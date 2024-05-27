package com.example.notesapp.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize
@Entity(tableName = "notes")
@Parcelize
data class Note(
    val title: String,
    val description: String,
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0
) : Parcelable
