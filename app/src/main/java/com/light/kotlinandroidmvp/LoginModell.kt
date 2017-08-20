package com.light.kotlinandroidmvp

/**
 * Created by lightlu on 2017/8/20.
 */
interface  LoginModell{
    fun login(username:String,password:String,listener: OnLoginFinishListener)

}