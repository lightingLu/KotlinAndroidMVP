package com.light.kotlinandroidmvp

/**
 * Created by lightlu on 2017/8/20.
 */
interface OnLoginFinishListener{
    fun onUsernameError()
    fun onPasswordError()
    fun onSuccess()
}