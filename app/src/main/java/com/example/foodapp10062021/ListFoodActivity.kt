package com.example.foodapp10062021

import Adapter.MyAdapter
import Cache.MySharedPrefarance

import android.content.Intent
import android.os.Bundle
import android.text.Html
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_list_food.*


class ListFoodActivity : AppCompatActivity() {
    lateinit var myAdapter: MyAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_food)
        title="Barcha taomlar"
        // val text = "<font color='#22E286'>Barcha</font><font color='#22E286'>taomlar</font>"
        //   supportActionBar!!.title = Html.fromHtml(text)

        MySharedPrefarance.init(this)
        val list=MySharedPrefarance.obektString
                  myAdapter=MyAdapter(this, list)
                list_food.adapter= myAdapter

        list_food.setOnItemClickListener { parent, view, position, id ->
            val intent=Intent(this, AboutFood::class.java)
            intent.putExtra("position", position)
            startActivity(intent)
        }
    }
}