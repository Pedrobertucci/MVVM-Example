package com.findlapa.examplemvvm

import dagger.Component
import dagger.Module
import javax.inject.Singleton

@Singleton
@Component(modules = [(NetworkModule::class)])
interface ViewModelInjector {

    fun inject(postListViewModel: PostListViewModel)

    @Component.Builder
    interface Builder {
        
        fun build(): ViewModelInjector

        fun networkModule(networkModule: NetworkModule): Builder
    }
}