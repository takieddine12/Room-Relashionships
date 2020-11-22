package com.example.roomrelashionships.relations.manytomany

import androidx.room.Embedded
import androidx.room.Relation

data class SubjectsWithStudentsJunction(
    @Embedded var subject: Subject,
    @Relation(
        parentColumn = "studentSubject",
        entityColumn = "studentName"
    )
    var subjectsList : List<Subject>
)