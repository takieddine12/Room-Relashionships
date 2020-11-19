package com.example.roomrelashionships.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class School (

    @PrimaryKey(autoGenerate = true)
    var schoolName : String
)