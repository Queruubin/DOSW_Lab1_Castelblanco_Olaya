import java.util.*;
import java.util.stream.*;

public class reto5 {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>(Arrays.asList(4, 9, 15, 7, 18, 21, 10, 5));
        Set<Integer> treeSet = new TreeSet<>(Arrays.asList(12, 3, 25, 10, 7, 30, 18, 4));

        System.out.println("--- BATALLA FINAL ---");
        reclamarArena(hashSet, treeSet);
    }

    public static void reclamarArena(Set<Integer> hSet, Set<Integer> tSet) {
        Stream<Integer> streamA = hSet.stream().filter(n -> n % 3 != 0);
        Stream<Integer> streamB = tSet.stream().filter(n -> n % 5 != 0);

        Stream.concat(streamA, streamB)
            .distinct()
            .sorted()
            .forEach(n -> System.out.println("Número en arena: " + n));
    }
}