package com.cima;

import com.cima.capacitacion.maven.Persona;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Application {

    public static void main(String[] args) throws JsonProcessingException {
        Persona persona = new Persona();
        persona.setApellido("Gonzalez");
        persona.setNombre("Mandy");
        persona.setEdad(98);
        ObjectMapper mapper = new ObjectMapper();
        System.out.println(mapper.writeValueAsString(persona));
    }
}
