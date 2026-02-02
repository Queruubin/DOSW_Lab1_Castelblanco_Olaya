package reto1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Reto1 {

    // Clase interna Estudiante (Requisito del PDF)
    static class Estudiante {
        String nombre;
        String correo;
        int edad;
        int semestre;

        public Estudiante(String nombre, String correo, int edad, int semestre) {
            this.nombre = nombre;
            this.correo = correo;
            this.edad = edad;
            this.semestre = semestre;
        }
    }

    public static void main(String[] args) {
        // 1. Crear la lista de estudiantes (Requisito: List)
        List<Estudiante> estudiantes = Arrays.asList(
            new Estudiante("Tomas Olaya", "tomas.olaya@mail.escuelaing.edu.co", 20, 6), // TODO: Pon tus datos reales
            new Estudiante("Samuel Casteblanco", "samuel.casteblanco@mail.escuelaing.edu.co", 20, 6) // TODO: Pon datos de Samuel
        );

        // 2. Usar stream, map y collect para generar el mensaje (Requisito: Lambdas)
        String mensajeFinal = estudiantes.stream()
            .map(e -> "Hola, somos " + e.nombre + " del semestre " + e.semestre) // Esto es una Lambda simple
            .collect(Collectors.joining(" y "));

        // TODO: Ajusta el .map() de arriba para que el mensaje quede EXACTO al ejemplo del PDF:
        // "Nosotros somos la pareja conformada por [Nombre], estudiante de [Semestre]..."

        System.out.println(mensajeFinal);
    }
}