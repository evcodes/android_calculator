package com.development.captaincode.calculator

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //When add button is pressed combine both numbers in the editTextField

        addBtn.setOnClickListener {
            if(fieldsFilled()){
            val resultNum = Integer.parseInt(num_1.text.toString()) +
                         Integer.parseInt(num_2.text.toString())

            result.text = "The result is: $resultNum"

            }
        }
        minusBtn.setOnClickListener {
            if(fieldsFilled()){

            val resultNum = Integer.parseInt(num_1.text.toString()) -
                         Integer.parseInt(num_2.text.toString())

            result.text = "The result is: $resultNum"
            }
        }
    }


        private fun fieldsFilled(): Boolean {
            val emptyFieldError = "Error: this field cannot be false"
            if (!TextUtils.isEmpty(num_1.text)){
                if(!TextUtils.isEmpty(num_2.text)){
                    return true
                }
                else num_2.error = emptyFieldError

            }
            else num_1.error = emptyFieldError
            return false
        }
    }



