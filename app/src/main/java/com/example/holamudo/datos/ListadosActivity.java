package com.example.holamudo.datos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.holamudo.R;

import java.util.ArrayList;

public class ListadosActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView listado;
    ArrayList<String>ListadosdeNotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listados);

        listado=findViewById(R.id.listado);


        ListadosdeNotas =new ArrayList<>();


        ArrayAdapter adaptador=new ArrayAdapter( this,android.R.layout.simple_list_item_1,ListadosdeNotas);
        listado.setAdapter(adaptador);
        listado.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
