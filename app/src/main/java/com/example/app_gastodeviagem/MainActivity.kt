package com.example.app_gastodeviagem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.app_gastodeviagem.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //Definida no escopo da classe
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

}