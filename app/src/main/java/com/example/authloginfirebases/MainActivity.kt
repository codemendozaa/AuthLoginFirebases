package com.example.authloginfirebases

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.authloginfirebases.LoginActivity.Companion.USERNAME_KEY
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var username: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        username = intent.extras!![USERNAME_KEY]!!.toString()
        usernameTextView.text = username
    }
}
