package com.example.birthdaywishing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.graphics.createBitmap
import com.google.android.material.textfield.TextInputEditText



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun createBirthdayCard(view: View) {
        val name = findViewById<EditText>(R.id.enterName)
        val nam = name.editableText.toString()
        val intent = Intent(this, BirthDayGreetingActivity::class.java)
        intent.putExtra(BirthDayGreetingActivity.NAME_EXTRA, nam)
        startActivity(intent)

        val ms = findViewById<TextInputEditText>(R.id.messagebox)
        val goodMsg = ms.editableText.toString()
        val intentMsg = Intent(this, BirthDayGreetingActivity::class.java)
        intent.putExtra(BirthDayGreetingActivity.Msg, goodMsg)
        startActivity(intent)

        Toast.makeText(this,"Birthday $nam",Toast.LENGTH_LONG).show()
    }


}