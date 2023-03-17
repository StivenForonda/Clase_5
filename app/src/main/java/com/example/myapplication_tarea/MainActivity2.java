package com.example.myapplication_tarea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView Nombre, Apellido, Universidad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Nombre= findViewById(R.id.nom);
        Apellido= findViewById(R.id.ape);
        Universidad= findViewById(R.id.uni);

        String nom= getIntent().getStringExtra("Nombre");
        Nombre.setText("Nombre: "+nom);
        String ape= getIntent().getStringExtra("Apellido");
        Apellido.setText("Apellido: "+ape);
        String uni= getIntent().getStringExtra("Universidad");
        Universidad.setText("Universidad:"+uni);


    }
}