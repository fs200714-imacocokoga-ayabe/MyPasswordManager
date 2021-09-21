package com.e.mypassword

import androidx.room.*

@Dao
interface PasswordDataDao {

    @Insert
    fun insert(passwordData : PassWordData)

    @Update
    fun update(passwordData : PassWordData)

    @Delete
    fun delete(passwordData : PassWordData)

}