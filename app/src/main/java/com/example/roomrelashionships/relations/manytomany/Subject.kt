package com.example.roomrelashionships.relations.manytomany

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Subject (
    @PrimaryKey(autoGenerate = false)
    var studentSubject : String
)