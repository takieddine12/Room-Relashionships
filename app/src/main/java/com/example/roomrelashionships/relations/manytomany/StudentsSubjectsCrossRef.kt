package com.example.roomrelashionships.relations.manytomany

import androidx.room.Entity
import androidx.room.Relation

@Entity(primaryKeys = ["studentName,studentSubject"])
data class StudentsSubjectsCrossRef (
    var schoolName : String,
    var studentSubject : String,

)