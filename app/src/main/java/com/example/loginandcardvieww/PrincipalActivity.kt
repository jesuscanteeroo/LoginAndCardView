package com.example.loginandcardvieww

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PrincipalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_principal)

        val usuario = intent.getStringExtra("usuario")
        val password = intent.getStringExtra("password")

        val textoDatos = findViewById<TextView>(R.id.textoDatos)

        textoDatos.text = "Bienvenido: $usuario"
    }
}