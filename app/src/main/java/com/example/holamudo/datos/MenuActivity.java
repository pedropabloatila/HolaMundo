package com.example.holamudo.datos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.holamudo.MainActivity;
import com.example.holamudo.R;

public class MenuActivity extends AppCompatActivity {
    TextView txtNombre;
    Button btnNotificacion;
    Button btnListado;
    Button btnListadoNotas;
    Button btnCalculadora;
    Button btnWEB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        txtNombre = findViewById(R.id.text1);

        String variableNombre = txtNombre.getText().toString();

        btnNotificacion = findViewById(R.id.btnNotificacion);
        btnListado = findViewById(R.id.btnListado);
        btnListadoNotas = findViewById(R.id.btnListadoNotas);
        btnCalculadora = findViewById(R.id.btnCalculadora);
        btnWEB = findViewById(R.id.btnWEB);


    }
}
