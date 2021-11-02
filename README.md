# API REST con Spring Boot, Mysql y Maven.

Creación de una API REST utilizando el Framework Spring Boot con el IDE Spring Tool Suite 4 junto con Maven, Mysql.


</br>


| **Tecnologías** | **Versión** | **Finalidad** |               
| ------------- | ------------- | ------------- |
| Java |   12.0.2 | JDK |
| Spring Tool Suite 4 | 4.9.0  | IDE |
| Spring Boot |   2.5.4  | Framework |
| XAMPP | 3.2.2  | Paquete de Servidores |
| Maven |  4.0.0 | Gestor de Proyectos |
| Cygwin | 3.1.6-1  | Colección de Herramientas / Terminal en Windows integrada al IDE Eclipse |
| Git | 2.29.1  | Control de Versiones |

</br>

| **Dependencia Maven**  | **Versión** | **Finalidad** |               
| ------------- | ------------- | ------------- |
| mysql-connector | 8.0.21 |  Conexión e Implementación de Queries a la db con Mysql |
| javax.xml.bind | 2.3.1 |  Dependencia para convertir Objetos Java en Objetos XML |
| jackson-databind | 2.12.4 |  Dependencia para convertir Objetos Java en Objetos JSON |



* Repositorio dependencia mysql : https://mvnrepository.com/artifact/mysql/mysql-connector-java/8.0.21
* Repositorio dependencia javax.xml.bind : https://mvnrepository.com/artifact/javax.xml.bind/jaxb-api
* Repositorio dependencia jackson-databind :  https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind 



</br>

## Descarga y documentacion de las Tecnologías empleadas:
#### Java-JDK 12:                     https://www.oracle.com/java/technologies/javase/jdk12-archive-downloads.html
#### Spring Tool Suite 4:             https://spring.io/tools
#### XAMPP:                            https://www.apachefriends.org/download.html
#### Maven Repositories:              https://mvnrepository.com/
#### Cygwin:                           https://cygwin.com/install.html
#### Git:                              https://git-scm.com/docs



</br>

<hr>

# ` Documentación y Guía del Proyecto `
### (Esta Documentación que Desarrollé es para la Creación y Configuración del Proyecto desde Cero, Manejo de Maven, Spring Tool Suite, Spring Booot, Hibernate-JPA, Mysql, Dependencias con Maven, Servidor de Despliegue y otros Usos de este Proyecto. Recomiendo Leerla y Realizar todo paso a paso como se indica en la misma).

</br>

## Indice

