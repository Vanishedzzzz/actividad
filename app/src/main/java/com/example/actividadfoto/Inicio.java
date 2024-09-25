package com.example.actividadfoto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Inicio extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio); // Conectamos con el diseño XML

        // Conectar el botón HACER FOTO
        Button BTAceptar = findViewById(R.id.BTAceptar);
        BTAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Conectar el campo de texto (EditText) para capturar el nombre de la foto
                EditText ETNombre = findViewById(R.id.ETNombreFoto);
                String StNombre = ETNombre.getText().toString();

                // Crear un Intent para iniciar AResultado y pasar el nombre de la foto
                Intent sIntent = new Intent(Inicio.this, AResultado.class);
                sIntent.putExtra("STNombre", StNombre); // Pasar la variable StNombre
                startActivity(sIntent); // Iniciar la nueva Activity
            }
        });
    }
}
