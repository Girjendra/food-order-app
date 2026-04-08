package com.gir.food_order_app

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class order_detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_order_detail)
        val o1 = intent.getStringExtra("o1")
        val o2 = intent.getStringExtra("o2")
        val o3 = intent.getStringExtra("o3")
        val o4 = intent.getStringExtra("o4")

        val tv = findViewById<TextView>(R.id.textView1)
        tv.setText("Order 1 : " + o1)
        val tv2 = findViewById<TextView>(R.id.textView2)
        tv2.setText("Order 2 : " + o2)
        val tv3 = findViewById<TextView>(R.id.textView3)
        tv3.setText("Order 3 : " + o3)
        val tv4 = findViewById<TextView>(R.id.textView4)
        tv4.setText("Order 4 : " + o4)
    }
}