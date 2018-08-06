# Capacitacion Maven
Este repositorio nos acompañara en toda etapa de nuestra formación en maven. La idea es ir detectando problemas comunes y resolverlos con fundamentos teoricos pero mas que nada practicos. 
## Clase 1 - Fundamentos
Se inicia con la base de maven conociendo dos funcionalidades en las cuales maven es sobresaliente. Una es el manejo de dependencias y la segunda el armado de paquetes.
En la primera clase se planteo un problema especifico y muy comun que es crear nuestro primer POJO (clase Persona), instanciarlo con valores aleatorios y luego pasarlo a un formato JSON.
Se vera que si nosotros queremos realizar toda una libreria para solucionar este problema, nos llevaria mucho tiempo y hasta podriamos perder el objetivo inicial de la aplicación que es mostrar por consola el correspondiente JSON de una instancia de la clase Persona. Para lo cual nos dimos cuenta que es mas rapido y simple traer una libreria de terceros ( en este caso Jackson) que ya realize esta funcionalidad para simplemente usarlo. Ahora bien ¿Comó importamos esta libreria dentro de nuestro proyecto?, Acá es donde viene Maven al rescate. Con todo su mecanismo de manejador de dependencias mas su repositorio, logramos incorporar esta dependencia de una manera facil, en el archivo de configuración centralizada de maven llamado **pom.xml**.
En una siguiente etapa y ya logrado el objetivo de crear de la aplicación nos encontramos con un pequeño problema el cual es de crear un solo archivo ejecutable para lograr transportar nuestra aplicación por los lugares donde queramos. Para ello hacemos uso de una segunda funcionalidad de maven que es la de manipular las distintas etapas de creacion de paquetes a traves del elemento **build** al cual si hacemos uso de uno de los plugins de packaging de maven logramos crear un archivo standalone y exportable de nuestro proyecto. 

### Ejercicios
*Creando una nueva rama con su nombre (de esta manera: **clase1-${tu.nombre}**) resuelva los siguientes items en este documento*
* Haciendo uso de la clase **Scanner** popular los valores de una instancia de la clase persona a traves de consola. 
* Agregar un nuevo atributo a la clase persona (el que se le ocurra :P) y transformarlo nuevamente
* ¿Que es el elemento **denendencie** de maven y para que sirve?
* ¿Que es el elemento **build** dentro de maven y para que sirve?
* ¿Que es el elemento **dependencyManagment** y para que sirve? ¿Por qué se puede dar que haya conflictos entre dependencias?

