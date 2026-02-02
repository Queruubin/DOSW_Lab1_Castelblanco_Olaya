package reto1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Reto1 {

    static class Estudiante {
        String nombre;
        int semestre;
        int edad;
        String correo;

        public Estudiante(String nombre, int semestre, int edad, String correo) {
            this.nombre = nombre;
            this.semestre = semestre;
            this.edad = edad;
            this.correo = correo;
        }
    }

    public static void main(String[] args) {
        List<Estudiante> estudiantes = Arrays.asList(
            new Estudiante("Samuel Castelblanco", 5, 20, "samuel.casteblanco@mail.escuelaing.edu.co"),
            new Estudiante("Tomas Olaya", 5, 20, "tomas.olaya-d@mail.escuelaing.edu.co")
        );
        
        String nombresYEdades = estudiantes.stream()
            .map(e -> e.nombre + ", estudiante de la escuela de " + e.semestre + ".° semestre de " + e.edad + " años")
            .collect(Collectors.joining(", y "));

        String correos = estudiantes.stream()
            .map(e -> e.correo)
            .collect(Collectors.joining(" y "));

        String mensajeFinal = "¡Hola, bienvenidos! Nosotros somos la pareja conformada por " + nombresYEdades + ". " + "Nuestros correos institucionales son " + correos + ".";

        System.out.println(mensajeFinal);
    }
}