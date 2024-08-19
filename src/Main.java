package org.example;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        int nonVec1[] = {1,2,3,4,5,6,7,8,9,10};

        for(int dato:nonVec1){
            System.out.println(dato);
        }

        Persona nombre[]= new Persona[]{new Persona("Juan", "0", 'M'),
                new Persona("Pablito", "1", 'M')};
        System.out.println("Restro de asistencia");
        Scanner leer=new Scanner(System.in);
        for(Persona p:nombre){
            System.out.println("Esta presente"+p.nombre+":");
            p.setEstadoAsis(leer.nextLine());
            //p.estadoAsis= leer.nextLine();
            p.fecha=new De();

        }
        System.out.println("Mostrar registro al sistema");
        for (Persona p : nombre) {
            System.out.println("¿Está presente " + p.getNombre() + p.getEstadoAsis()+ "-"+p. fecha);
            p.setEstadoAsis(leer.nextLine());
        }

        System.out.println("Mostrar registro del sistema");
        for (Persona p : nombre) {
            System.out.println(p.getNombre() + " - " + p.getEstadoAsis());
            System.out.println("Género: " + p.getGenero());
            System.out.println("Fecha: " + p.getFecha());
        }
    }
}