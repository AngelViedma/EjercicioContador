package com.example.ejerciciocontador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var boton_sumar1:Button
    private lateinit var boton_sumar2:Button
    private lateinit var contador:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        boton_sumar1= findViewById<Button>(R.id.bt_sumar1)
        boton_sumar2= findViewById<Button>(R.id.bt_sumar2)
        contador= findViewById(R.id.tv_contador)

        boton_sumar1.setOnClickListener(){
            var cont_aux=Integer.parseInt(contador.text.toString())+1
            contador.text= cont_aux.toString()

        }

        boton_sumar2.setOnClickListener(){
            var cont_aux=Integer.parseInt(contador.text.toString())+2
            contador.text= cont_aux.toString()

        }
        var cont_aux=Integer.parseInt(contador.text.toString())+2

        if(cont_aux==50){
            contador.text=("Has ganado!")
        }
        if(cont_aux>50){
            contador.text=("Has perdido!")
        }







    }
}