package com.example.mycalcwebintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class CalculatorActivity : AppCompatActivity() {
    lateinit var Tv_answer : TextView
    lateinit var Edt_firstnumber : EditText
    lateinit var Edt_secondnnumber : EditText
    lateinit var buttonadd : Button
    lateinit var buttonsubtract : Button
    lateinit var buttonmutiply : Button
    lateinit var buttondivide : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        Tv_answer = findViewById(R.id.Txt_answer)
        Edt_firstnumber = findViewById(R.id.edt_firstno)
        Edt_secondnnumber = findViewById(R.id.edt_secondno)
        buttonadd = findViewById(R.id.btn_add)
        buttonsubtract = findViewById(R.id.btn_subtraction)
        buttonmutiply = findViewById(R.id.btn_mutiplcation)
        buttondivide = findViewById(R.id.btn_division)

        buttonadd.setOnClickListener {
            var myfirstnumber = Edt_firstnumber.text.toString()
            var mysecondnumber = Edt_secondnnumber.text.toString()
            if (myfirstnumber.isEmpty() && mysecondnumber.isEmpty()){
                Tv_answer.text = "Please fill all the inputs"
            }else{
                var answer = myfirstnumber.toDouble() + mysecondnumber.toDouble()
                Tv_answer.text = answer.toString()
            }
        }

        buttonsubtract.setOnClickListener {
            var myfirstnumber = Edt_firstnumber.text.toString()
            var mysecondnumber = Edt_secondnnumber.text.toString()
            if (myfirstnumber.isEmpty() && mysecondnumber.isEmpty()){
                Tv_answer.text = "Please fill all the inputs"
            }else{
                var answer = myfirstnumber.toDouble() - mysecondnumber.toDouble()
                Tv_answer.text = answer.toString()
            }
        }

        buttonmutiply.setOnClickListener {
            var myfirstnumber = Edt_firstnumber.text.toString()
            var mysecondnumber = Edt_secondnnumber.text.toString()
            if (myfirstnumber.isEmpty() && mysecondnumber.isEmpty()){
                Tv_answer.text = "Please fill all the inputs"
            }else{
                var answer = myfirstnumber.toDouble() * mysecondnumber.toDouble()
                Tv_answer.text = answer.toString()
            }
        }

        buttondivide.setOnClickListener {
            var myfirstnumber = Edt_firstnumber.text.toString()
            var mysecondnumber = Edt_secondnnumber.text.toString()
            if (myfirstnumber.isEmpty() && mysecondnumber.isEmpty()){
                Tv_answer.text = "Please fill all the inputs"
            }else{
                var answer = myfirstnumber.toDouble() / mysecondnumber.toDouble()
                Tv_answer.text = answer.toString()
            }
        }


    }

}