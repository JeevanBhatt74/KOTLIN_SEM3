package com.example.basics

import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RadioActivity : AppCompatActivity() {
    lateinit var Luffy : RadioButton
    lateinit var Ramos : RadioButton
    lateinit var Zoro : RadioButton
    lateinit var Image : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_radio)
        Luffy = findViewById(R.id.radioLuffy)
        Ramos = findViewById(R.id.radioRamos)
        Zoro = findViewById(R.id.radioZoro)
        Image = findViewById(R.id.imageView5)

        Luffy.setOnClickListener{
            Image.setImageResource(R.drawable.luffy)
        }
        Ramos.setOnClickListener{
            Image.setImageResource(R.drawable.ramos)
        }
        Zoro.setOnClickListener{
            Image.setImageResource(R.drawable.zoro)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.Email)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}