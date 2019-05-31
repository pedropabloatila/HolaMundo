package com.example.holamudo.datos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.example.holamudo.R;



public class ListadoNotasActivity extends AppCompatActivity {
    EditText editListadoNotas1;
    EditText editListadoNotas2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_notas);

        editListadoNotas1=findViewById(R.id.editListadoNotas1);
        editListadoNotas1=findViewById(R.id.editListadoNotas2);

    }
}
