package mx.edu.potros.practica4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val button: Button =findViewById(R.id.button_antojitos)
        button.setOnClickListener {
            //On Click change activity
            var intent: Intent = Intent(this,ProductosActivity::class.java)
            startActivity(intent)
        }

    }
}