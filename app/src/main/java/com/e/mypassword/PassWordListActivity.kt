package com.e.mypassword

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class PassWordListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pass_word_list)

        val database = PasswordDatabase.getInstance(this)

        GlobalScope.launch{


            val passwordDataDao = database.passwordDataDao()

            val passwordList = passwordDataDao.getAll()

            val siteNameTextView: TextView = findViewById(R.id.textView2)
            siteNameTextView.text = passwordList[0].siteName
        }

//        password_list_detail_button_id.setOnClickListener{
//            val intent = Intent(this, PassWordDetailActivity::class.java)
//            startActivity(intent)
//        }
    }
}