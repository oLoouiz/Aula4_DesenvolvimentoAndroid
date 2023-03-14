package com.example.aula41

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Spinner
import com.example.aula41.databinding.ActivityPokemonBinding
import java.text.FieldPosition

class PokemonActivity : AppCompatActivity() {

    lateinit var binding: ActivityPokemonBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPokemonBinding.inflate(layoutInflater)
        setContentView(binding.root)



        //binding

        //editText
        /*val spinner: Spinner = findViewById(R.id.spinner)
        val imageView: ImageView = findViewById(R.id.imageView)
        val button: Button = findViewById(R.id.button)
*/

        val pokemons = arrayOf("Selecione", "Charmander", "Bulbassauro", "Squirtle", "Weedle", "Pidjey", "Dratini")

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, pokemons)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinner.adapter = adapter

        binding.spinner.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onItemSelected(adapter: AdapterView<*>?, spinner: View?,position: Int, id: Long) {
                when(position){
                    1 -> binding.imageView.setImageDrawable(getDrawable(R.drawable.charmander))
                    2 -> binding.imageView.setImageResource(R.drawable.bulbassauro)
                    3 -> binding.imageView.setImageResource(R.drawable.squirtle)
                    4 -> binding.imageView.setImageResource(R.drawable.weedle)
                    5 -> binding.imageView.setImageResource(R.drawable.pidjey)
                    6 -> binding.imageView.setImageResource(R.drawable.dratini)
                    else -> binding.imageView.setImageDrawable(null)

                }
            }

            override fun onNothingSelected(adapter: AdapterView<*>?) {

            }
        }

        binding.button.setOnClickListener {
            when(binding.spinner.selectedItemPosition){
                1 -> showMsg("Charmander", "Fogo 🔥", this)
                2 -> showMsg("Bulbassauro","Planta 🍃\n Veneno 💀", this)
                3 -> showMsg("Squirtle", "Água 💧", this)
                4 -> showMsg("Weedle", "Inseto 🐛\n Veneno 💀", this)
                3 -> showMsg("Pidjey", "Normal 😐\n Voador ✈", this)
                3 -> showMsg("Dratini", "Dragão 🐲", this)


                else -> showMsg("Erro ❌", "Selecione um pokemon", this)



            }


        }

    }
}
