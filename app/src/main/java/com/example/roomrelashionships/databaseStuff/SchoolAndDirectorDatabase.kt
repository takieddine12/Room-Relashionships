package com.example.roomrelashionships.databaseStuff

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.roomrelashionships.models.Director
import com.example.roomrelashionships.models.School

@Database(entities = [School::class,Director::class],version = 1,exportSchema = false)
abstract class SchoolAndDirectorDatabase : RoomDatabase(){

    abstract fun schoolAndDirectorDao() : SchoolDirectorDao

    companion object {

        @Volatile
        private  var instance : SchoolAndDirectorDatabase? = null
        private val LOCK = Any()

        fun invokeBase(context: Context ) : SchoolAndDirectorDatabase {
            synchronized(LOCK){
                if(instance == null) {
                    instance =  Room.databaseBuilder(context.applicationContext,
                        SchoolAndDirectorDatabase::class.java,"schooldiretor.db").fallbackToDestructiveMigration().build()
                }
            }
            return instance!!
        }
    }
}