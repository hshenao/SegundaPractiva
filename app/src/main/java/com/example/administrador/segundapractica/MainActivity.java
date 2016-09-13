package com.example.administrador.segundapractica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.administrador.segundapractica.Adapter.ListPeliculasAdapter;
import com.example.administrador.segundapractica.model.Peliculas;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    ListView list;
    List<Peliculas> data;
    ListPeliculasAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = (ListView) findViewById(R.id.list);
        data = new ArrayList<>();

        // Region Set Data
        Peliculas peliculas = new Peliculas();
        peliculas.setImgUrl("https://www.google.com.co/imgres?imgurl=http%3A%2F%2Fwww.laprensagrafica.com%2Fgetattachment%2FContent%2F2015%2F12%2F30%2FPeliculas-2016%2Fbat-mtan.jpg.aspx&imgrefurl=http%3A%2F%2Fwww.laprensagrafica.com%2F2015%2F12%2F30%2Fpeliculas-mas-esperadas-para-el-2016&docid=p98rfy7khGInJM&tbnid=SazIemSQEM_0iM%3A&w=1000&h=665&bih=606&biw=1242&ved=0ahUKEwiLzKrxn43PAhUKcz4KHf14DMUQMwhmKEQwRA&iact=mrc&uact=8");
        peliculas.setNombre("Pelicula 1");
        peliculas.setCategoria("Categoria 1");
        peliculas.setDescripcion("Descripcion 1");
        peliculas.setFecha("Fecha 1");
        data.add(peliculas);

        Peliculas peliculas1 = new Peliculas();
        peliculas.setImgUrl("https://www.google.com.co/imgres?imgurl=http%3A%2F%2Festaticos.elperiodico.com%2Fresources%2Fjpg%2F0%2F9%2Ftelevision-pelicula-hotel-transylvania-1451665834890.jpg&imgrefurl=http%3A%2F%2Fwww.elperiodico.com%2Fes%2Fnoticias%2Fque-echan-en-la-tele%2Fpeliculas-hoy-tv-sabado-2-enero-2016-4788720&docid=qdaefTunUENdTM&tbnid=L42j8jAoZoDb1M%3A&w=646&h=361&bih=606&biw=1242&ved=0ahUKEwj1jsWapY3PAhWE8z4KHaTLATY4yAEQMwgCKAAwAA&iact=mrc&uact=8");
        peliculas.setNombre("Pelicula 1");
        peliculas.setCategoria("Categoria 1");
        peliculas.setDescripcion("Descripcion 1");
        peliculas.setFecha("Fecha 1");
        data.add(peliculas1);


        Peliculas peliculas2 = new Peliculas();
        peliculas.setImgUrl("https://www.google.com.co/imgres?imgurl=http%3A%2F%2Fk30.kn3.net%2Ftaringa%2F3%2F6%2F0%2F4%2F1%2FF%2Fdisco00%2F080.jpg&imgrefurl=http%3A%2F%2Fwww.taringa.net%2Fposts%2Ftv-peliculas-series%2F18858286%2F20-peliculas-mas-esperadas-para-2016.html&docid=PuZh38y3fnzs8M&tbnid=B48d-E-GrJ74bM%3A&w=1080&h=720&bih=606&biw=1242&ved=0ahUKEwj1jsWapY3PAhWE8z4KHaTLATY4yAEQMwg3KDQwNA&iact=mrc&uact=8");
        peliculas.setNombre("Pelicula 1");
        peliculas.setCategoria("Categoria 1");
        peliculas.setDescripcion("Descripcion 1");
        peliculas.setFecha("Fecha 1");
        data.add(peliculas2);


        Peliculas peliculas3 = new Peliculas();
        peliculas.setImgUrl("");
        peliculas.setNombre("Pelicula 1");
        peliculas.setCategoria("Categoria 1");
        peliculas.setDescripcion("Descripcion 1");
        peliculas.setFecha("Fecha 1");
        data.add(peliculas3);

        Peliculas peliculas4 = new Peliculas();
        peliculas.setImgUrl("");
        peliculas.setNombre("Pelicula 1");
        peliculas.setCategoria("Categoria 1");
        peliculas.setDescripcion("Descripcion 1");
        peliculas.setFecha("Fecha 1");
        data.add(peliculas4);


        Peliculas peliculas5 = new Peliculas();
        peliculas.setImgUrl("");
        peliculas.setNombre("Pelicula 1");
        peliculas.setCategoria("Categoria 1");
        peliculas.setDescripcion("Descripcion 1");
        peliculas.setFecha("Fecha 1");
        data.add(peliculas5);

        adapter = new ListPeliculasAdapter(data, this);
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(MainActivity.this, data.get(position).getNombre(),Toast.LENGTH_SHORT).show();
    }
}
