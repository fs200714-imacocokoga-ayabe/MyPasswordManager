package com.e.mypassword

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [PassWordData::class], version = 1)
abstract class AppDatabase : RoomDatabase(){
    abstract fun passwordDataDao(): PasswordDataDao

    companion object{
      @Volatile
      private var instance: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase =
            instance ?: synchronized(this){
            Room.databaseBuilder(context, AppDatabase::class.java, "aya.db").build()
        }
    }
}
