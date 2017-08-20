package com.light.kotlinandroidmvp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), LoginView {
    lateinit var present: LoginPresenter
    var name:String=""
    var word:String=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

     fun init(){

         progress.visibility = View.GONE
         present = LoginPresentImp(this)
         button.setOnClickListener { view ->
             name= username.text.toString()
             word= password.text.toString()
             present.validateCredentials(name,word)
         }
     }

    override fun showProgress() {
        progress.visibility = View.VISIBLE
    }

    override fun hideProcess() {
        progress.visibility = View.GONE
    }

    override fun setUsernameError() {
        toast("请输入用户名",0)
    }

    override fun setPasswordError() {
        toast("请输入密码",0)
    }

    override fun navigateTohome() {
        toast("登陆成功",1)
    }


    override fun onDestroy() {
        present.onDestoroy()
        super.onDestroy()
    }

    fun toast(message: String,time:Int) {
        Toast.makeText(this, message, time).show()
    }
}
