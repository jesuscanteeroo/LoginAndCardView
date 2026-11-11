package com.example.loginandcardvieww

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val MYUSER = "admin"
    private val MYPASS = "1234"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val etUsuario = findViewById<EditText>(R.id.etUsuario)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btnValidar = findViewById<Button>(R.id.btnValidar)

        btnValidar.setOnClickListener {

            val usuarioIntroducido = etUsuario.text.toString()
            val passwordIntroducida = etPassword.text.toString()

            if (usuarioIntroducido == MYUSER && passwordIntroducida == MYPASS) {

                val intent = Intent(this, PrincipalActivity::class.java)

                intent.putExtra("usuario", usuarioIntroducido)
                intent.putExtra("password", passwordIntroducida)

                startActivity(intent)

            } else {

                Toast.makeText(
                    this,
                    "Usuario o contraseña incorrectos",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}
