package com.light.kotlinandroidmvp

/**
 * Created by lightlu on 2017/8/20.
 * ## presenter接口，presenter主要用来连接view层和model层，做数据逻辑处理控制UI
 *
 */
interface LoginPresenter {
    fun validateCredentials(username: String, password: String)
    fun onDestoroy()
}