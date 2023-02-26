package com.example.tpc01_ex04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.widget.addTextChangedListener

class MainActivity : AppCompatActivity() {

    val btn_up: Button by lazy { findViewById(R.id.btn_up) }
    val btn_supUp: Button by lazy { findViewById(R.id.btn_supUp) }
    val btn_down: Button by lazy { findViewById(R.id.btn_down) }
    val btn_supDown: Button by lazy { findViewById(R.id.btn_supDown) }
    val number: EditText by lazy { findViewById(R.id.number) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var count = 1
    fun editNumber(v: View) {

        val btn: Button = v as Button

        when (btn) {
            btn_up -> {
                if (count in 1..9) {
                    count++
                }
            }
            btn_supUp -> {
                count = 10
            }
            btn_down -> {
                if (count in 2..10) {
                    count--
                }
            }
            btn_supDown -> {
                count = 1
            }
        }

        number.hint = count.toString()

    }
}