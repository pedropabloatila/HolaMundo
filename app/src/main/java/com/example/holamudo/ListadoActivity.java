package com.example.holamudo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListadoActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
   ListView listaPrueba;
    ArrayList <String> listaRobots;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado);
        listaPrueba=findViewById(R.id.listado);
        listaRobots =new ArrayList<>();
        listaRobots.add("Pepe");
        listaRobots.add("Juan");
        listaRobots.add("Pablo");
        listaRobots.add("Felipe");
        listaRobots.add("Pepeillo");
        listaRobots.add("Juanito");
        listaRobots.add("Pablito");
        listaRobots.add("Felipito");
        listaRobots.add("Otro Pepe");
        listaRobots.add("Otro Juan");
        listaRobots.add("Otro Pablo");
        listaRobots.add("Otro Felipe");
        ArrayAdapter adaptador=new ArrayAdapter( this,android.R.layout.simple_list_item_1,listaRobots);
        listaPrueba.setAdapter(adaptador);
         listaPrueba.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String robotSeleccionado=listaRobots.get(position);
        Toast.makeText(this,"Has elegido el Nombre "+ robotSeleccionado,Toast.LENGTH_LONG).show();

    }
}
