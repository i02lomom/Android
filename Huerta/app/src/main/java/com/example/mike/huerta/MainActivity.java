package com.example.mike.huerta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listview;
    ArrayList<Hortaliza> lista = new ArrayList<Hortaliza>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getVistas();

    }

    private void getVistas() {
        listview = (ListView) findViewById(R.id.listView);

        lista.add(new Hortaliza("Patatas","Es un tubérculo comestible perteneciente a la familia de las Soláneceas. " +
                "Originaria de América del sur y cultivada en la mayoría de países.",R.drawable.patatas));

        lista.add(new Hortaliza("Pimientos","El pimiento verde comparte las propiedades del " +
                "piemiento rojo, pero su sabor es más suave.",R.drawable.pimientos));

        lista.add(new Hortaliza("Rábanos","La importancia de esta" +
                " familia de hortalizas reside en que contienen  potentes" +
                " antioxidantes que ayudan a prevenir enfermedades.",R.drawable.rabanos));

        lista.add(new Hortaliza("Tomates","El tomate es un alimento muy sabroso, que presenta numerosas "+
                "propiedades beneficiosas para nuestra salud.",R.drawable.tomates));

        lista.add(new Hortaliza("Zanahorias","Son muy deliciosas asadas, hervidas, cocidas al vapor, fritas al dente, "+
                "asadas a la parilla, y ellas acompañan maravillosamente a cualquier otro vegetal.",R.drawable.zanahorias));


        listview.setAdapter(new Adaptador(this,lista));
    }
}
