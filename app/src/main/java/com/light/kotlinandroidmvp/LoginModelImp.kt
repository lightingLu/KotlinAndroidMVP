package com.light.kotlinandroidmvp

import android.os.Handler
import android.text.TextUtils
import android.util.Log


/**
 * Created by lightlu on 2017/8/20.
 * ##数据具体实现类，用户名或者密码为空就做相应处理
 */
class LoginModelImp : LoginModell {
    override fun login(username: String, password: String, listener: OnLoginFinishListener) {
        Handler().postDelayed(Runnable {
                    val error: Boolean = false
                    if (TextUtils.isEmpty(username)) {
                        listener.onUsernameError()
                        Log.d("tttt",";ddd"+username)
                        return@Runnable
                    }
                    if (TextUtils.isEmpty(password)) {
                        listener.onPasswordError()
                        return@Runnable
                    }
                    if (!error) {
                        listener.onSuccess()
                    }
                }, 2000)
    }
}