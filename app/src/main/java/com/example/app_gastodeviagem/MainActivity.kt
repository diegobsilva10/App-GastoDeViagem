package com.example.app_gastodeviagem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.*

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Evento de click
        val buttonCalcular: Button = findViewById(R.id.filled_tonal_button)
        buttonCalcular.setOnClickListener{
            Toast.makeText(this,"EVENTO DE CLICK FUNCIONANDO",Toast.LENGTH_SHORT).show()
        }


    }

    private fun calculate() {
        TODO("Not yet implemented")
    }


}