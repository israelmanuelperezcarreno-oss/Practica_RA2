# Práctica RA2: Evaluación y Gestión de Entornos de Desarrollo

**Alumno:** Israel Manuel Pérez Carreño  
**Correo Electrónico:** israelmanuelperezcarreno@gmail.com  
**GitHub:** [israelmanuelperezcarreno-oss](https://github.com/israelmanuelperezcarreno-oss)  
**Repositorio Oficial:** [https://github.com/israelmanuelperezcarreno-oss/Practica_RA2](https://github.com/israelmanuelperezcarreno-oss/Practica_RA2)  
**Módulo Formativo:** Entornos de Desarrollo (Resultado de Aprendizaje 2)  
**Ciclo Formativo:** Desarrollo de Aplicaciones Multiplataforma / Web (DAM / DAW)

---

## 🎯 Objetivos de la Práctica
1. **Configuración, personalización y evaluación de IDEs:** Instalación, ajuste visual nativo, configuración de guardado automático (Save Actions) y gestión de actualizaciones de Eclipse.
2. **Gestión de Módulos y Herramientas CASE:** Integración del plugin Papyrus SysML 1.6 para modelado UML/SysML, gestión de instalación y desinstalación de plugins secundarios en Eclipse Marketplace.
3. **Control de Versiones Profesional (Git/GitHub):** Creación de repositorios, trabajo mediante ramas de características (`feature-uml`, `feature-python`, `feature-java-gui`), fusiones (`merges`) y sincronización con GitHub Desktop.
4. **Soporte Multilenguaje:** Demostración de las capacidades políglotas de Eclipse mediante el módulo PyDev y ejecución de scripts Python.
5. **Diseño de Interfaces Gráficas (WindowBuilder):** Construcción de aplicaciones visuales Swing con ventanas conectadas (`VentanaPrincipal` y `SegundaVentana`) y generación de ejecutables.
6. **Ejecución Cruzada y Comparativa de IDEs:** Validación de la portabilidad del código fuente ejecutando el proyecto en Visual Studio Code sin modificaciones, junto con una comparativa técnica profunda.


---

## 🛠️ Ejercicio 1: Herramientas CASE y Modelado UML (Papyrus)

### 📐 Diagrama de Clases UML Replicado en Papyrus
Se ha modelado la arquitectura orientada a objetos compuesta por dos clases interconectadas mediante una asociación dirigida:

![Diagrama UML Papyrus](uml_model/diagrama_clases_usuario_perfil.png)

1. **Clase `Usuario`:**
   - **Atributos:**
     - `+ id : int` (Identificador único del usuario)
     - `+ nombre : String` (Nombre completo del usuario)
     - `+ email : String` (Dirección de correo electrónico)
   - **Operaciones:**
     - `+ iniciarSesion() : boolean` (Verifica credenciales de acceso)
     - `+ cerrarSesion() : void` (Finaliza la sesión activa)
2. **Clase `Perfil`:**
   - **Atributos:**
     - `+ idPerfil : int` (Identificador único del perfil asociado)
     - `+ biografia : String` (Descripción personal del usuario)
   - **Operaciones:**
     - `+ actualizarBiografia() : void` (Modifica el contenido biográfico)
3. **Relación (Association):**
   - Una asociación directa entre `Usuario` y `Perfil` que modela la cardinalidad de pertenencia (*Un usuario tiene asociado un perfil*).

---

### 📚 Fundamentos Teóricos: Funciones de las Herramientas CASE

Las herramientas **CASE** (*Computer-Aided Software Engineering* o Ingeniería de Software Asistida por Computadora), como **Eclipse Papyrus**, proporcionan un entorno automatizado para gestionar todo el ciclo de vida del software (SDLC). A continuación se identifican y explican detalladamente sus funciones primordiales:

#### 1. Funciones para el Desarrollo de Código
- **Modelado Visual y Abstracción:** Permiten a los arquitectos e ingenieros diseñar sistemas complejos utilizando lenguajes formales estandarizados (UML 2.5, SysML 1.6), reduciendo la complejidad cognitiva antes de escribir una sola línea de código.
- **Generación Automática de Esqueletos de Código (*Forward Engineering*):** A partir de los diagramas de clases, paquetes e interfaces, la herramienta CASE genera automáticamente el código fuente base (en lenguajes como Java, C++ o Python), incluyendo la declaración de clases, propiedades con sus tipos de datos, visibilidades (`public`, `private`) y firmas completas de métodos.
- **Ingeniería Inversa (*Reverse Engineering*):** Capacidad de analizar código fuente existente para sintetizar de forma automatizada diagramas UML representativos de la arquitectura real implementada, facilitando el análisis de código legado (*legacy*).
- **Ingeniería de Ida y Vuelta (*Round-Trip Engineering*):** Mantiene una sincronización bidireccional continua entre el modelo visual y el código fuente. Modificaciones realizadas en el diagrama actualizan el código, y cambios realizados en el IDE se reflejan de inmediato en los diagramas.

#### 2. Funciones para la Prueba de Software (*Testing*)
- **Generación de Pruebas Basadas en Modelos (*Model-Based Testing - MBT*):** Las herramientas CASE utilizan diagramas dinámicos (diagramas de máquinas de estados, diagramas de secuencias y de actividades) para deducir rutas de ejecución críticas, condiciones límite y generar automáticamente casos de prueba de unidad e integración.
- **Trazabilidad Completa de Requisitos:** En entornos como SysML (integrado en Papyrus), los diagramas de requisitos permiten vincular cada necesidad del cliente con los componentes de diseño que los satisfacen (`«satisfy»`) y con los casos de prueba que los verifican (`«verify»`), garantizando que ningún requisito quede sin probar.
- **Validación Estática de Modelos y Detección Temprana de Errores:** Incorporan motores de validación de reglas (como OCL - *Object Constraint Language*) que detectan contradicciones lógicas, dependencias circulares o violaciones de patrones de diseño en fases tempranas, evitando que los errores arquitectónicos lleguen a la fase de codificación, donde su corrección resulta hasta 100 veces más costosa.

#### 3. Funciones para la Documentación del Sistema
- **Generación Automatizada de Especificaciones Técnicas:** A partir del repositorio central de modelos (XMI/EMF), la herramienta extrae información actualizada para producir memorias de diseño, diccionarios de datos y manuales de arquitectura en formatos estandarizados (PDF, HTML, DocBook, Markdown).
- **Lenguaje Visual Unificado y Estandarizado:** Al fundamentarse en estándares internacionales del OMG (*Object Management Group*), la documentación generada elimina la ambigüedad del lenguaje natural y sirve como medio de comunicación riguroso entre clientes, analistas, desarrolladores y evaluadores de calidad.
- **Historial de Versiones Arquitectónicas y Gobernanza:** Permite documentar la evolución del diseño técnico en consonancia con los sistemas de control de versiones (Git), facilitando auditorías de software y el cumplimiento de normativas de calidad (como ISO/IEC/IEEE 12207 o CMMI).


---

## 🐍 Ejercicio 2: Soporte Multilenguaje (Python en Eclipse con PyDev)

### 📌 Justificación del Entorno Multilenguaje
A través del módulo **PyDev** instalado en Eclipse, se demuestra la versatilidad de un entorno de desarrollo integrado extensible. Un único IDE es capaz de proporcionar resaltado de sintaxis, análisis estático, depuración interactiva y ejecución tanto para lenguajes compilados basados en máquina virtual (Java) como para lenguajes interpretados dinámicos (Python).

### 💻 Código Fuente Implementado (`HolaMundo.py`)
```python
# Programa básico en Python
def mostrar_saludos():
    print("==================================")
    print("¡Hola Mundo desde Python en Eclipse!")
    print("==================================")

# Un pequeño bucle para mostrar la simplicidad de Python
for i in range(1, 4):
    print(f"Mensaje número {i}")

if __name__ == "__main__":
    mostrar_saludos()
```

### 🖥️ Resultado de la Ejecución en Consola de Eclipse
```text
==================================
¡Hola Mundo desde Python en Eclipse!
==================================
Mensaje número 1
Mensaje número 2
Mensaje número 3
```


---

## ☕ Ejercicio 3: Interfaces en Java (WindowBuilder), Ejecución Cruzada y Comparativa

### 🖼️ Desarrollo de la Aplicación Gráfica con WindowBuilder
Se ha desarrollado un proyecto Java visual estructurado mediante **WindowBuilder (Swing/AWT)** compuesto por dos ventanas interactivas:
1. **`VentanaPrincipal` (`JFrame`):**
   - Presenta un encabezado estilizado y el texto de bienvenida: *"¡Bienvenido a la App!"*.
   - Incorpora el botón interactivo *"Abrir Segunda Pantalla"*.
   - Gestiona el evento de acción (`ActionListener`) que instancia y hace visible la ventana secundaria (`setVisible(true)`).
2. **`SegundaVentana` (`JFrame`):**
   - Muestra el texto requerido: *"Esta es la segunda pantalla"*.
   - Incorpora un botón *"Volver / Cerrar Ventana"* que ejecuta `dispose()`, liberando los recursos de la ventana en memoria sin interrumpir la aplicación principal.
3. **Generación del Ejecutable Autónomo:**
   - Se ha compilado el código binario (`.class`) y empaquetado en un archivo ejecutable autónomo **`AppGUI.jar`** en la carpeta `bin/`.

---

### 🔄 Demostración de Ejecución Cruzada (*Cross-IDE Portability*)
El proyecto ha sido ejecutado tanto en **Eclipse IDE** como en **Visual Studio Code** sin requerir ninguna modificación en el código fuente:
- **Portabilidad garantizada:** El código respeta escrupulosamente la estructura canónica de proyectos Java y las bibliotecas estándar de la plataforma JDK (Java Standard Edition Swing/AWT).
- **Configuración en VS Code:** Se integró `.vscode/launch.json` y `.vscode/settings.json`, permitiendo compilar y ejecutar el proyecto con un solo clic en VS Code mediante la extensión *Language Support for Java™ by Red Hat*.

---

### 📊 Tabla Comparativa Exhaustiva: Eclipse IDE vs Visual Studio Code

A continuación se realiza una comparativa técnica profunda entre el entorno clásico **Eclipse IDE** y el entorno moderno **Visual Studio Code**, evaluando tanto sus características comunes como sus especificidades de diseño y rendimiento:

| Criterio de Comparativa | Eclipse IDE | Visual Studio Code | Análisis Técnico / Justificación |
| :--- | :--- | :--- | :--- |
| **Tipo de Software y Modelo de Licencia** | IDE completo tradicional. Código abierto bajo *Eclipse Public License (EPL 2.0)*. | Editor de código modular y extensible. Núcleo abierto (*MIT* en Code-OSS; binario oficial Microsoft bajo licencia privativa de distribución). | Ambos permiten uso profesional gratuito, pero Eclipse está gobernado enteramente por una fundación comunitaria neutral (*Eclipse Foundation*). |
| **Arquitectura de Base y Runtimes** | Arquitectura enriquecida de escritorio (*Eclipse Rich Client Platform - RCP*) basada en Java, SWT (Standard Widget Toolkit) y módulos OSGi (Equinox). | Arquitectura web de escritorio (*Electron Framework*), basada en Node.js, Chromium y motor JavaScript V8. | VS Code utiliza procesos desacoplados y comunicación asíncrona; Eclipse corre directamente sobre la Máquina Virtual de Java (JVM). |
| **Consumo de Recursos y Rendimiento** | **Elevado.** Requiere entre 1 GB y 2.5 GB de RAM. Tiempo de arranque inicial notablemente mayor (10 - 25 segundos). | **Moderado/Ligero.** Arranque casi instantáneo (1 - 3 segundos). Consumo base de memoria entre 300 MB y 800 MB de RAM. | VS Code ofrece una experiencia de usuario mucho más fluida en equipos con recursos limitados. Eclipse requiere hardware más potente para proyectos medianos. |
| **Compilador y Compilación Incremental** | Incorpora su propio compilador incremental interno: **ECJ (*Eclipse Compiler for Java*)**. No depende necesariamente del `javac` externo del sistema. | No incluye compilador propio. Se comunica mediante el protocolo **LSP (*Language Server Protocol*)** con el servidor de lenguaje *Eclipse JDT Language Server* (JDT-LS). | En Eclipse, el código Java se compila y valida en tiempo real con cada pulsación de tecla de forma instantánea y autónoma. |
| **Diseñadores Visuales GUI (RAD / CASE)** | **Excelente (WindowBuilder).** Permite diseñar interfaces gráficas Swing/SWT mediante arrastrar y soltar (*drag & drop*) con sincronización bidireccional inmediata de código. | **Ausente de forma nativa.** No dispone de diseñador visual WYSIWYG de interfaces gráficas Java. Requiere escribir el código visual a mano o usar herramientas externas. | Para desarrollo de interfaces gráficas tradicionales Java (Swing/SWT/AWT), Eclipse con WindowBuilder es infinitamente superior y productivo. |
| **Herramientas CASE y Modelado de Sistemas** | **Avanzado y Estándar de la Industria.** Soporta plugins como **Papyrus SysML 1.6**, EMF (*Eclipse Modeling Framework*) y GMF para ingeniería dirigida por modelos (MDE). | **Básico / Visualizadores.** Soporte restringido a extensiones ligeras de renderizado textual de diagramas (ej. PlantUML o Mermaid). | Eclipse es una plataforma consolidada para ingeniería de software rigurosa y diseño formal orientado a objetos; VS Code se enfoca en codificación ágil. |
| **Soporte Multilenguaje** | Mediante perspectivas y plugins especializados monolíticos (PyDev para Python, CDT para C/C++, PDT para PHP, WTP para Web). | Nativo y prácticamente universal mediante extensiones desacopladas instalables desde el *Visual Studio Marketplace*. | VS Code popularizó el estándar LSP, lo que le permite soportar más de 50 lenguajes con soporte idéntico de análisis estático y autocompletado. |
| **Gestión de Espacios de Trabajo (*Workspaces*)** | Modelo rígido basado en carpeta `.metadata`. Un único workspace gestiona múltiples proyectos vinculados simultáneamente. | Basado en carpetas abiertas y archivos `.code-workspace`. Cada ventana del editor se asocia a una carpeta raíz. | El modelo de VS Code es más intuitivo y ligero para desarrollo web y microservicios; el de Eclipse es más robusto para grandes suites empresariales. |
| **Depuración (*Debugging*)** | Depurador Java de nivel empresarial con soporte maduro de *Hot Code Replace*, inspección de hilos múltiples y visualización de memoria/variables. | Depurador unificado mediante el estándar *Debug Adapter Protocol (DAP)*, con configuración ágil en archivos `launch.json`. | Ambos depuradores son de primer nivel. VS Code destaca por su interfaz minimalista y unificada para depurar front-end y back-end en la misma sesión. |
| **Integración de Control de Versiones (Git)** | Integración gráfica profunda mediante **EGit**, con perspectivas dedicadas a repositorios Git, historial de ramas y editor de diferencias *Compare Editor*. | Control de versiones integrado de forma nativa en la barra de actividades lateral, soporte de ramas, staging por líneas y terminal interactiva integrada. | La interfaz Git de VS Code es más ágil para flujos diarios; la de Eclipse ofrece mayor detalle analítico en fusiones complejas (*three-way merge*). |
