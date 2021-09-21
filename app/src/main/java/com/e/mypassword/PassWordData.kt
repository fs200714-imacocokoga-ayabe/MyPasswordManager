package com.e.mypassword

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "passwordData")
data class PassWordData(
    @PrimaryKey(autoGenerate = true)var number: Int,
    var siteName: String,
    var siteAddress: String,
    var account: String,
    var maleAddress: String,
    var passWord: String
)