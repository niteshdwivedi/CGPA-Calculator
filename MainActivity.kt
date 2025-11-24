package com.example.ca1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val su1 = findViewById<EditText>(R.id.sub1)
        val su2 = findViewById<EditText>(R.id.sub2)
        val su3 = findViewById<EditText>(R.id.sub3)
        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            val convert1 = su1.text.toString().toDoubleOrNull()?:0.0
            val convert2 = su2.text.toString().toDoubleOrNull()?:0.0
            val convert3 = su3.text.toString().toDoubleOrNull()?:0.0
            val avg = (convert1 + convert2 + convert3)/3
            val cgpa = avg/9.5
            Toast.makeText(this, "Calculated CGPA is = $cgpa", Toast.LENGTH_SHORT).show()
        }

    }
}