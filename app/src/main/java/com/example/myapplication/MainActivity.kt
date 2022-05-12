package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {
            var login = findViewById<EditText>(R.id.login).text.toString()
            var haslo = findViewById<EditText>(R.id.haslo).text.toString()
            var sprawdz = findViewById<EditText>(R.id.sprawdz).text.toString()

            if(haslo != "" && sprawdz != "") {
                if(haslo == sprawdz)
                {
                    Toast.makeText(this, "Haslo sie zgadza", Toast.LENGTH_SHORT).show()
                }
                else
                {
                    Toast.makeText(this, "Haslo sie nie zgadza", Toast.LENGTH_SHORT).show()
                }
            }
            else{
                Toast.makeText(this, "wypelnij pola!!!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}