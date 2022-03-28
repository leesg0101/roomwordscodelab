package com.sg0101.app.roomwordscodelab

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "word_table")
data class Word(
    @PrimaryKey
    @ColumnInfo(name = "word")
    val word: String
)
