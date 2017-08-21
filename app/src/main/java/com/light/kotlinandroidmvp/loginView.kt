package com.light.kotlinandroidmvp

/**
 * Created by lightlu on 2017/8/20.
 * ##  用于实现UI
 *
 */
interface LoginView {
    fun showProgress()
    fun hideProcess()
    fun setUsernameError()
    fun setPasswordError()
    fun navigateTohome()
}