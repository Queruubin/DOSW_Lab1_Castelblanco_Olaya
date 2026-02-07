import java.util.HashMap;
import java.util.Map;

public class Reto6 {
    private static final Map<String, Runnable> comandos = new HashMap<>();

    public static void main(String[] args) {
        inicializarManual();

        System.out.println("--- Iniciando secuencia de prueba de la Máquina ---\n");

        ejecutarComando("SALUDAR");
        ejecutarComando("CANTAR");

        System.out.println("\n--- Insertando Fragmento 2 (Tus Comandos) ---\n");

        ejecutarComando("BROMEAR");
        ejecutarComando("GRITAR");
        ejecutarComando("SUSURRAR");
        ejecutarComando("ANALIZAR");

        System.out.println("\n--- Prueba de comando desconocido ---");
        ejecutarComando("AUTO-DESTRUIR");
    }

    public static void ejecutarComando(String operacion) {
        Runnable accion = comandos.get(operacion.toUpperCase());

        if (accion != null) {
            accion.run();
        } else {
            System.out.println("Error: Comando [" + operacion + "] no reconocido por la máquina.");
        }
    }

    public static void inicializarManual() {
        comandos.put("SALUDAR", () -> System.out.println("La máquina dice: ¡Saludos, viajero del tiempo y del código!"));
        comandos.put("DESPEDIR", () -> System.out.println("La máquina dice: Que los bits te acompañen, hasta la próxima misión."));
        comandos.put("CANTAR", () -> System.out.println("La máquina canta: 01010101"));
        comandos.put("DANZAR", () -> System.out.println("La máquina gira y emite chispas: Girando en modo fiesta."));
        comandos.put("BROMEAR", () -> System.out.println("La máquina ríe: ¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio…"));
        comandos.put("GRITAR", () -> System.out.println("La máquina grita: ¡¡¡ALERTA DE STACK OVERFLOW!!!"));
        comandos.put("SUSURRAR", () -> System.out.println("La máquina susurra: Shhh… los bugs están dormidos"));
        comandos.put("ANALIZAR", () -> System.out.println("La máquina procesa: Analizando datos… resultado: ¡Eres increíble programando!"));
    }
}