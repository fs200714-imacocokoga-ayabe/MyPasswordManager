package com.e.mypassword

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pass_word_list.*

class PassWordListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pass_word_list)

        password_list_detail_button_id.setOnClickListener{
            val intent = Intent(this, PassWordDetailActivity::class.java)
            startActivity(intent)
        }
    }
}