package com.example.qualitytest.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.qualitytest.data.local.model.LocalFavouriteData

@Database(entities = [LocalFavouriteData::class], version = 1)
abstract class RoomDB : RoomDatabase() {
    abstract fun dataDao(): LocalDataDao
}