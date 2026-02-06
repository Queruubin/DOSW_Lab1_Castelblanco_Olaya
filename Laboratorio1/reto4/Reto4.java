package Laboratorio1.reto4;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reto4 {
  public static void main(String[] args) {
    // Datos del Estudiante A
    Map<String, Integer> hm = new HashMap<>();
    hm.put("oro", 5);
    hm.put("plata", 3);
    hm.put("oro", 7);
    hm.put("diamante", 10);

    // Datos del Estudiante B
    Map<String, Integer> ht = new Hashtable<>();
    ht.put("plata", 8);
    ht.put("rubí", 4);
    ht.put("oro", 12);
    ht.put("esmeralda", 6);

    reclamarTesoro(hm, ht);
}

    public static void reclamarTesoro(Map<String, Integer> hashMap, Map<String, Integer> hashTable) {
    Stream.concat(hashMap.entrySet().stream(), hashTable.entrySet().stream())
        .collect(Collectors.toMap(
            entry -> entry.getKey().toUpperCase(), // Claves a mayúsculas
            Map.Entry::getValue, 
            (valorHM, valorHT) -> valorHT // Si hay conflicto, prioriza el valor del Hashtable
        ))
        .entrySet().stream()
        .sorted(Map.Entry.comparingByKey()) // Ordenar ascendente
        .forEach(e -> System.out.println("● Clave: " + e.getKey() + " | Valor: " + e.getValue()));
}
}
