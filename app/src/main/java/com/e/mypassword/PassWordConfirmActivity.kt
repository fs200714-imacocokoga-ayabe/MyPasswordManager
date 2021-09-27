package com.e.mypassword

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_pass_word_confirm.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class PassWordConfirmActivity : AppCompatActivity() {

    private lateinit var passwordDatabase: PasswordDatabase
    private lateinit var passwordDataDao: PasswordDataDao
    private lateinit var passWordData: MutableList<PassWordData>

    private var siteName: String = ""
    private var webSite: String = ""
    private var mailAddress: String = ""
    private var account: String = ""
    private var passWord: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pass_word_confirm)

        passwordDatabase = PasswordDatabase.getInstance(this)
        passwordDataDao = passwordDatabase.passwordDataDao()
        passWordData = mutableListOf()

        siteName = intent.getStringExtra("siteName_key").toString()
        webSite = intent.getStringExtra("webSite_key").toString()
        mailAddress = intent.getStringExtra("mailAddress_key").toString()
        account = intent.getStringExtra("account_key").toString()
        passWord = intent.getStringExtra("passWord_key").toString()

        val siteNameTextView: TextView = findViewById(R.id.passWord_confirm_siteName_textView_id)
        siteNameTextView.text = siteName

        val webSiteTextView: TextView = findViewById(R.id.passWord_confirm_webSite_textView_id)
        webSiteTextView.text = webSite

        val mailAddressTextView: TextView = findViewById(R.id.passWord_confirm_mailAddress_textView_id)
        mailAddressTextView.text = mailAddress

        val accountTextView: TextView = findViewById(R.id.passWord_confirm_account_textView_id)
        accountTextView.text = account

        val passWordTextView: TextView = findViewById(R.id.passWord_confirm_passWord_textView_id)
        passWordTextView.text = passWord

        password_confirm_save_button_id.setOnClickListener{
            GlobalScope.launch{
                val passWordData = PassWordData(0, siteName, webSite, account, mailAddress, passWord)
                passwordDataDao.insert(passWordData)
            }
        }

        password_confirm_return_top_screen_button_id.setOnClickListener {
            val intent = Intent(this, TopScreenActivity::class.java)
            startActivity(intent)
        }
    }
}