package com.example.mike.huerta;

import android.media.Image;

/**
 * Created by Mike on 06/02/2017.
 */

public class Hortaliza {
    public String nombre;
    public String descripcion;
    public int imagen;

    public Hortaliza(String nombre, String descripcion, int imagen) {
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.imagen=imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getImagen() {
        return imagen;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Hortaliza{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", imagen=" + imagen +
                '}';
    }
}
