package com.rozi.myintentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btnintent :  Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnintent = findViewById(R.id.btn_intent)

        btnintent.setOnClickListener {this}
    }

     fun onClick(v: View) {
        when(v.id){
            R.id.btn_intent ->{
                val intentBiasa = Intent(this@MainActivity, pindahActivity2:: class.java)
            startActivity(intentBiasa)
            }
        }
    }
}