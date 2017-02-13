package com.example.mike.huerta;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static com.example.mike.huerta.R.id.imagen;

/**
 * Created by Mike on 06/02/2017.
 */

public class Adaptador extends ArrayAdapter<Hortaliza> {

        private final ArrayList<Hortaliza> lista;
        private final LayoutInflater inflador;

        public Adaptador(Context context, ArrayList<Hortaliza> lista) {
            super(context,R.layout.item, lista);
            this.lista = lista;
            inflador = LayoutInflater.from(context);
        }

        @Override
        public View getView(int position, View v, ViewGroup parent) {
            ViewHolder holder;
            if (v == null) {
                v = inflador.inflate(R.layout.item, parent, false);
                holder = new ViewHolder(v);
                v.setTag(holder);
            }
            else {
                holder = (ViewHolder) v.getTag();
            }
            onBindViewHolder(holder, position);
            return v;
        }

        private void onBindViewHolder(ViewHolder holder, int position) {
            Hortaliza hortaliza = lista.get(position);
            holder.bind(hortaliza);
        }

        static class ViewHolder {

            private  final  TextView nombre, descripcion;
            private  final  ImageView iv;

            // El constructor recibe la vista-fila.
            public ViewHolder(View itemView) {
                nombre = (TextView) itemView.findViewById(R.id.nombre);
                descripcion = (TextView) itemView.findViewById(R.id.descripcion);
                iv = (ImageView) itemView.findViewById(imagen);
            }

            // Escribe los datos del Jugador en las vistas.
            public void bind(Hortaliza hortaliza) {
                nombre.setText(hortaliza.getNombre());
                descripcion.setText(hortaliza.getDescripcion());
                iv.setImageResource(hortaliza.getImagen());

            }
        }

}
