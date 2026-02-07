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
[cite_start]**Evidencia:** [cite: 51, 65]
* ![Evidencia 1](Imagenes/reto1_1.png)
* ![Evidencia 2](Imagenes/reto1_2.png)

[cite_start]**Descripción:** [cite: 53, 67]
[cite_start]Configuramos el entorno local y el repositorio en GitHub[cite: 18, 20]. [cite_start]Implementamos un objeto `Estudiante` y una expresión lambda para imprimir un saludo de bienvenida procesando la lista con `stream()`, `map()` y `collect()`[cite: 88, 90, 92].

---

### [cite_start]### Reto 2: Carrera en Paralelo [cite: 102]
[cite_start]**Evidencia:** [cite: 56]
* ![Evidencia 1](Imagenes/reto2_1.png)
* ![Evidencia 2](Imagenes/reto2_2.png)

[cite_start]**Descripción:** [cite: 58]
[cite_start]Simulamos un flujo de trabajo paralelo usando subramas "carril"[cite: 104]. [cite_start]Resolvimos conflictos al integrar funciones que calculaban el máximo y mínimo de una lista, añadiendo validaciones con operadores ternarios[cite: 115, 119, 120].

---

### [cite_start]### Reto 3: El eco misterioso [cite: 132]
**Evidencia:**
* ![Evidencia 1](Imagenes/reto3_1.png)
* ![Evidencia 2](Imagenes/reto3_2.png)

**Descripción:**
[cite_start]Utilizamos `StringBuilder` para repetición de mensajes y `StringBuffer` para inversión de cadenas[cite: 142, 145]. [cite_start]Unificamos ambos comportamientos en una sola función mediante lambdas y `stream()`[cite: 147, 150].

---

### [cite_start]### Reto 4: El tesoro de las llaves duplicadas [cite: 152]
**Evidencia:**
* ![Evidencia 1](Imagenes/reto4_1.png)
* ![Evidencia 2](Imagenes/reto4_2.png)

**Descripción:**  
Breve explicación del proceso realizado para configurar el repositorio y crear una nueva rama.


---


### Reto 2: Commit colaborativo  
**Evidencia:**  
Captura de imagen  


**Descripción:**  
Breve explicación de cómo se realizó el trabajo colaborativo, cómo se integraron los cambios, y más detalles relevantes.


---


## Preguntas teóricas


- **Pregunta 1:**  
Respuesta...


 