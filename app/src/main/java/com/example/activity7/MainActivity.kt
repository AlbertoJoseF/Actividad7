package com.example.activity7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameEditText : EditText = findViewById(R.id.nameEditText)
        val hiButton : Button = findViewById(R.id.hiButton)
        val messageTextView : TextView = findViewById(R.id.messageTextView)

        hiButton.setOnClickListener{view ->
            if(nameEditText.text.isNotEmpty())
            {
                messageTextView.setText("Hi " + nameEditText.text + "!")
            }
        }

    }
}
