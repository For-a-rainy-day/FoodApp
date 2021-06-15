package com.example.foodapp10062021

import android.app.ListActivity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        btn_menu.setOnClickListener {
            startActivity(Intent(this, ListFoodActivity::class.java))
        }

        btn_add.setOnClickListener {
            startActivity(Intent(this, Add_food::class.java))
        }
    }
}

