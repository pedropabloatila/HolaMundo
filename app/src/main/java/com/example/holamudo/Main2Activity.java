package com.example.holamudo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView txtSaludo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtSaludo = findViewById(R.id.txtSaludo);

        Bundle extras = getIntent().getExtras();
        String Nombre= extras.getString("Nombre", "sin nombre");
        txtSaludo.setText("Hola " + Nombre);
    }
}
