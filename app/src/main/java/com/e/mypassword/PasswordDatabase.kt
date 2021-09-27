package com.e.mypassword

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [PassWordData::class], version = 1)
abstract class PasswordDatabase : RoomDatabase(){
    abstract fun passwordDataDao(): PasswordDataDao

    companion object{

        private var INSTANCE: PasswordDatabase? = null
        private val lock = Any()

        fun getInstance(context: Context): PasswordDatabase {
            synchronized(lock) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.applicationContext,
                        PasswordDatabase::class.java,
                        "aya_db")
                        .fallbackToDestructiveMigration()
                        .build()
                }
                return INSTANCE!!
            }
        }
    }
}
