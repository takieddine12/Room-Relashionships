package com.example.roomrelashionships.databaseStuff

import androidx.room.*
import com.example.roomrelashionships.models.Director
import com.example.roomrelashionships.models.School
import com.example.roomrelashionships.models.Students
import com.example.roomrelashionships.relations.onetomany.SchoolWithStudents
import com.example.roomrelashionships.relations.onetoone.SchoolAndDirector

// TODO: One To One RelashionShip

@Dao
interface SchoolDirectorDao {

     // TODO : One To One Relashionship
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSchool(school: School)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDirector(director: Director)

    @Transaction
    @Query("SELECT * FROM School Where schoolName = :schoolName")
    suspend fun queryWithSchoolName(schoolName:  String) : List<SchoolAndDirector>


     // TODO : One To Many Relashionship

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertStudents(students: Students)


    @Transaction
    @Query("SELECT * From students Where schoolName = :schoolName")
    suspend fun QuerySchoolWithStudents(schoolName : String) : List<SchoolWithStudents>



}