package com.example.ribhavappd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txt:EditText=findViewById(R.id.name)
        val txt2:EditText=findViewById(R.id.Age)
        val btn:Button=findViewById(R.id.button)
        btn.setOnClickListener ( View.OnClickListener {
            if (txt.getText().toString().equals("") || txt2.getText().toString().equals("")) {
            //display Toast message
            Toast.makeText(this,"Please Enter Your Name and Age",Toast.LENGTH_SHORT).show()
        }
            else{
            Toast.makeText(
                this,
                "Hey,I am " + txt.getText().toString() + "\n" + "Go Corona Go",
                Toast.LENGTH_SHORT
            ).show()
        }
        } )
    }
}