import java.util.*;
import java.util.stream.*;

public static void main(String[] args) {
        Hashtable<String, Integer> ht = new Hashtable<>();
        ht.put("plata", 8);
        ht.put("rubí", 4);
        ht.put("oro", 12);
        ht.put("esmeralda", 6);

        System.out.println("--- Ejecución Estudiante B ---");
    }
    public static Map<String, Integer> crearMapaB(List<Map.Entry<String, Integer>> entrada) {
        Map<String, Integer> tabla = new Hashtable<>();
        for (Map.Entry<String, Integer> e : entrada) {
            tabla.putIfAbsent(e.getKey(), e.getValue());
        }
        return tabla;
    }

    public static Map<String, Integer> combinarMapas(Map<String, Integer> hm, Map<String, Integer> ht) {
        Map<String, Integer> finalMap = new Hashtable<>(ht);
        hm.forEach((k, v) -> finalMap.putIfAbsent(k, v));
        return finalMap;
    }

    public static void imprimirOrdenado(Map<String, Integer> mapa) {
        mapa.keySet().stream()
            .sorted()
            .forEach(System.out::println);
    }