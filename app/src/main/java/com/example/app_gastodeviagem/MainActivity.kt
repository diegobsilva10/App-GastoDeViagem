package com.example.app_gastodeviagem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.app_gastodeviagem.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){

    //Definida no escopo da classe
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding =  ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Evento de click
        val buttonCalcular: Button = findViewById(R.id.filled_tonal_button)
        buttonCalcular.setOnClickListener{
            calculate()
        }


    }

    private fun calculate() {

        //BLOCO DE CÓDIGO TRANSFORMA OS EDIT TEXT EM NÚMERO FLOAT
        val distance = binding.editDistance.text.toString().toFloat()
        val price = binding.editPrice.text.toString().toFloat()
        val autonomy = binding.editAutonomy.text.toString().toFloat()

        //CALCULO DOS VALORES PEGADOS DOS EDIT TEXT
        val totalValue = (distance * price) / autonomy
        val totalValueStr = "R$ ${"%.2f".format(totalValue)}"

        // Toast.makeText(this,totalValueStr,Toast.LENGTH_SHORT).show()

        binding.textTotalValue.text = totalValueStr
    }


}
