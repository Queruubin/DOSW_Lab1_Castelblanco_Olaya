import java.util.HashMap;
import java.util.Map;

public class Reto6 {
    private static final Map<String, Runnable> comandos = new HashMap<>();

    public static void main(String[] args) {
        inicializarManual();
        
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
        comandos.put("SALUDAR", () -> System.out.println("La máquina dice: ¡Saludos, viajero del tiempo y del código!"));
        comandos.put("DESPEDIR", () -> System.out.println("La máquina dice: Que los bits te acompañen, hasta la próxima misión."));
        comandos.put("CANTAR", () -> System.out.println("La máquina canta: 01010101"));
        comandos.put("DANZAR", () -> System.out.println("La máquina gira y emite chispas: Girando en modo fiesta."));
    }
}