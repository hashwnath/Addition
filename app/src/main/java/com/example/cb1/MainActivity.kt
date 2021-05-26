package com.example.cb1

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {

//    var btnAdd:Button?=null

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        btnAdd=findViewById(R.id.btnadd)
        btnAdd?.setOnClickListener {
            Toast.makeText(this@MainActivity, "Hello", Toast.LENGTH_SHORT).show()
            val vresult = var1.text.toString().toInt() + var2.text.toString().toInt()
            result.text = vresult.toString()
        }

    }
}