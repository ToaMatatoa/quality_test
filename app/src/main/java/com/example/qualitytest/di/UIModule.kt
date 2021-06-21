package com.example.qualitytest.di

import androidx.lifecycle.ViewModel
import androidx.navigation.Navigation
import com.example.qualitytest.ui.DataViewModel
import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider

object UIModule {

    val uiModule = Kodein.Module("ui module", false) {

        bind<DataViewModel>() with provider { DataViewModel(useCase = instance()) }
    }
}