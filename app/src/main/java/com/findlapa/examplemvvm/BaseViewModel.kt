package com.findlapa.examplemvvm

import androidx.lifecycle.ViewModel


abstract class BaseViewModel: ViewModel() {

    private val injector: ViewModelInjector =
            .builder()
            .networkModule(NetworkModule)
            .build()


    init {
        inject()
    }

    private fun inject() {
        when (this) {
            is PostListViewModel -> injector.inject(this)
        }
    }
}
