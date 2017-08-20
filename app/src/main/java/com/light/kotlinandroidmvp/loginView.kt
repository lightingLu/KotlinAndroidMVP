package com.light.kotlinandroidmvp

/**
 * Created by lightlu on 2017/8/20.
 */
interface LoginView {
    fun showProgress()
    fun hideProcess()
    fun setUsernameError()
    fun setPasswordError()
    fun navigateTohome()
}