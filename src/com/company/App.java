package com.company;

import com.company.domain.*;
import com.company.service.GestorUrgencias;
import com.company.util.PrioridadSolicitudComparator;

import java.time.LocalDateTime;
import java.util.PriorityQueue;
import java.util.Queue;

public class App {

    public static void main(String[] args) {
	/*Diccionario diccionarioEspañol = new Diccionario("Españosl");
    diccionarioEspañol.ingresarPalabra(new Palabra("Programacion" , "Accion y efecto de programar ", " Español"));
    diccionarioEspañol.ingresarPalabra(new Palabra("Saludo ", "Accion y efecto de saludar ", " Español"));
    diccionarioEspañol.ingresarPalabra(new Palabra("Abeja", " Insecto himenoptero ", "Español"));
    diccionarioEspañol.ingresarPalabra(new Palabra("Programacion" , "Accion y efecto de programar ", " Español"));
    diccionarioEspañol.buscarPalabra("Programacion");
    System.out.println("palabras en diccionario: ");
    diccionarioEspañol.imprimirPalabras();
    diccionarioEspañol.removerPalabra("Programacion");
    System.out.println("diccionario despues de remover");
    diccionarioEspañol.imprimirPalabras();


    //Diccionario diccionarioIngles = new Diccionario("Ingles");
    //diccionarioIngles.ingresarPalabra(new PalabraNoEspañol("Programming", "Programming", "action of programming"));*/


      /*  Biblioteca bibliotecaDeDuitama = new Biblioteca();
        bibliotecaDeDuitama.registrarLibro(new Libro("Harry Poter", "J.k.ROWLS ", 2000));
        bibliotecaDeDuitama.registrarLibro(new Libro("Sangre y fuego", "HGYTD ", 1995));
        bibliotecaDeDuitama.imprimirLibros();
        bibliotecaDeDuitama.etiquetarLibros();
        bibliotecaDeDuitama.imprimirLibros();
        System.out.println(bibliotecaDeDuitama.buscarLibro("Harry Poter"));

*/


       /* Queue<Solicitud> solicitudes = new PriorityQueue<>(new PrioridadSolicitudComparator());
        solicitudes.add(new Solicitud(5, "Brenda"));
        solicitudes.add(new Solicitud(2, "Mariana"));
        solicitudes.add(new Solicitud(0, "Lucia"));
        solicitudes.add(new Solicitud(1, "Kenny"));

        while (solicitudes.size() > 0 ){
            System.out.println(solicitudes.remove());
        }*/

        Persona medico = new Medico(TipoIdentificacion.DNI,"0123456",
                "Pepito", "Perez",LocalDateTime.of(1991,12,12,12,12,1),123456);
        Persona juan = new Paciente(TipoIdentificacion.PASAPORTE, "1234", " Juan",
               "Albarracin ",LocalDateTime.of(1991, 12,12,12,12,1), " Desarrollador", " Allianz") ;
        Persona fabiola = new Paciente(TipoIdentificacion.DNI, "1234567", "Fabiola",
                "Lutrario", LocalDateTime.of(1991,12,12,12,12,1), "Cocinera", "Hospital publico");
        GestorUrgencias gestorUrgencias = new GestorUrgencias(medico);
        gestorUrgencias.registrarUrgencia(juan, " Dolor de cabeza", ClasificacionTriage.BLANCO);
        gestorUrgencias.registrarUrgencia(fabiola, "Tiene una fractura de craneo ", ClasificacionTriage.AZUL);
        gestorUrgencias.imprimirUrgencias();
        System.out.println("La proxima urgencia a atender es: " + gestorUrgencias.asignarUrgencia().toString());
        gestorUrgencias.imprimirUrgencias();





    }
}

