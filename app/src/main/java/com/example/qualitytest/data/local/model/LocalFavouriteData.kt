package com.example.qualitytest.data.local.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.RoomMasterTable.TABLE_NAME

@Entity(tableName = TABLE_NAME)
data class LocalFavouriteData(
    @PrimaryKey
    val rates: String
) {
    object Companion {
        const val TABLE_NAME = "localdata"
    }
}