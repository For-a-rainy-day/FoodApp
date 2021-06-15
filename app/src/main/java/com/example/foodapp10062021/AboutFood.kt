package com.example.foodapp10062021

import Cache.MySharedPrefarance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_about_food.*

class AboutFood : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_food)
        supportActionBar?.hide()

        MySharedPrefarance.init(this)

        val list=MySharedPrefarance.obektString
        val positon =intent.getIntExtra("position",0)
        txt_namee.text=list[positon].name
        txt_products.text=list[positon].ingredient
        txt_preparations.text=list[positon].preparationOrder

    }
}