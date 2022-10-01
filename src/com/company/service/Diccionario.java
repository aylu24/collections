package com.company.service;

import com.company.domain.Palabra;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Diccionario {

    private String idioma;
    private Set<Palabra> palabras;



    public Diccionario(String idioma) {
        this.idioma = idioma;
        this.palabras= new TreeSet<>(); // cada vez q instancio un diccionario tenga que usar este constructor
    }

    public String getIdioma() {
        return idioma;
    }

    public void ingresarPalabra(Palabra palabraAingresar){
        palabras.add(palabraAingresar);

    }
    public void buscarPalabra(String palabra){
        boolean seEncontro = false;
        for (Palabra palabraEnDiccionario : palabras) {
            if (palabraEnDiccionario.getPalabra().equals(palabra)) {
                System.out.println(palabraEnDiccionario);
                seEncontro = true;
                break;
            }
        }
        if (!seEncontro) {
            System.out.println("La palabra " + palabra + " no existe en el diccionario.");
        }
    }

    public void removerPalabra(String palabra) {
        /* forma de usar el remove:(este ya es como el for, busca en toda la coleccion la palabra)
         Palabra palabraARemover = new  Palabra(palabra);
         boolean seRemovio = palabras.remove(palabraARemover);
         if (seRemovio) {
         System.out.println ("palabra: "+ palabra + " removida del diccionario");
         } else {
         System.out.println("La palabra " + palabra + " no se encuentra en el diccionario.");
         } */

        boolean seEncontro = false;
        for (Palabra palabraEnDiccionario : palabras) {
            if (palabraEnDiccionario.getPalabra().equals(palabra)) {
                seEncontro = true;
                palabras.remove(palabraEnDiccionario);
                System.out.println("Se removio la palabra: " + palabra);
                break;
            }
        }
        if (!seEncontro) {
            System.out.println("La palabra " + palabra + " no se encuentra en el diccionario.");
        }

    }

    public void imprimirPalabras() {
        for (Palabra auxiliar : palabras){
            System.out.println(auxiliar.getPalabra());
        }


    }
}