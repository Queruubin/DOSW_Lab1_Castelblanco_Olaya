package Laboratorio1.reto1;

import java.util.*;
import java.util.stream.Collectors;

class Estudiante {
    String nombre;
    int edad;
    String correo;
    int semestre;

    public Estudiante(String nombre, int edad, String correo, int semestre) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.semestre = semestre;
    }
}

class MensajeBienvenida {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = Arrays.asList(
            new Estudiante("Samuel", 20, "samuelcf0123@gmail.com", 5),
            new Estudiante("Tomas", 20, "tomasdi.dev@gmail.com", 5)
        );

        List<String> mensajes = estudiantes.stream()
            .map(e -> "¡Bienvenido " + e.nombre + "! Edad: " + e.edad + ", Correo: " + e.correo + ", Semestre: " + e.semestre)
            .collect(Collectors.toList());

        mensajes.forEach(System.out::println);
    }
}
