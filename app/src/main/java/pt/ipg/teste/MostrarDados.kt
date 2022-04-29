package pt.ipg.teste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MostrarDados : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostrar_dados)

        val nome = intent.getStringExtra(MainActivity.INFO_EXTRA_NOME)



        val textViewMensagem = findViewById<TextView>(R.id.textViewNome)
        textViewMensagem.text = nome
    }
}