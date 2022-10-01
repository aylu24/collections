package com.company.service;

import com.company.domain.Libro;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private int consecutivo;
    private List<Libro>  libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }
    public void registrarLibro(Libro libro){
        libros.add(libro);
    }
    public void etiquetarLibro(){
        for (int i=0; i< libros.size(); i++){
            if (libros.get(i).getCodigo() == null){
                libros.get(i).setCodigo(libros.get(i).getCodigo() + " / "
                + libros.get(i).getAñoPublicacion() + " / "+ consecutivo );
                consecutivo++;
            }
        }
    }
}
