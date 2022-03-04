package com.example.gitexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun mainBranch(){

    }
    fun mainBranch2(){
        Toast.makeText(this, "main", Toast.LENGTH_SHORT).show()
    }
}