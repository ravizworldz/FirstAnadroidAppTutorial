package com.demo.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val user = intent.getStringExtra("username")
        val pass = intent.getStringExtra("password")

        welcomeTv.text = "Welcome ${user}, your password is ${pass}"
    }
}