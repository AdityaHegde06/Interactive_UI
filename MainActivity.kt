package com.example.interactiveapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.activity.ComponentActivity
import com.example.interactiveapp.R.id.btnRead


class MainActivity : ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonDark  =  findViewById<Button>(R.id.btnDark)
          val buttonRead= findViewById<Button>(btnRead)
        val layout=findViewById<LinearLayout>(R.id.LinearLayout)


        buttonRead.setOnClickListener{
            //change to ligth mode
            layout.setBackgroundResource(R.color.yellow)
        }


        buttonDark.setOnClickListener{
            layout.setBackgroundResource(R.color.black)
        }
    }
}
