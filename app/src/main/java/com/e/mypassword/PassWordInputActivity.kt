package com.e.mypassword

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pass_word_input.*

class PassWordInputActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pass_word_input)

        password_input_confirm_button_id.setOnClickListener {
            val intent = Intent(this, PassWordConfirmActivity::class.java)
            startActivity(intent)
        }
    }
}