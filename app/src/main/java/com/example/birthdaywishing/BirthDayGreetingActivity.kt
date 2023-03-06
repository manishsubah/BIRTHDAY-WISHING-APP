package com.example.birthdaywishing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class BirthDayGreetingActivity : AppCompatActivity() {

    companion object {
        const val NAME_EXTRA = "name_extra"
        const val Msg = "Msg_text"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birth_day_greeting)
        val name = intent.getStringExtra(NAME_EXTRA)
        (findViewById<TextView>(R.id.birthday)).text = "Happy Birthday\n$name!!"

        val msgtext = intent.getStringExtra(Msg)
        (findViewById<TextView>(R.id.displayMsg)).text = "$msgtext"


    }
}