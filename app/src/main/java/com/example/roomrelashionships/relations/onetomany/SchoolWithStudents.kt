package com.example.roomrelashionships.relations.onetomany

import androidx.room.Embedded
import androidx.room.Relation
import com.example.roomrelashionships.models.School
import com.example.roomrelashionships.models.Students

data class SchoolWithStudents (
    @Embedded var school: School,
    @Relation(
         parentColumn = "schoolName",
         entityColumn = "schoolName"
    )
    var studentsList : List<Students>
)