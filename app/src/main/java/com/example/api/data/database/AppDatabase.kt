package com.example.api.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.api.data.database.dao.MovieDao
import com.example.api.data.entities.MovieEntity

@Database(entities = [MovieEntity::class], version = 1)

abstract class AppDatabase : RoomDatabase(){
    abstract fun movieDao(): MovieDao

    companion object {
        @Volatile
        private var instance: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase = instance ?: synchronized(this) {
            instance ?: buildDatabase(context).also {
                instance = it
            }
        }

        private fun buildDatabase(appContext: Context) =
            Room.databaseBuilder(appContext, AppDatabase::class.java, name = "movies_database")
                .fallbackToDestructiveMigration().build()

    }
}