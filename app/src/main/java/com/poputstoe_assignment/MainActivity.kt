package com.poputstoe_assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var wallet:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        wallet=findViewById(R.id.wallet)
        wallet.setOnClickListener {
            val intent=Intent(this@MainActivity,Home::class.java)
            startActivity(intent)
        }
    }
}