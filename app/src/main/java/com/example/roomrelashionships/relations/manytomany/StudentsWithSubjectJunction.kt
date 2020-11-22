package com.example.roomrelashionships.relations.manytomany

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Junction
import androidx.room.Relation
import com.example.roomrelashionships.models.Students


data class StudentsWithSubjectJunction (
    @Embedded var subject : Students,
    @Relation(
        parentColumn = "studentName",
        entityColumn = "studentSubject",
        associateBy = Junction(StudentsSubjectsCrossRef::class)
    )
    var subjectsList: List<Students>
)