#### Sección 1) Creación del Proyecto y Configuraciones   
   
   - [Paso 1) Creación y Configuraciones de un Proyecto Spring Boot con Maven en Spring Tool Suite 4.](#paso-1-creación-de-un-proyecto-spring-boot-con-maven-en-spring-tool-suite-4-y-configuraciones-iniciales)
  
   - [Paso 2) Otras Configuraciones del Proyecto.](#paso-2-otras-configuraciones-del-proyecto)



#### Sección 2) Configuración de las Dependencias y el SGDB Mysql
   
   - [Paso 3) Dependencias del Proyecto.](#paso-3-dependencias-del-proyecto)
   
   - [Paso 4) Configuraciones del SGDB Mysql.](#paso-4-configuraciones-del-sgdb-mysql) 
   
   

#### Sección 3) Configuración del Archivo de Propiedades(application.properties)
   
   - [Paso 5) Archivo de Propiedades(application.properties)](#paso-5-archivo-de-propiedades-application.properties)








</br>

## Sección 1) Creación del Proyecto y Configuraciones

</br>


### Paso 1) Creación de un Proyecto Spring Boot con Maven en Spring Tool Suite 4 y Configuraciones Iniciales.
#### (Primeramente deberás configurar tu espacio de trabajo, en donde se alojará la aplicación. Cada vez que muevas el Proyecto de Directorio, recomiendo crear o setear nuevamente el Espacio de Trabajo).


* Una vez abierto Spring Tool Suite 4
   * --> Seleccionas la Pestaña File 
   * --> New 
   * --> Spring Starter Proyect(Si no aparece buscar en Other).

* Se abrirá una Interfaz Gráfica, por defecto dejar marcado lo siguiente con los siguientes valores por defecto
   * --> Service Url : https://start.spring.io
   * --> Use default location por defecto(es la ruta absoluta de tu workspace)
   * --> Type : Maven
   * --> Java Version : 8
   * --> Packaging : Jar
   * --> Language : Java
   * --> Artifact : Por Defecto como está (cambia automáticamente cuando escribimos el Name del Proyect)
   * --> Version  : Por Defecto como está
   * --> Working Sets Desmarcado.

* Configuramos lo restante
   * --> Name : Api_Rest_Spring_Productos (Nombre del proyecto, en mi caso este). Debe cambiarse aut. el Artifact
   * --> Group : com.api.productos (Nombre del grupo, en mi caso este).
   * --> Description: Creación de una Api Rest de Productos con Spring  (en mi caso).
   * --> Package : com.api.productos (Nombre del grupo, este en mi caso).
   * --> Next

* En la Nueva Interfaz Gráfica elegimos la versión y dependencia
   * --> Spring Boot Versión : 2.5.6 o una que no sea la última
   * --> Seleccionamos la casilla Spring Web
   * --> Next
   * --> Te muestra unas informaciones
   * --> Next

* Seguidamente Finish.

* Esperar a que finalice Spring la creación del Proyecto


</br>



### Paso 2) Otras Configuraciones del Proyecto.
#### (Para este paso se anexan configuraciones que para el Proyecto son relevantes, capaz creando el Proyecto desde otro IDE se autoconfiguran dichas configuraciones).

</br>

### 2.1) Actualización de Java-1.7 a 1.8 (Si seleccionaste una versión Moderna de Spring no es Necesario esto)

* Vamos al pom.xml (el archivo al final de todo)

* Dentro de el tag properties donde dice java.versión cambiar la version del compiler a 1.8, ctrl+s para guardar

* Click Der sobre el Proyecto
	* --> Maven
	* --> Update Proyect
	* --> Fijate que el Proyecto este seleccionado y Boton ok

* Si cambio JavaSE-1.7 a JavaSE-1.8 se efectuo el cambio

</br>

### 2.2) Paquetes Maven (Java Resources). (Si seleccionaste una versión Moderna de Spring no es Necesario esto)

* Por Defecto Viene deshabilitada la opción de paquetes Maven, en donde vamos a guardar nuestros paquetes y clases
	* --> Para habilitar las mismas, click Der sobre el Proyecto.
	* --> Properties.
	* --> Buscamos la sección Java Build Path
	* --> Seleccionamos la casilla Maven Dependencies.
	* --> Apply and Close.
	* --> F5 y deberían aparecer (src/main/java y src/test/java)







</br>

## Sección 2) Configuración de las Dependencias y el SGDB Mysql

</br>





### Paso 3) Dependencias del Proyecto
#### (Las siguientes dependencias del Proyecto se deberán agregar al pom.xml para el correcto funcionamiento del Proyecto).


* Dependencia para el conector de Mysql.
   * --> Buscamos Mysql Connector (https://mvnrepository.com/artifact/mysql/mysql-connector-java/8.0.21)
   * --> Copias la dependencia y la incluis en el pom del proyecto

```xml
<!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.21</version>
</dependency>

```


</br>


* Dependencia para convertir Objetos Java en Objetos XML.
  * --> Buscamos javax.xml.bin, la versión 2.3.1, (https://mvnrepository.com/artifact/javax.xml.bind/jaxb-api/2.3.1)
  * --> Copias la dependencia desde Maven o de acá, luego lo incluís en el pom.xml

```xml
<!-- https://mvnrepository.com/artifact/javax.xml.bind/jaxb-api -->
<dependency>
    <groupId>javax.xml.bind</groupId>
    <artifactId>jaxb-api</artifactId>
    <version>2.3.1</version>
</dependency>

```


</br>

* Dependencia para convertir Objetos Java en Objetos JSON.
  * --> Buscamos jackson databind, la versión 2.12.4, (https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.12.4)
  * --> Copias la dependencia desde Maven o de acá, luego lo incluís en el pom.xml

```xml
<!-- https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind -->
<dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-databind</artifactId>
    <version>2.12.4</version>
</dependency>

```
* ...
   * --> Ctrl + s Guardas 
   * --> Click Der sobre el proyecto
   * --> Maven y update Maven o Alt + F5
   * --> Fijarse dentro de Maven Dependencies si Maven descargo la misma


</br>

### Paso 4) Configuraciones del SGDB Mysql.
#### (El Sistema de Gestión de Base de datos(SGDB) es un conjunto de programas que nos permiten gestionar la base de datos, es común confundirse con el Nombre, Mysql como tal no es la Base de Datos, sino un SGDB, el Motor de Mysql que he implementado es INNODB, el más común).

* Hasta acá deberías tener incluido el conector para Mysql en el pom para que se descargue la dependencia (Fijarse la Sección de dependencias).

* Abrimos la Herramienta XAMPP ( Buscate un microtutorial para usarla ), o la que se tenga, levantamos los Servicios de Mysql y Creamos una Nueva Base de Datos.
	* --> Depende que S.O tengas podrás o no tener esta herramienta, no hace falta tenerla, también es posible levantar un servicio mysql desde la bash en Linux
	* --> Una vez abierto, en el control panel inicializas los servicios de Mysql y Apache para ver las dbs desde el localhost en el Navegador
	* --> Colocas localhost... en el navegador y accedes a PHPMYADMIN o clickeas Admin desde xampp en la parte de Apache.
	* --> Vamos a crear una db, para eso en la esquina izquierda superior tocás en Nueva.
	* --> Colocas el Nombre a la derecha (en mi caso db_api_productos), dejas latin1 y luego en Crear
	* --> Vamos a Crear una sola tabla con solo 4 campos para persistir posteriormente los datos con Hibernate.
	* --> Selecciona la db creada y a la derecha te va a aparecer crear tabla, colocamos en Nombre productos, numero de columnas 4 y continuar.
	* --> Ahora creamos los campos(columnas), el primero sera id, tipo int y al final en Indice colocas primary(llave primaria).
	* --> El segundo campo será el código del Producto, colocamos codigo, tipo varchar, longitud 30.
	* --> El Tercero será nombre, colocamos nombre, varchar, 30
	* --> El úlimo será el precio, colocamos precio, float, 30
	* --> Guardar.
	* --> Si desplegamos la db, se te deberia desplegar la nueva tabla y si la seleccionas los nuevos campos creados.
	* --> Solamente creamos la db, la tabla y los 4 campos, la config de usuarios, atributos de los campos , etc, lo dejamos todo por defecto para realizar la conexion con el connector de mysql posteriormente.
	* --> Fijate de Visualizar la db creada, la tabla y los campos, continuamos..







</br>


## Sección 3) Configuración del Archivo de Propiedades(application.properties)


</br>




### Paso 5) Archivo de Propiedades(application.properties)
#### (El uso de Spring Boot properties es muy habitual cuando trabajamos con una aplicación de Spring Boot. A diferencia de otras aplicaciones clásicas de Spring Framework , Spring Boot hace uso del principio de convención sobre configuración y define un fichero por defecto de propiedades . Este fichero se encuentra en la carpeta resources (src/main/resources/application.properties) de nuestro proyecto.)

</br>

#### 5.1) Configuraciones del Server de Spring 
* Vamos a configurar el Puerto del Server y los errores HTTP
* Nos posicionamos sobre el Archivo application.properties (src/main/resources/application.properties) y copias-pegas lo siguiente

```xml
server.port = 8090
server.error.whitelabel.enabled=true

```

#### 5.2) Configuraciones de la Conexión a la Base de Datos
* Primeramente deberías haber creado la db paso a paso explcado en la sección anterior
* Configuramos la url, el usuario y contraseña
* El nombre de la URL cambia si creaste otra db. Luego del localhost tendrás que escribir el nombre completo de la db creada
* Lo mismo para el Usuario y Contraseña, por defecto siempre el user root y contraseña vacío (Pruebas Locales, no Producción).

```xml
spring.datasource.url = jdbc:mysql://localhost:3306/
```






















</br>

## Uso de Cygwin.
#### (Esta es una magnífica herramienta para trabajar con git a nivel consola desde algún IDE. Desde mi punto de vista simplifica muchísimo
la integración del Proyecto con Git).

#### 1)Descargar la herramienta en https://cygwin.com/install.html dependiendo la arquitectura que se tenga (32-64 bits)
* --> Como toda aplicacion siguiente.... siguiente....
* --> (IMPORTANTE:NO TENER ABIERTO EL IDE DURANTE LA INSTALACION, SINO NO RECONOCE EL PATH)

#### 2) Seleccionar el proyecto en Eclipse Ide para implementar git.
* --> Click Der 
* --> Show in Local Terminal
* --> Seleccionas Git Console o Terminal
* --> Si seleccionaste git console, te debería aparecer algo parecido a esto(Ruta Absoluta de tu proyecto)...
* --> andre@DESKTOP-7BN69K1 MINGW64 /c/Users/andre/OneDrive/Escritorio/LenguajesProgramacion/JAVA_AplicacionesWeb/Formu
larioMavenJSP/FormularioMaven (master)

#### 4)Creación de un Nuevo Repositorio git o usar el ya creado
* --> Debajo de esta sección, explico como usar git de forma detallada.

#### 5) Más Información https://ourcodeworld.com/articles/read/680/how-to-configure-an-integrated-terminal-command-prompt-in-netbeans-for-windows

</br>

## Subir el proyecto al repositorio con la terminal a traves de Cygwin en Eclipse
#### 1)Creamos un nuevo repositorio en GitHub.

#### 2)Inicializamos nuestro repositorio local .git desde la terminal.
* git init

#### 3)Agregamos lo desarrollado a nuestro repo local desde la terminal.
* git add *

#### 4)Agregamos lo que tenemos en nuestro repo local al área de Trabajo desde la terminal.
* git commit -m "agrega un comentario entre comillas"

#### 5)Le indicamos a git donde se va a almacenar nuestro proyecto(fijate en tu repositorio de github cual es el enlace de tu proyecto(esta en code)).
* git remote add origin https://github.com/andresWeitzel/CRUD_JSF_JPA_HIBERNATE_MAVEN_MYSQL

#### 6)Subimos nuestro proyecto.
* git push -u origin master


</br>


## Actualización de el proyecto al repositorio con la terminal a traves de Cygwin en Netbeans

#### 1)Visualizamos las modificaciones realizadas en local
* git status

#### 2)Agregamos lo modificado al area de trabajo
* git add *

#### 3)Confirmamos las modificaciones realizadas
* git commit -m "tu commit entre comillas"

#### 4)Sincronizamos y traemos todos los cambios del repositorio remoto a la rama en la que estemos trabajando actualmente.
##### (SOLO SI SE REALIZARON CAMBIOS DESDE OTRA LADO, ej: en github u/o/y un equipo de trabajo)
* git pull https://github.com/andresWeitzel/CRUD_JSF_JPA_HIBERNATE_MAVEN_MYSQL

#### 5)Enviamos todos los cambios locales al repo en github
* git push https://github.com/andresWeitzel/CRUD_JSF_JPA_HIBERNATE_MAVEN_MYSQL

#### 6) En casos extremos pisamos todo el repositorio
* git push -f --set-upstream origin master


</br>




