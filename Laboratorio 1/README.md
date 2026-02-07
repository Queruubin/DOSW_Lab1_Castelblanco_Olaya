# [cite_start]#Maratón Git 2026-1 [cite: 44]

## [cite_start]## Integrantes [cite: 45]
* [cite_start]**Nombre completo 1:** [Tu Nombre Aquí] [cite: 46]
* [cite_start]**Nombre completo 2:** [Nombre de tu Compañero Aquí] [cite: 47]

---

## ## Estrategia de Resolución de Conflictos
[cite_start]Durante el desarrollo del laboratorio, la mayoría de los conflictos surgieron al intentar fusionar (**merge**) ramas donde ambos integrantes modificamos el mismo bloque de código o el mismo método[cite: 116, 240].

**El proceso estándar para resolverlos fue:**
1. [cite_start]**Detección:** Al ejecutar `git merge`, Git identificaba las líneas en conflicto[cite: 82, 116].
2. **Limpieza:** Editamos el archivo manualmente para eliminar los marcadores de conflicto (`<<<<<<<`, `=======`, `>>>>>>>`).
3. [cite_start]**Unificación:** Integramos la lógica de ambos (por ejemplo, combinando los comandos del Estudiante A y B en el Reto 6)[cite: 224, 225].
4. [cite_start]**Sincronización:** En casos complejos, utilizamos `git stash` y `git stash pop` para mover cambios temporalmente y evitar sobrescrituras[cite: 117, 242].

---

## [cite_start]## Retos completados [cite: 49]

### [cite_start]### Reto 1: Configuración y creación de rama [cite: 50, 64]
[cite_start]**Descripción:** [cite: 53, 67]
[cite_start]Configuramos el entorno local y el repositorio en GitHub[cite: 18, 20]. [cite_start]Implementamos un objeto `Estudiante` y una expresión lambda para imprimir un saludo de bienvenida procesando la lista con `stream()`, `map()` y `collect()`[cite: 88, 90, 92].

---

### [cite_start]### Reto 2: Carrera en Paralelo [cite: 102]
[cite_start]**Descripción:** [cite: 58]
[cite_start]Simulamos un flujo de trabajo paralelo usando subramas "carril"[cite: 104]. [cite_start]Resolvimos conflictos al integrar funciones que calculaban el máximo y mínimo de una lista, añadiendo validaciones con operadores ternarios[cite: 115, 119, 120].

---

### [cite_start]### Reto 3: El eco misterioso [cite: 132]

**Descripción:**
[cite_start]Utilizamos `StringBuilder` para repetición de mensajes y `StringBuffer` para inversión de cadenas[cite: 142, 145]. [cite_start]Unificamos ambos comportamientos en una sola función mediante lambdas y `stream()`[cite: 147, 150].

---

### [cite_start]### Reto 4: El tesoro de las llaves duplicadas [cite: 152]

**Descripción:**
[cite_start]Implementamos la combinación de un `HashMap` y un `Hashtable`[cite: 159, 160]. [cite_start]Resolvimos conflictos de llaves duplicadas priorizando el `Hashtable` y utilizamos `Collectors.toMap()` para ordenar y transformar las llaves a mayúsculas[cite: 163, 167].

---

### [cite_start]### Reto 5: Batalla de Conjuntos [cite: 180]

**Descripción:**
[cite_start]Filtramos números aleatorios en un `HashSet` (sin orden) y un `TreeSet` (orden natural) eliminando múltiplos específicos[cite: 185, 186]. [cite_start]La solución final unificó ambos conjuntos eliminando duplicados mediante `stream().filter()`[cite: 187, 190].

---
### [cite_start]### Reto 6: La máquina de decisiones [cite: 206]

**Descripción:**
[cite_start]Creamos una máquina de comandos usando un `Map<String, Runnable>`[cite: 228]. [cite_start]Cada integrante aportó un fragmento del manual, resultando en un conflicto al unificar el bloque `switch-case` y las lambdas de ejecución[cite: 224, 226].

---
## Evidencias del git tree de como se hicieron los commits entre tomas y yo
* ![Evidencia 1](pruebaTree2.png)
* ![Evidencia 2](pruebaTree1.png)

## ## Preguntas teóricas

1. **¿Cuál es la diferencia entre git merge y git rebase?**
   * *Respuesta:* `merge` une dos ramas creando un nuevo commit de fusión y mantiene el historial original; `rebase` mueve los commits a la punta de la rama destino para crear un historial lineal.
   

2. **Si dos ramas modifican la misma línea de un archivo, ¿qué sucede al hacer merge?**
   * *Respuesta:* Se genera un **conflicto de merge**. Git detiene la integración y marca el archivo para que el programador decida manualmente qué versión conservar.

3. **¿Cómo puedes ver gráficamente el historial de merges y ramas en consola?**
   * *Respuesta:* Utilizando el comando `git log --graph --oneline --all`.

4. **Explica la diferencia entre un commit y un push.**
   * *Respuesta:* Un `commit` guarda tus cambios localmente en tu historial; un `push` sube esos cambios al servidor remoto (como GitHub) para compartirlos.

5. **¿Para qué sirven git stash y git pop?**
   * *Respuesta:* `git stash` guarda temporalmente cambios sin confirmar para limpiar el área de trabajo; `git pop` recupera esos cambios para seguir trabajando en ellos.

6. **¿Qué diferencia hay entre HashMap y HashTable?**
   * *Respuesta:* `HashMap` es más rápido, no es sincronizado y permite nulos; `HashTable` es sincronizado (seguro para hilos), más lento y no permite nulos.

7. **¿Qué ventajas tiene Collectors.toMap() frente a un bucle tradicional para llenar un mapa?**
   * *Respuesta:* Ofrece un código más legible (declarativo), permite procesar datos en paralelo y facilita la resolución de conflictos entre llaves duplicadas.

8. **Si usas List con objetos y luego aplicas stream().map(), ¿qué tipo de operación estás haciendo?**
   * *Respuesta:* Una **transformación**. Se toma cada elemento de la lista y se convierte en un nuevo valor o tipo de dato según la función aplicada.
   

9. **¿Qué hace el método stream().filter() y qué retorna?**
   * *Respuesta:* Evalúa cada elemento bajo una condición (predicado) y descarta los que no la cumplen; retorna un nuevo `Stream` con los elementos filtrados.