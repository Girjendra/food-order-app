package com.gir.food_order_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btn)

        btn.setOnClickListener() {
            val o1 = findViewById<EditText>(R.id.editTextText)
            val o2 = findViewById<EditText>(R.id.editTextText2)
            val o3 = findViewById<EditText>(R.id.editTextText3)
            val o4 = findViewById<EditText>(R.id.editTextText4)


            val intent= Intent(this,order_detail::class.java)
            val bundle = Bundle()

            bundle.putString("o1", o1.text.toString())
            bundle.putString("o2", o2.text.toString())
            bundle.putString("o3", o3.text.toString())
            bundle.putString("o4", o4.text.toString())

            intent.putExtras(bundle)
            startActivity(intent)
        }

    }
}