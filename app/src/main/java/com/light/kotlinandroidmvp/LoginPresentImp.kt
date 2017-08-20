package com.light.kotlinandroidmvp

/**
 * Created by lightlu on 2017/8/20.
 */
class LoginPresentImp(loginview: LoginView) : LoginPresenter, OnLoginFinishListener {
    lateinit var loginV: LoginView
    var loginModel: LoginModell

    init {
        loginV = loginview
        loginModel = LoginModelImp()
    }

    override fun validateCredentials(username: String, password: String) {
        if (loginV != null) {
            loginV.showProgress()
        }
        loginModel.login(username, password, this)
    }

    override fun onUsernameError() {
        if (loginV != null) {
            loginV.setUsernameError()
            loginV.hideProcess()
        }
    }

    override fun onPasswordError() {
        if (loginV != null) {
            loginV.setPasswordError()
            loginV.hideProcess()
        }
    }

    override fun onSuccess() {
        if (loginV != null) {
            loginV.navigateTohome()
            loginV.hideProcess()
        }
    }

    override fun onDestoroy() {
        loginV != null
    }
}