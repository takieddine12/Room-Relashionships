package com.example.roomrelashionships.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.StringBufferInputStream

@Entity
data class Director (

    @PrimaryKey(autoGenerate = false)
    var schoolDirector : String
)