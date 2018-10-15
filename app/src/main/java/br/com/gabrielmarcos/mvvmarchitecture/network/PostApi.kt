package br.com.gabrielmarcos.mvvmarchitecture.network

import br.com.gabrielmarcos.mvvmarchitecture.model.Post
import io.reactivex.Observable
import retrofit2.http.GET

/**
 * Created by Gabriel Marcos on 15/10/2018.
 */
interface PostApi {
    @GET("/posts")
    fun getPosts(): Observable<List<Post>>
}