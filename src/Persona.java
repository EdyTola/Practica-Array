package org.example;

public class Persona {
    protected String nombre;
    protected String estadoAsis;
    int fecha;
    char Genero;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstadoAsis() {
        return estadoAsis;
    }

    public void setEstadoAsis(String estadoAsis) {
        this.estadoAsis = estadoAsis;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


    public char getGenero() {
        return Genero;
    }

    public void setGenero(char genero) {
        Genero = genero;
    }

    public Persona(String nombre, String estadoAsis, char genero) {
        this.nombre = nombre;
        this.estadoAsis = estadoAsis;
        this.getGenero();
    }
}