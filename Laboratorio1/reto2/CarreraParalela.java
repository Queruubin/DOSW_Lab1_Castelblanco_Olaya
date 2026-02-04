package reto2;

import java.util.Arrays;
import java.util.List;
import java.util.IntSummaryStatistics;

public class CarreraParalela {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(15, 2, 9, 21, 7, 3, 8, 4);
        System.out.println("Listado de números: " + numeros);
        
        IntSummaryStatistics estadisticas = numeros.stream()
            .mapToInt(num -> num)
            .summaryStatistics();
            
        System.out.println("\n--- Resultados Carril 1 (Estudiante B) ---");
        System.out.println("El número más grande es: " + estadisticas.getMax());
        

    }
}