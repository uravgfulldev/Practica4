package mx.edu.potros.practica4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val button: Button =findViewById(R.id.btn_sign_in)
        button.setOnClickListener {
            //On Click change activity
            var intent: Intent = Intent(this,MenuActivity::class.java)
            startActivity(intent)
        }
    }
}