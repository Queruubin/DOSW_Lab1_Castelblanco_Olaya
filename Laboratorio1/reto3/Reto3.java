package Laboratorio1.reto3;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Reto3 {
    public static void main(String[] args) {
        String mensaje = "Hola";
        String resultado = repetirMensaje(mensaje);
        System.out.println(resultado);
    }

    public static String repetirMensaje(String mensaje) {
        // Usamos IntStream para generar el rango de repeticiones
        return IntStream.range(0, 3)
                .mapToObj(i -> mensaje)
                .collect(Collectors.joining(" ", "", "")); 
                // Aunque joining usa StringBuilder internamente, 
                // aquí te muestro cómo forzar el uso de StringBuilder con un Collector personalizado:
    }
}
