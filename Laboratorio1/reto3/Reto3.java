package Laboratorio1.reto3;

import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Reto3 {
    public static void main(String[] args) {
        String mensaje = "Hola";
        String resultado = repetirMensaje(mensaje);
        System.out.println(resultado);

        ecoMisterioso();
    }

    public static String repetirMensaje(String mensaje) {
        return IntStream.range(0, 3)
                .mapToObj(i -> mensaje)
                .collect(Collectors.joining(" ", "", "")); 
    }

    public static String ecoMisterioso() {
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

          return resultadoB;
    }

}
