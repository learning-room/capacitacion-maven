package com.cima;

import java.util.InputMismatchException;
import java.util.Scanner;

import capacitacion.maven.dos.dos.Sujeto;
import com.cima.entity.Persona;
import com.fasterxml.jackson.core.JsonProcessingException;


public class Application {

    public static void main(String[] args) throws JsonProcessingException {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese nombre");
        String nombre = leer.next();
        System.out.println("Ingrese Apellido");
        String apellido = leer.next();
        System.out.println("Ingrese edad:");
        int edad = -1;
        do {
            boolean isCatch = false;
            try {
                edad = leer.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("El valor " + leer.next() + " no es un entero valido");
                System.out.println("Ingrese edad:");
                isCatch = true;
            }
            if (edad <= 0 && !isCatch) {
                System.out.println("Debe ingresar un valor positivo distinto de cero como edad");
                System.out.println("Ingrese edad:");
            }
        } while (edad <= 0);

        System.out.println("Ingrese direccion");
        String dir = leer.next();
        System.out.println("Los datos ingresados son:");

        Persona persona = new Persona();
        persona.setNombre(nombre);
        persona.setApellido(apellido);
        persona.setEdad(edad);
        persona.setDireccion(dir);


        System.out.println(Sujeto.transformar(persona));
    }
}
