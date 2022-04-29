package pt.ipg.teste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.CalendarView
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonEnviar = findViewById<Button>(R.id.buttonEnviar)
        buttonEnviar.setOnClickListener { enviarDados() }

    }

    private fun enviarDados(){
        val editTextNome = findViewById<EditText>(R.id.editTextNome)
        val nome = editTextNome.text.toString()

        if(nome.isBlank()){
            editTextNome.error = getString(R.string.Nome_Obrigatorio)
            editTextNome.requestFocus()
            return
        }

        val editTextEmail = findViewById<EditText>(R.id.editTextEmail)
        val email = editTextEmail.text.toString()

        if(email.isBlank()){
            editTextEmail.error = getString(R.string.Email_obrigatorio)
            editTextEmail.requestFocus()
            return
        }
        val emailValido = Patterns.EMAIL_ADDRESS.matcher(email).matches()
        if(!emailValido){
            editTextEmail.error = getString(R.string.email_invalido)
            editTextEmail.requestFocus()
            return
        }

        val editTextTelefone = findViewById<EditText>(R.id.editTextTelefone)
        val telefone = editTextTelefone.text.toString()

         if(telefone.isBlank()){
             editTextTelefone.error = getString(R.string.numero_obrigatorio)
             editTextTelefone.requestFocus()
             return
         }
        val telefoneValido = Patterns.PHONE.matcher(telefone).matches()
        if (!telefoneValido){
            editTextTelefone.error = getString(R.string.telefone_invalido)
            editTextTelefone.requestFocus()
            return
        }

        val calendarViewDataNascimento = findViewById<CalendarView>(R.id.calendarViewDataNascimento)
        val dataNascimento = calendarViewDataNascimento.date

    }

}