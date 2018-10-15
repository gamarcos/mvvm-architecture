package br.com.gabrielmarcos.mvvmarchitecture.ui

import android.arch.lifecycle.MutableLiveData
import br.com.gabrielmarcos.mvvmarchitecture.BaseViewModel
import br.com.gabrielmarcos.mvvmarchitecture.model.Post

/**
 * Created by Gabriel Marcos on 15/10/2018.
 */
class PostViewModel:BaseViewModel() {

    private val postTitle = MutableLiveData<String>()
    private val postBody = MutableLiveData<String>()

    fun bind(post: Post){
        postTitle.value = post.title
        postBody.value = post.body
    }

    fun getPostTitle():MutableLiveData<String>{
        return postTitle
    }

    fun getPostBody():MutableLiveData<String>{
        return postBody
    }
}