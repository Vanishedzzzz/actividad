package com.example.actividadfoto;

import android.os.Bundle;
import android.widget.TextView;
import com.example.actividadfoto.R;


import androidx.appcompat.app.AppCompatActivity;

public class AResultado extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aresultado); // Conectamos con el diseño XML

        // Recibir el nombre de la foto desde el Intent
        String StNombre = getIntent().getStringExtra("STNombre");

        // Mostrar el nombre de la foto en un TextView
        TextView textViewResultado = findViewById(R.id.textViewResultado);
        textViewResultado.setText(StNombre); // Mostrar el nombre de la foto
    }
}
