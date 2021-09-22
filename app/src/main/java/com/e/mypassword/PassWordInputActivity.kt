package com.e.mypassword

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_pass_word_input.*

class PassWordInputActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pass_word_input)

        password_input_confirm_button_id.setOnClickListener {

            val siteName = findViewById<EditText>(R.id.passWord_input_siteName_editTextPersonName_id).text
            val webSite = findViewById<EditText>(R.id.passWord_input_webSite_editTextTextPersonName_id).text
            val mailAddress = findViewById<EditText>(R.id.passWord_input_mailAddress_editTextTextEmailAddress_id).text
            val account = findViewById<EditText>(R.id.passWord_input_account_editTextTextMultiLine_id).text
            val passWord = findViewById<EditText>(R.id.passWord_input_passWord_editTextTextMultiLine_id).text

            val intent = Intent(this, PassWordConfirmActivity::class.java)

            intent.putExtra("siteName_key", siteName.toString())
            intent.putExtra("webSite_key", webSite.toString())
            intent.putExtra("mailAddress_key", mailAddress.toString())
            intent.putExtra("account_key", account.toString())
            intent.putExtra("passWord_key", passWord.toString())

            startActivity(intent)
        }





    }
}