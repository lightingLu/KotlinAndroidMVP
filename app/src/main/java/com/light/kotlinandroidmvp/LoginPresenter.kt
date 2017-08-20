package com.light.kotlinandroidmvp

/**
 * Created by lightlu on 2017/8/20.
 */
interface LoginPresenter {
    fun validateCredentials(username: String, password: String)
    fun onDestoroy()
}