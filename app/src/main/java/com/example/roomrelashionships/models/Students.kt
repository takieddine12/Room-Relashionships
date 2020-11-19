package com.example.roomrelashionships.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Students(
    @PrimaryKey(autoGenerate = false)
    var studentName : String,
    var semester : Int,
    var schoolName : String
)