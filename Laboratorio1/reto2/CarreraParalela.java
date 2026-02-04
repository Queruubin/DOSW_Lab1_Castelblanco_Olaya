package Laboratorio1.reto2;
import java.util.List;
import java.util.function.BinaryOperator;

public class CarreraParalela {
    public static void main(String[] args) {

        BinaryOperator<Integer> mayor = (a, b) -> a > b ? a : b;

        int max = List.of(3, 8, 6, 2).stream().reduce(mayor).orElse(null);

        System.out.println("El número mayor es: " + max);
    }
}
