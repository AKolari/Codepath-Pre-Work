package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text
import java.util.Random

class MainActivity : AppCompatActivity() {
    private var currentFriend=0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myButton=findViewById<Button>(R.id.button)
        val myTitle=findViewById<TextView>(R.id.TitleTextView)
        val myImage=findViewById<ImageView>(R.id.TonberryImage)
        val myDescription=findViewById<TextView>(R.id.ParagraphText)
        currentFriend=0;

        myButton.setOnClickListener{
            currentFriend=(currentFriend+1)%3
            Toast.makeText(this, "HELLO THERE!!", Toast.LENGTH_LONG).show()

            if(currentFriend==0){
                myImage.setImageResource(R.drawable.tonberryboi)
                myDescription.setText(R.string.ParagraphText)
            }
            if(currentFriend==1){
                myImage.setImageResource(R.drawable.clawstriderboi)
                myDescription.setText(R.string.ParagraphText1)
            }
            if(currentFriend==2){
                myImage.setImageResource(R.drawable.crimis_ewok)
                myDescription.setText(R.string.ParagraphText2)
            }


        }


    }
}