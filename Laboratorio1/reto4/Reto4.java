package Laboratorio1.reto4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Reto4 {
    public static void main(String[] args) {
        Map<String, Integer> hm = new HashMap<>();
        hm.put("oro", 5);
        hm.put("plata", 3);
        hm.put("oro", 7);
        hm.put("diamante", 10);

        System.out.println("--- Ejecución Estudiante A ---");
    }

    public static Map<String, Integer> crearMapaA(List<Map.Entry<String, Integer>> entrada) {
        Map<String, Integer> mapa = new HashMap<>();
        for (Map.Entry<String, Integer> e : entrada) {
            mapa.putIfAbsent(e.getKey(), e.getValue());
        }
        return mapa;
    }

    public static Map<String, Integer> combinarMapas(Map<String, Integer> hm, Map<String, Integer> ht) {
        Map<String, Integer> res = new HashMap<>(hm);
        ht.forEach((k, v) -> res.put(k, v));
        return res;
    }

    public static void imprimirMayusculas(Map<String, Integer> mapa) {
        mapa.keySet().stream()
            .map(String::toUpperCase)
            .forEach(System.out::println);
    }
}
