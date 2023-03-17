package com.example.myapplication_tarea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText Nombre, Apellido, Universidad;

    Button Enviar, Google;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Nombre= findViewById(R.id.nom1);
        Apellido= findViewById(R.id.ape1);
        Universidad= findViewById(R.id.uni1);
        Enviar= findViewById(R.id.Send);

        Enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IrActividad(view);
            }
        });

        Google= findViewById(R.id.google);

        Google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IrGoogle();

            }
        });

    }

    public void IrActividad(View view){

        Intent pasarDatos = new Intent(this,MainActivity2.class);
        pasarDatos.putExtra("nombre",Nombre.getText().toString());
        pasarDatos.putExtra("apellido",Apellido.getText().toString());
        pasarDatos.putExtra("universidad",Universidad.getText().toString());

        startActivity(pasarDatos);


    }

    public void IrGoogle(){
        String url ="https://www.google.com.co/";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

        startActivity(intent);


    }


}