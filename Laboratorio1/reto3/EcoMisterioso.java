package reto3;

import java.util.function.UnaryOperator;

public class EcoMisterioso {

    public static void main(String[] args) {
        String mensajeEntrada = "Java es divertido";
        System.out.println("Mensaje original: " + mensajeEntrada);

        // Tomas 
        UnaryOperator<String> ecoInvertido = (mensaje) -> {
            StringBuffer sb = new StringBuffer(mensaje);
            return sb.reverse().toString();
        };
        String resultadoB = ecoInvertido.apply(mensajeEntrada);
        System.out.println("\n--- Eco del Estudiante B (StringBuffer) ---");
        System.out.println("Resultado: " + resultadoB);
    }
}