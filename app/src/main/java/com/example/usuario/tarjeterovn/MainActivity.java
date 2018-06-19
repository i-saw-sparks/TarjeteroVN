package com.example.usuario.tarjeterovn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    public ImageView perfil;
    public ListView lista;
    public origendedatos origen;
    public adaptadorldd adap;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        perfil=(ImageView)findViewById(R.id.perfil);
        lista=(ListView)findViewById(R.id.Lista);


        adap = new adaptadorldd();
        origen= new origendedatos();
        adap.arreglo=origen.showAll();
        adap.context=this;
        lista.setAdapter(adap);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                tarjeta x=(tarjeta)parent.getItemAtPosition(position);
                Intent segunda = new Intent(MainActivity.this, Segunda.class);
                segunda.putExtra("nombre", x.nombre);
                segunda.putExtra("imagen", x.imagen);
                segunda.putExtra("descripcion", x.descripcion);
                segunda.putExtra("edad", x.edad);
                startActivity(segunda);
            }
        });


    }
}