package com.aula.fragmentnav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaonext : ImageButton = findViewById(R.id.imageButton)
        val botaoback : ImageButton = findViewById(R.id.imageButton2)

        botaonext.setOnClickListener{
            findNavController(R.id.fragmentContainer).navigate(R.id.navegarparade1para2)

        }

        botaoback.setOnClickListener{
            findNavController(R.id.fragmentContainer).navigate(R.id.navegarde2para1)
        }
    }




}