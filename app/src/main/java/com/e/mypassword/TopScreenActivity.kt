package com.e.mypassword

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_top_screen.*

class TopScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_top_screen)

        top_screen_list_button_id.setOnClickListener{
            val intent = Intent(this, PassWordListActivity::class.java)
            startActivity(intent)
        }

        top_screen_input_button_id.setOnClickListener{
            val intent = Intent(this, PassWordInputActivity::class.java)
            startActivity(intent)
        }
    }
}