package com.example.usuario.tarjeterovn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class Segunda extends AppCompatActivity {

    public ImageView perfil;
    public TextView nombre, edade, desc;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        perfil=(ImageView)findViewById(R.id.perfilseg);
        nombre=(TextView)findViewById(R.id.nombxmlseg);
        edade=(TextView)findViewById(R.id.Edadxmlseg);
        desc=(TextView) findViewById(R.id.descxmlseg);

        Intent r = getIntent();

        String img=r.getStringExtra("imagen");
        String des=r.getStringExtra("descripcion");
        String nomb=r.getStringExtra("nombre");
        String edad=r.getStringExtra("edad");

        nombre.setText(nomb);
        edade.setText(edad);
        desc.setText(des);
        Picasso.with(this).load(img).into(perfil);
    }
}
