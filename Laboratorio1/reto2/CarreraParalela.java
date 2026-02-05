package Laboratorio1.reto2; // Asegúrate que este package sea el correcto

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.BinaryOperator;

public class CarreraParalela {
    public static void main(String[] args) {

        // --- Ejemplo inicial (se deja igual) ---
        BinaryOperator<Integer> mayor = (a, b) -> a > b ? a : b;

        Integer max = List.of(3, 8, 6, 2)
                .stream()
                .reduce(mayor)
                .orElse(null);

        String resultado = max != null
                ? (max % 2 == 0 ? "es múltiplo de 2" : "no es múltiplo de 2")
                : "no hay números en la lista";

        System.out.println("El número mayor es: " + max + " y " + resultado);


        // ============================================================
        // --- ZONA DE TRABAJO DEL RETO ---
        // ============================================================
        List<Integer> numeros = Arrays.asList(15, 2, 9, 21, 7, 3, 8, 4);
        System.out.println("\nListado de números: " + numeros);

        // Calculamos todas las estadísticas de una sola vez
        IntSummaryStatistics estadisticas = numeros.stream()
            .mapToInt(num -> num)
            .summaryStatistics();

        System.out.println("--- Resultados (Estudiante B - Mínimo) ---");
        System.out.println("El número más pequeño es: " + estadisticas.getMin());

        long cantidadTotal = estadisticas.getCount();
        String esCantidadImpar = (cantidadTotal % 2 != 0) ? "Sí" : "No";

        System.out.println("Cantidad total de datos: " + cantidadTotal);
        System.out.println("¿La cantidad de datos es impar?: " + esCantidadImpar);
    }
}