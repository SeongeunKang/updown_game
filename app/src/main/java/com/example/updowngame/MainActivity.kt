package com.example.updowngame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import com.google.android.material.snackbar.BaseTransientBottomBar.LENGTH_SHORT
import com.google.android.material.snackbar.Snackbar
import java.util.*

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

        // 랜덤 생성된 넘버
        val randomNumber= Random().nextInt(100) // 0 to 100

        buttonSubmit.setOnClickListener {


            // 유저가 입력한 넘버
            val userInput= editText.text.toString().toInt()

            if(randomNumber == userInput) {
                Snackbar.make(linearLayout, "Correct!", LENGTH_SHORT).show()
            }

        }
    }
}