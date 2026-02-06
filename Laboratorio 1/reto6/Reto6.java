import java.util.HashMap;
import java.util.Map;

public class Reto6 {
    private static final Map<String, Runnable> comandos = new HashMap<>();

    public static void main(String[] args) {
        inicializarManual();
        
        // Pruebas de funcionamiento
        ejecutarComando("SALUDAR");
        ejecutarComando("BROMEAR");
    }

    public static void ejecutarComando(String operacion) {
        Runnable accion = comandos.get(operacion.toUpperCase());
        if (accion != null) {
            accion.run();
        } else {
            System.out.println("Comando no reconocido.");
        }
    }

    public static void inicializarManual() {
        // Aquí ocurrirá la magia (y el conflicto)
    }
}