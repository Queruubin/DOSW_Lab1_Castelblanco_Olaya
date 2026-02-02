package reto2;

import java.util.Arrays;
import java.util.List;
import java.util.IntSummaryStatistics;

public class CarreraParalela {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(5, 2, 9, 1, 7, 3, 8, 4);
        System.out.println("Datos de la carrera: " + numeros);

        
        IntSummaryStatistics estadisticas = numeros.stream()
            .mapToInt((numero) -> numero)
            .summaryStatistics();
        System.out.println("\n--- Resultados Carril 2 (Tomás) ---");
        System.out.println("El número más pequeño es: " + estadisticas.getMin());
        System.out.println("Total de datos procesados: " + estadisticas.getCount());
        

    }
}