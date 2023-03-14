package com.example.aula41

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //binding

                                 //editText
        //val editNome: EditText = findViewById(R.id.editNome)
        //val editEmail: EditText = findViewById(R.id.editEmail)
        //val editTelefone: EditText = findViewById(R.id.editTelefone)

                                 //Checkbox
        //val checkTelefone: CheckBox = findViewById(R.id.checkTelefone)
        //val checkEmail: CheckBox = findViewById(R.id.checkEmail)

                                  //Button
        //val buttonRegistrar: Button = findViewById(R.id.buttonRegistrar)


        //Configuração do botão
        buttonRegistrar.setOnClickListener {
            if(!editNome.text.isBlank() && !editEmail.text.isBlank() && !editTelefone.text.isBlank()){

                val msg =
                    """
                    
                    |Nome: ${editNome.text}
                    |Telefone: ${editTelefone.text}
                    |Email: ${editEmail.text}
                    |Contato por telefone: ${checkTelefone.isChecked}
                    |Contato por Email: ${checkEmail.isChecked}
                    
                    """.trimMargin()


                showMsg("${editNome.text}" + ", Seus dados foram armazenados", msg, this)
            }


            else {
                showMsg("Impossivel Prosseguir", "Existem Campos não Preenchidos", this)
            }



        }


    }


}