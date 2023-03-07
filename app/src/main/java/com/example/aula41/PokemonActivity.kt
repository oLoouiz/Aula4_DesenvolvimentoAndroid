package com.example.aula41

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Spinner

class PokemonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokemon)



        //binding

        //editText
        val spinner: Spinner = findViewById(R.id.spinner)
        val ImageView: ImageView = findViewById(R.id.imageView)
        val button: Button = findViewById(R.id.button)


        val pokemons = arrayOf("Selecione", "Charmander", "Bulbassauro", "Squirtle")

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, pokemons)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter






    }
}