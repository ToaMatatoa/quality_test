package com.example.qualitytest.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.qualitytest.data.local.model.LocalFavouriteData

@Dao
interface LocalDataDao {

    @Query(
        "SELECT * FROM ${LocalFavouriteData.Companion.TABLE_NAME}"
    )
    suspend fun getAllLocalData(): List<LocalFavouriteData>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveAllLocalData(localdata: List<LocalFavouriteData>)
}