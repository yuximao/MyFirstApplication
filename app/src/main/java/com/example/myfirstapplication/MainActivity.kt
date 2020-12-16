package com.example.myfirstapplication

import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.custom_toast.*
import kotlinx.android.synthetic.main.custom_toast.view.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        normal_toast.setOnClickListener {
            val text = "Hello toast!"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
        }
        normal_position_toast.setOnClickListener {
            val text = "Hello toast2!"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.setGravity(Gravity.CENTER_VERTICAL, 100, 500)
            toast.show()
        }
//        custom_toast.setOnClickListener {
//            val v = layoutInflater.inflate(R.layout.custom_toast, custom_toast_container, false)
//            v.text_view.text = getString(R.string.msg)
//            with(Toast(this)) {
//                duration = Toast.LENGTH_LONG
//                view = v
//                show()
//            }
//        }
        val nameText : EditText = findViewById(R.id.editTextTextPersonName)
        button1.setOnClickListener{
            val intent = Intent(applicationContext, SecondActivity::class.java)
            intent.putExtra("name", nameText.text.toString() )
            startActivity(intent)
        }

    }

}