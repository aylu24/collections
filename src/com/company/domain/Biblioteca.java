package com.company.domain;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private int consecutivo;
    private List<Libro> libros;

     public Biblioteca(){
         this.libros = new ArrayList<>();
     }
     public void registrarLibro( Libro libro){
         libros.add(libro);
     }
     public void etiquetarLibros(){
      /*   for (int i = 0; i < libros.size(); i++ ){
             if(libros.get(i).getCodigo() == null){
                 libros.get(i).setCodigo(libros.get(i).getCodigo() + "/" +
                         libros.get(i).getAñoPublicacion() + "/" + consecutivo);
                 consecutivo++;
             }
         }*/

         for (Libro libro : libros){
             if ( libro.getCodigo() == null){
                 libro.setCodigo(libro.getTitulo() + "/"
                 +libro.getAñoPublicacion() + "/" + consecutivo);
                 consecutivo++ ;
             }
         }
     }
     public List<Libro> buscarLibro(String titulo){
         List<Libro> librosEncontrados =new ArrayList<>();
         for (Libro libro : libros) {
             if (libro.getTitulo().equals(titulo)){
                 librosEncontrados.add(libro);
             }
         }
         return librosEncontrados;
     }
     public void imprimirLibros(){
         System.out.println(libros);
     }
}
