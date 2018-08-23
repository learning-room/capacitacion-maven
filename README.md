# Capacitacion Maven 
Este repositorio nos acompañara en toda etapa de nuestra formación en maven. La idea es ir detectando problemas comunes y resolverlos con fundamentos teoricos pero mas que nada practicos. 
## Clase 1 - Fundamentos
Se inicia con la base de maven conociendo dos funcionalidades en las cuales maven es sobresaliente. Una es el manejo de dependencias y la segunda el armado de paquetes.
En la primera clase se planteo un problema especifico y muy comun que es crear nuestro primer POJO (clase Persona), instanciarlo con valores aleatorios y luego pasarlo a un formato JSON.
Se vera que si nosotros queremos realizar toda una libreria para solucionar este problema, nos llevaria mucho tiempo y hasta podriamos perder el objetivo inicial de la aplicación que es mostrar por consola el correspondiente JSON de una instancia de la clase Persona. Para lo cual nos dimos cuenta que es mas rapido y simple traer una libreria de terceros ( en este caso Jackson) que ya realize esta funcionalidad para simplemente usarlo. Ahora bien ¿Comó importamos esta libreria dentro de nuestro proyecto?, Acá es donde viene Maven al rescate. Con todo su mecanismo de manejador de dependencias mas su repositorio, logramos incorporar esta dependencia de una manera facil, en el archivo de configuración centralizada de maven llamado **pom.xml**.
En una siguiente etapa y ya logrado el objetivo de crear de la aplicación nos encontramos con un pequeño problema el cual es de crear un solo archivo ejecutable para lograr transportar nuestra aplicación por los lugares donde queramos. Para ello hacemos uso de una segunda funcionalidad de maven que es la de manipular las distintas etapas de creacion de paquetes a traves del elemento **build** al cual si hacemos uso de uno de los plugins de packaging de maven logramos crear un archivo standalone y exportable de nuestro proyecto. 

### Ejercicios
*Creando una nueva rama con su nombre (ejemplo: **gemma**) resuelva los siguientes items en este documento*
* Haciendo uso de la clase **Scanner** popular los valores de una instancia de la clase persona a traves de consola. 
* Agregar un nuevo atributo a la clase persona (el que se le ocurra :P) y transformarlo nuevamente
* ¿Que es el elemento **denendencie** de maven y para que sirve?
* ¿Que es el elemento **build** dentro de maven y para que sirve?
* ¿Que es el elemento **dependencyManagment** y para que sirve? ¿Por qué se puede dar que haya conflictos entre dependencias?
## Clase Final - Multimodulo
Se vio en clase la potencia de maven al crear un proyecto con multiples modulos. Generalizacion de proyectos.

### Ejercicios
* Haciendo uso de lo visto hasta el momento, tranformar el proyecto que se esta desarrollando hasta el momento y agregar un pom padre con dos modulos. El primer modulo debe tener como dependencia a jackson y debe proveer una clase con un metodo estatico que transforma a json una instancia de la clase persona, el segundo modulo solo debe tener la clase con el metodo main, con la logica ya realizada pero consumiendo el metodo estatico de la clase creada en el primer modulo. 
**Tip: Para realizar esto, hay que REFACTORIZAR**

#### Respuestas

Dependencia: Son componentes de software que se  necesita  incluir en un proyecto (libs, jars, ears, zips, etc.).
Sirve para que el proyecto compile.

Build: 
Maven tiene una arquitectura muy modular, está construido mediante plugins. 
Sirve para definir en que fase ejecuto determinado paquete. Entonces maven va ejecutando fases del build y en cada una de estas se meten los plugins para hacer cosas como compilar, generar código.

DependecyManager: Permite consolidar y centralizar la administración de versiones de dependencia.
Esto es especialmente útil cuando tiene un conjunto de proyectos (es decir, más de uno) que hereda un elemento primario común.

Sirve para definir una versión estándar de un artefacto para usar en múltiples proyectos.

Hay conflicto de dependencia, cuando una dependencia esta incluida en mas de un proyecto y la misma tiene varias versiones.

