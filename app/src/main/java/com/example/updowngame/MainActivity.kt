package com.example.updowngame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import com.google.android.material.snackbar.BaseTransientBottomBar.LENGTH_SHORT
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    lateinit var buttonSubmit : Button
    lateinit var editText: EditText
    lateinit var linearLayout: LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main2)

        linearLayout = findViewById(R.id.layoutMain)
        buttonSubmit = findViewById(R.id.btn_submit)
        editText = findViewById(R.id.edt_number)

        buttonSubmit.setOnClickListener {
            Snackbar.make(linearLayout, "hello", LENGTH_SHORT).show()
        }
    }
}