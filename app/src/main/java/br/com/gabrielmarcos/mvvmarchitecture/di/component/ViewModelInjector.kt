package br.com.gabrielmarcos.mvvmarchitecture.di.component

import br.com.gabrielmarcos.mvvmarchitecture.di.module.NetworkModule
import br.com.gabrielmarcos.mvvmarchitecture.ui.PostListViewModel
import dagger.Component
import javax.inject.Singleton

/**
 * Created by Gabriel Marcos on 15/10/2018.
 */

@Singleton
@Component(modules = [NetworkModule::class])
interface ViewModelInjector {
    fun inject(postListViewModel: PostListViewModel)

    @Component.Builder
    interface Builder {

        fun build(): ViewModelInjector

        fun networkModule(networkModule: NetworkModule): Builder
    }


}