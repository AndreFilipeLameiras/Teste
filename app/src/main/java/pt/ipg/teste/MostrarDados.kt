package pt.ipg.teste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MostrarDados : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostrar_dados)

        val nome = intent.getStringExtra(MainActivity.EXTRA_NOME)
        val email = intent.getStringExtra(MainActivity.EXTRA_EMAIL)
        val telefone = intent.getStringExtra(MainActivity.EXTRA_TELE)
        val dataNasc = intent.getLongExtra(MainActivity.EXTRA_DATA_NASCIMENTO, -1)


        val textViewMensagem = findViewById<TextView>(R.id.textViewNome)
        textViewMensagem.text = nome
        textViewMensagem.text = email
        textViewMensagem.text = telefone


    }
}