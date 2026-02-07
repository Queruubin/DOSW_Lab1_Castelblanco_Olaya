package reto2;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.BinaryOperator;

class Resultados {
    long mayorLista1;
    long menorLista1;
    long cantidadLista1;
    String mayorLista1Propiedad;
    String cantidadLista1Paridad;
    
    long mayorLista2;
    long menorLista2;
    long cantidadLista2;
    String mayorLista2Propiedad;
    String cantidadLista2Paridad;
}

public class CarreraParalela {

    public static void main(String[] args) {

        List<Integer> lista1 = List.of(3, 8, 6, 2);
        List<Integer> lista2 = List.of(15, 2, 9, 21, 7, 3, 8, 4);

        Resultados resultados = analizarListas(lista1, lista2);

        System.out.println("=== RESULTADOS ===");
        System.out.println("Lista 1 - Mayor: " + resultados.mayorLista1);
        System.out.println("Lista 1 - Menor: " + resultados.menorLista1);
        System.out.println("Lista 1 - Cantidad: " + resultados.cantidadLista1);
        System.out.println("Lista 1 - Mayor: " + resultados.mayorLista1Propiedad);
        System.out.println("Lista 1 - Cantidad: " + resultados.cantidadLista1Paridad);

        System.out.println();

        System.out.println("Lista 2 - Mayor: " + resultados.mayorLista2);
        System.out.println("Lista 2 - Menor: " + resultados.menorLista2);
        System.out.println("Lista 2 - Cantidad: " + resultados.cantidadLista2);
        System.out.println("Lista 2 - Mayor: " + resultados.mayorLista2Propiedad);
        System.out.println("Lista 2 - Cantidad: " + resultados.cantidadLista2Paridad);
    }

    // 🔹 FUNCIÓN ÚNICA
    public static Resultados analizarListas(List<Integer> lista1, List<Integer> lista2) {

        Resultados r = new Resultados();

        BinaryOperator<Integer> mayor = (a, b) -> a > b ? a : b;

        IntSummaryStatistics stats1 = lista1.stream()
                .mapToInt(n -> n)
                .summaryStatistics();

        r.mayorLista1 = lista1.stream().reduce(mayor).orElse(0);
        r.menorLista1 = stats1.getMin();
        r.cantidadLista1 = stats1.getCount();

        r.mayorLista1Propiedad =
                (r.mayorLista1 % 2 == 0) ? "es múltiplo de 2" :
                (2 % r.mayorLista1 == 0 ? "es divisor de 2" : "no es múltiplo ni divisor de 2");

        r.cantidadLista1Paridad =
                (r.cantidadLista1 % 2 == 0) ? "par" : "impar";

        IntSummaryStatistics stats2 = lista2.stream()
                .mapToInt(n -> n)
                .summaryStatistics();

        r.mayorLista2 = lista2.stream().reduce(mayor).orElse(0);
        r.menorLista2 = stats2.getMin();
        r.cantidadLista2 = stats2.getCount();

        r.mayorLista2Propiedad =
                (r.mayorLista2 % 2 == 0) ? "es múltiplo de 2" :
                (2 % r.mayorLista2 == 0 ? "es divisor de 2" : "no es múltiplo ni divisor de 2");

        r.cantidadLista2Paridad =
                (r.cantidadLista2 % 2 == 0) ? "par" : "impar";

        return r;
    }
}
