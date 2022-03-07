package com.example.gitexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        actionBar?.title = "Hello"
    }
    fun master(){

    }
    fun main(){
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show()
    }
}