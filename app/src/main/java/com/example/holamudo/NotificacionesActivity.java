package com.example.holamudo;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NotificacionesActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnToast;
    Button btnSnack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notificaciones2);

        btnToast=findViewById(R.id.btnToast);
        btnSnack=findViewById(R.id.btnSnack);

        btnToast.setOnClickListener(this);
        btnSnack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
       Button botonPulsado=(Button) v;
       if(botonPulsado==btnToast){
           Toast.makeText(this,"Has pulsado el botón"+botonPulsado.getText(),Toast.LENGTH_LONG).show();
           Intent intent=new Intent( NotificacionesActivity.this,ListadoActivity.class);
           startActivity(intent);
       }
       if(botonPulsado==btnSnack){
           Snackbar.make(v,"Esto es un Snackbar",Snackbar.LENGTH_LONG).show();
       }

    }
}
