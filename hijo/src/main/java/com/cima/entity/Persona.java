package com.cima.entity;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private String direccion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setDireccion(String direccion){ this.direccion = direccion;}
    public String getdireccion() { return direccion;}

}
