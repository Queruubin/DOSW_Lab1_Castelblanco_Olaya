package Laboratorio1.reto2; // Asegúrate que este package sea el correcto según tu estructura de carpetas

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.BinaryOperator;

public class CarreraParalela {
    public static void main(String[] args) {

        // Esta parte superior parece un ejemplo aparte, la dejo como estaba.
        BinaryOperator<Integer> mayor = (a, b) -> a > b ? a : b;

        Integer max = List.of(3, 8, 6, 2)
                .stream()
                .reduce(mayor)
                .orElse(null);

        String resultado = max != null
                ? (max % 2 == 0 ? "es múltiplo de 2" : "no es múltiplo de 2")
                : "no hay números en la lista";

        System.out.println("El número mayor es: " + max + " y " + resultado);

        // --- SOLUCIÓN ESTUDIANTE B
        List<Integer> numeros = Arrays.asList(15, 2, 9, 21, 7, 3, 8, 4);
        System.out.println("\nListado de números: " + numeros);
        IntSummaryStatistics estadisticas = numeros.stream()
            .mapToInt(num -> num)
            .summaryStatistics();
        System.out.println("--- Resultados Carril 1 (Estudiante B) ---");
        System.out.println("El número más pequeño es: " + estadisticas.getMin());
    }
}