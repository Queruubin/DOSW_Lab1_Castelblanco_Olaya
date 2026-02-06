import java.util.*;
import java.util.stream.*;

public class reto5 {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>(Arrays.asList(12, 3, 25, 10, 7, 30, 18, 4));
        
        System.out.println("--- Guerreros de Estudiante B ---");
        Set<Integer> filtrado = filtrarMúltiplosDe5(treeSet);
        filtrado.forEach(n -> System.out.println("Guerrero B: " + n));
    }

    public static Set<Integer> procesarConjuntos(Set<Integer> conjuntoA, Set<Integer> conjuntoB) {
        return conjuntoB.stream()
                .filter(n -> n % 5 != 0)
                .collect(Collectors.toCollection(TreeSet::new));
    }

    public static Set<Integer> filtrarMúltiplosDe5(Set<Integer> entrada) {
        return entrada.stream()
                .filter(n -> n % 5 != 0)
                .collect(Collectors.toCollection(TreeSet::new));
    }
}