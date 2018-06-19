package com.example.usuario.tarjeterovn;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.usuario.tarjeterovn.R;
import com.example.usuario.tarjeterovn.tarjeta;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;


public class adaptadorldd extends BaseAdapter{

    public ArrayList<tarjeta> arreglo;
    public Context context;
    public LayoutInflater inflater;

    @Override
    public int getCount() {
        return arreglo.size();
    }

    @Override
    public Object getItem(int i) {
        return arreglo.get(i);
    }

    @Override
    public long getItemId(int i) {

        return arreglo.get(i).id;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        inflater=LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.tarjeta, null);
        TextView nombr = (TextView) v.findViewById(R.id.nombxml);
        nombr.setText(arreglo.get(i).nombre);
        TextView descr = (TextView) v.findViewById(R.id.descxml);
        descr.setText(arreglo.get(i).descripcion);
        TextView edadad = (TextView) v.findViewById(R.id.Edadxml);
        edadad.setText(arreglo.get(i).edad);
        ImageView imagen = (ImageView) v.findViewById(R.id.perfil);
        String ejemplo =  arreglo.get(i).imagen;
        Picasso.with(context).load(arreglo.get(i).imagen).into(imagen);
        return v;
    }
}
