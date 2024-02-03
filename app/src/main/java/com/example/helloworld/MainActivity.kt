package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myButton=findViewById<Button>(R.id.button)
        val myTitle=findViewById<TextView>(R.id.TitleTextView)

        myButton.setOnClickListener{
            Toast.makeText(this, "HELLO THERE!!", Toast.LENGTH_LONG).show()


        }


    }
}