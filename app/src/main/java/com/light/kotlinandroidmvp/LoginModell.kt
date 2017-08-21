package com.light.kotlinandroidmvp

/**
 * Created by lightlu on 2017/8/20.
 * # 登录数据处理接口，此处主要封装登录有关的操作，实际开发中。我们可以以此来创建数据处理的接口
 * 此处例子比较简单，我们做的只是登录操作
 */
interface  LoginModell{
    fun login(username:String,password:String,listener: OnLoginFinishListener)
}