package com.example.mycalcwebintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var buttontocalculator: Button
    lateinit var buttontoweb: Button
    lateinit var buttontointent: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttontocalculator = findViewById(R.id.btn_Calc)
        buttontocalculator.setOnClickListener {
            val nav = Intent(this, CalculatorActivity::class.java)
            startActivity(nav)
        }

        buttontoweb = findViewById(R.id.btn_Web)
        buttontoweb.setOnClickListener {
            val nav = Intent(this, WebActivity::class.java)
            startActivity(nav)
        }

        buttontointent = findViewById(R.id.btn_intent)
        buttontointent.setOnClickListener {
            val nav = Intent(this, IntentActivity::class.java)
            startActivity(nav)
        }

    }
}