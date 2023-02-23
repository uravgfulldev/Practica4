package mx.edu.potros.practica4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnAntojitos: Button =findViewById(R.id.button_antojitos)
        val btnEspecialidades: Button =findViewById(R.id.button_especialidades)
        val btnCombinations: Button =findViewById(R.id.button_combinations)
        val btnDrinks: Button =findViewById(R.id.button_drinks)
        val btnSopas: Button =findViewById(R.id.button_sopas)
        val btnTortas: Button =findViewById(R.id.button_tortas)
        btnAntojitos.setOnClickListener {
            //On Click change activity
            var intent: Intent = Intent(this,ProductosActivity::class.java)
            intent.putExtra("menuType","Antojitos")
            startActivity(intent)
        }
        btnEspecialidades.setOnClickListener {
            //On Click change activity
            var intent: Intent = Intent(this,ProductosActivity::class.java)
            intent.putExtra("menuType","Especialidades")
            startActivity(intent)
        }
        btnCombinations.setOnClickListener {
            //On Click change activity
            var intent: Intent = Intent(this,ProductosActivity::class.java)
            intent.putExtra("menuType","Combinations")
            startActivity(intent)
        }
        btnDrinks.setOnClickListener {
            //On Click change activity
            var intent: Intent = Intent(this,ProductosActivity::class.java)
            intent.putExtra("menuType","Drinks")
            startActivity(intent)
        }
        btnSopas.setOnClickListener {
            //On Click change activity
            var intent: Intent = Intent(this,ProductosActivity::class.java)
            intent.putExtra("menuType","Sopas")
            startActivity(intent)
        }
        btnTortas.setOnClickListener {
            //On Click change activity
            var intent: Intent = Intent(this,ProductosActivity::class.java)
            intent.putExtra("menuType","Tortas")
            startActivity(intent)
        }



    }
}