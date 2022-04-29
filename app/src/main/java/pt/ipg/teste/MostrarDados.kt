package pt.ipg.teste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MostrarDados : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostrar_dados)

        val nome = intent.getStringExtra(MainActivity.)

    }
}