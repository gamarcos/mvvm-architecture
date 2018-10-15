package br.com.gabrielmarcos.mvvmarchitecture

import android.arch.lifecycle.ViewModel
import br.com.gabrielmarcos.mvvmarchitecture.di.component.ViewModelInjector
import br.com.gabrielmarcos.mvvmarchitecture.di.module.NetworkModule
import br.com.gabrielmarcos.mvvmarchitecture.ui.PostListViewModel
import br.com.gabrielmarcos.mvvmarchitecture.di.component.DaggerViewModelInjector
/**
 * Created by Gabriel Marcos on 15/10/2018.
 */
abstract class BaseViewModel: ViewModel() {
    private val injector: ViewModelInjector = DaggerViewModelInjector
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