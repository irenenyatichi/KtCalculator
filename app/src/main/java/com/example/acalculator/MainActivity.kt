package com.example.acalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var enterNum1=findViewById<TextView>(R.id.tvFirstNumber)
        var enterNum2=findViewById<TextView>(R.id.tvSecondNumber)
        val results=findViewById<TextView>(R.id.tvResults)
        val etNum1=findViewById<EditText>(R.id.etFirstNumber)
        val etNum2=findViewById<EditText>(R.id.etSecondNumber)
        val btnAdd=findViewById<Button>(R.id.btnAdd)
        val btnMinus=findViewById<Button>(R.id.btnSubtract)
        val btnDivide=findViewById<Button>(R.id.btnMultiply)
        val btnModulus=findViewById<Button>(R.id.btnModulus)

        btnAdd.setOnClickListener {
            if(etNum1.text.toString()==""|| etNum2.text.toString()==""){
                Toast.makeText(baseContext,"Enter a number", Toast.LENGTH_LONG).show()
            }else{
                val input1=etNum1.text.toString().toInt()
                val input2=etNum2.text.toString().toInt()
                val sum=input1-input2
                results.text="${sum}"

            }}
        btnMinus.setOnClickListener {
            if(etNum1.text.toString()==""|| etNum2.text.toString()==""){
                Toast.makeText(baseContext,"Enter a number", Toast.LENGTH_LONG).show()
            }else{
                val input1=etNum1.text.toString().toInt()
                val input2=etNum2.text.toString().toInt()
                val minus=input1-input2
                results.text="${minus}"

            }}
        btnDivide.setOnClickListener {
            if(etNum1.text.toString()==""|| etNum2.text.toString()==""){
                Toast.makeText(baseContext,"Enter a number", Toast.LENGTH_LONG).show()
            }else{
                val input1=etNum1.text.toString().toInt()
                val input2=etNum2.text.toString().toInt()
                val divide=input1-input2
                results.text="${divide}"

            }}
        btnModulus.setOnClickListener {


            if(etNum1.text.toString()==""|| etNum2.text.toString()==""){
                Toast.makeText(baseContext,"Enter a number", Toast.LENGTH_LONG).show()
            }else{
                val input1=etNum1.text.toString().toInt()
                val input2=etNum2.text.toString().toInt()
                val modulus=input1-input2
                results.text="${modulus}"

            }
        }
    }
}