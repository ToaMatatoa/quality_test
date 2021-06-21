package com.example.qualitytest.di

import android.app.Application
import androidx.room.Room
import com.example.qualitytest.data.local.LocalDataDao
import com.example.qualitytest.data.local.LocalDataStore
import com.example.qualitytest.data.local.RoomDB
import com.example.qualitytest.data.remote.RemoteDataStore
import com.example.qualitytest.data.remote.RetrofitService
import com.example.qualitytest.domain.Repository
import com.example.qualitytest.domain.UseCase
import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton
import retrofit2.Retrofit

object DataModule : Application() {

    val dataModule = Kodein.Module("data module", false) {

        //Remote
        bind<RetrofitService>() with singleton {
            instance<Retrofit>().create(RetrofitService::class.java)
        }

        bind() from singleton { RemoteDataStore() }

        bind<Repository>() with singleton {
            Repository(
                remoteDataStore = instance(), localDataStore = instance()
            )
        }

        //Local
        bind<RoomDB>() with singleton {
            Room.databaseBuilder(
                instance(),
                RoomDB::class.java, "items-name"
            ).build()
        }

        bind<LocalDataDao>() with provider { instance<RoomDB>().dataDao() }

        bind<LocalDataStore>() with singleton {
            LocalDataStore(
                localDataDao = instance()
            )
        }

        //UseCase
        bind<UseCase>() with singleton {
            UseCase(
                repository = instance()
            )
        }
    }
}