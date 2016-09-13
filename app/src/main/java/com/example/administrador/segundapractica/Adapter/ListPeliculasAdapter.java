package com.example.administrador.segundapractica.Adapter;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrador.segundapractica.R;
import com.example.administrador.segundapractica.model.Peliculas;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Administrador on 13/09/2016.
 */
public class ListPeliculasAdapter extends BaseAdapter {
    List<Peliculas> data;
    Context context;

    public ListPeliculasAdapter(List<Peliculas> data , Context context) {
        this.data = data;
        this.context = context;
    }


    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View v = view;
        if (v == null){
            v = View.inflate(context, R.layout.template_list_peliculas,null);
        }

        ImageView img = (ImageView) v.findViewById(R.id.imagen);

        TextView nombre = (TextView) v.findViewById(R.id.nombre);
        Log.i("Nombre",nombre.getText().toString());
        TextView categoria = (TextView) v.findViewById(R.id.categoria);
        TextView descripcion = (TextView) v.findViewById(R.id.descripcion);
        TextView fecha = (TextView) v.findViewById(R.id.fecha);
        nombre.setText(data.get(position).getNombre());
        categoria.setText(data.get(position).getCategoria());
        descripcion.setText(data.get(position).getDescripcion());
        fecha.setText(data.get(position).getFecha());
        Picasso.with(context).load(data.get(position).getImgUrl()).into(img);
        return v;
    }
}
