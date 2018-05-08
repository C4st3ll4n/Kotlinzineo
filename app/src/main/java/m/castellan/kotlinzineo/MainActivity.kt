package m.castellan.kotlinzineo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun clique(v: View) {
        var texto = findViewById<TextView>(R.id.textView2)
        var r = Random().nextInt(11)
        texto.text = "Número sorteado: $r"

    }
}
