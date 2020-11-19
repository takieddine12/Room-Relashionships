package com.example.roomrelashionships.relations.onetoone

import androidx.room.Embedded
import androidx.room.Relation
import com.example.roomrelashionships.models.Director
import com.example.roomrelashionships.models.School

class SchoolAndDirector {

    @Embedded lateinit var school : School

    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolDirector"
    )

    lateinit var director: Director
}