package com.e.mypassword

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pass_word_detail.*

class PassWordDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pass_word_detail)

        password_detail_return_top_screen_button_id.setOnClickListener{
            val intent = Intent(this, TopScreenActivity::class.java)
            startActivity(intent)
        }
    }
}