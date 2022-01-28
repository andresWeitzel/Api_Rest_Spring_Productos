# API REST con Spring Boot, Spring Security, Mysql , Maven , etc.

Creación de una API REST utilizando el Framework Spring Boot con el IDE Spring Tool Suite 4 junto con Maven, Mysql, JPA-Hibernate y otras Tecnologías.

### Obtención de Token con JWT

  <img src="https://github.com/andresWeitzel/Graphics/blob/master/Proyectos/ApiRestProductosSpringBoot/CRUD/obtencionToken.jpg" width="400" title="hover text">

</br> 


### Select de todos los Productos de la API con el Método GET y el Token

  <img src="https://github.com/andresWeitzel/Graphics/blob/master/Proyectos/ApiRestProductosSpringBoot/CRUD/select/selectProductos.jpg" width="400" title="hover text">

</br> 


### Select de todos los Productos de la API con Método Incorrecto

  <img src="https://github.com/andresWeitzel/Graphics/blob/master/Proyectos/ApiRestProductosSpringBoot/CRUD/select/selectProductosMetodoHttpIncorrecto.jpg" width="400" title="hover text">

</br> 



### Listado de los Productos de la API

  <img src="https://github.com/andresWeitzel/Graphics/blob/master/Proyectos/ApiRestProductosSpringBoot/CRUD/select/listadoProductos.jpg" width="400" title="hover text">

</br> 


### Listado de los Productos de la API por Paginación (Página 0 obtención 2 Productos)

  <img src="https://github.com/andresWeitzel/Graphics/blob/master/Proyectos/ApiRestProductosSpringBoot/CRUD/selectPagination/page_0_2.jpg" width="400" title="hover text">

</br> 


### Listado de los Productos de la API por Paginación (Página 0 obtención 3 Productos)

  <img src="https://github.com/andresWeitzel/Graphics/blob/master/Proyectos/ApiRestProductosSpringBoot/CRUD/selectPagination/page_0_3.jpg" width="400" title="hover text">

</br> 


### Listado de los Productos de la API por Paginación (Página 0 obtención 4 Productos)

  <img src="https://github.com/andresWeitzel/Graphics/blob/master/Proyectos/ApiRestProductosSpringBoot/CRUD/selectPagination/page_0_4.jpg" width="400" title="hover text">

</br> 



### Listado de los Productos de la API por Paginación (Página 1 obtención 2 Productos)

  <img src="https://github.com/andresWeitzel/Graphics/blob/master/Proyectos/ApiRestProductosSpringBoot/CRUD/selectPagination/page_1_2.jpg" width="400" title="hover text">

</br> 




### Listado de los Productos de la API por Paginación (Página 1 obtención 4 Productos)

  <img src="https://github.com/andresWeitzel/Graphics/blob/master/Proyectos/ApiRestProductosSpringBoot/CRUD/selectPagination/page_1_4.jpg" width="400" title="hover text">

</br> 





</br>

### Tecnologías Implementadas

| **Tecnologías** | **Versión** | **Finalidad** |               
| ------------- | ------------- | ------------- |
| Java |   12.0.2 | JDK |
| Spring Tool Suite 4 | 4.9.0  | IDE |
| Spring Boot |   2.5.4  | Framework |
| Spring Security | 5.6.1 | Servicios de Seguridad |
| JSON Web Token | 0.9.1 | Creación de tokens de acceso | 
| Maven |  4.0.0 | Gestor de Proyectos |
| JPA-Hibernate | 5.4.27 | Framework para el mapeo de objetos y persistenciua en la db |
| PostMan | 9.4.1 | Test de Apis |
| XAMPP | 3.2.2  | Paquete de Servidores |
| Mysql | 10.1.38 | Sistema de Gestión de Bases de Datos |
| GNU bash / Terminal | 4.4.23  | Bash / Terminal para el manejo e implementación de Git integrado al IDE Eclipse |
| Git | 2.29.1  | Control de Versiones |


</br>

### Descarga y Documentacion de las Tecnologías Implementadas

| **Tecnología**  | **Descarga** | **Documentación** |               
| ------------- | ------------- | ------------- |
| Java-JDK 12 | https://www.oracle.com/java/technologies/javase/jdk12-archive-downloads.html |  https://docs.oracle.com/en/ |
| Spring Tool Suite 4 |https://spring.io/tools | https://spring.io/guides |
| Spring Security | https://spring.io/projects/spring-security | https://spring.io/projects/spring-security | 
| JSON Web Security | https://jwt.io/introduction/ | https://jwt.io/introduction/
| XAMPP | https://www.apachefriends.org/download.html | https://community.apachefriends.org/f/ |
| Maven Repository | - | https://mvnrepository.com/ | 
| PostMan | https://www.postman.com/downloads/ | https://www.postman.com/product/what-is-postman/ |
| Git  | https://git-scm.com/downloads |  https://git-scm.com/docs |

</br>

### Patrones de Diseño Implementados

| **Patrón de Diseño** | **Finalidad** |               
| ------------- | ------------- |
| DAO | Uso de interfaces entre la aplicación y el almacenamiento de datos. |
| MVC | Separación y Representación de los Datos, Manejo de errores, Escalabilidad, etc  |

</br>

### Dependencias Implementadas

| **Dependencia Maven**  | **Versión** | **Finalidad** |               
| ------------- | ------------- | ------------- |
| mysql-connector | 8.0.21 |  Conexión e Implementación de Queries a la db con Mysql |
| Hibernate-Core | 5.4.27 | El Core de Hibernate |
| JPA-Hibernate | 2.1 | Persistencia de datos a la db |
| Spring-data-jpa | 2.6.1 | Api de JpaRepository para el manejo de métodos | 
| Spring-boot-starter-security | 2.6.2 | Api se Spring Security para la Seguridad de la Aplicación | 
| Spring Security | 5.6.1 | Servicios de Seguridad |
| Javax Annotation API | 1.3.2 | Api para la lectura de Annotation |
| javax.xml.bind | 2.3.1 |  Dependencia para convertir Objetos Java en Objetos XML |
| jackson-databind | 2.12.4 |  Dependencia para convertir Objetos Java en Objetos JSON |
| JSON Web Token | 0.9.1 | Creación de tokens de acceso | 


</br>

### Descarga de Dependencias

* Repositorio dependencia mysql : https://mvnrepository.com/artifact/mysql/mysql-connector-java/8.0.21
* Repositorio dependencia Javax Annotation API: https://mvnrepository.com/artifact/javax.annotation/javax.annotation-api/1.3.2
* Repositorio dependencia Hibernate-Core: https://search.maven.org/artifact/org.hibernate/hibernate-core/5.4.27.Final/jar
* Repositorio dependencia JPA-Hibernate: https://mvnrepository.com/artifact/org.hibernate.javax.persistence/hibernate-jpa-2.1-api/1.0.2.Final
* Repositorio dependencia Spring data JpaRepository: https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-data-jpa/2.6.1
* Repositorio Spring-boot-starter-security: https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-security/2.6.2
* Repositorio dependencia javax.xml.bind : https://mvnrepository.com/artifact/javax.xml.bind/jaxb-api
* Repositorio dependencia jackson-databind :  https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind 
* Repositorio dependencia spring-security : https://mvnrepository.com/artifact/org.springframework.security/spring-security-core
* Repositorio dependencia json web tokens : https://mvnrepository.com/artifact/io.jsonwebtoken/jjwt/0.9.1



<hr>

## ` Documentación y Guía del Proyecto `
#### (Esta Documentación que Desarrollé es para la Creación y Configuración del Proyecto desde Cero, Manejo y Dependencias de Maven, Spring Tool Suite, Spring Booot, Hibernate-JPA, Mysql, Servidor de Despliegue y otros usos. Recomiendo Leerla y Realizar todo paso a paso como se indica en la misma).

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



#### Sección 4) Creación y Configuración de las Clases Entidades y Clases Modelos
  
   - [Paso 6) Creación y Configuración de la Clase-Entidad Producto](#paso-6-creación-y-configuración-de-la-clase-entidad-producto)
   
   - [Paso 7) Creación y Configuración de la Clase-Modelo Producto](#paso-7-creación-y-configuración-de-la-clase-modelo-producto)
  
  
  
  
#### Sección 5) Creación y Configuración de las Interfaces repositories y Convertidores de Clases  

   - [Paso 8) Creación y Configuración de la Interfaz-Repository Producto](#paso-8-creación-y-configuración-de-la-interfaz-repository-producto)


   - [Paso 9) Creación y Configuración de la Clase Converter](#paso-9-creación-y-configuración-de-la-clase-converter)




#### Sección 6) Creación y Configuración de los Services y Controladores

   - [Paso 10) Creación y Configuración de la Clase Service](#paso-10-creación-y-configuración-de-la-clase-service)
   
   - [Paso 11) Creación y Configuración de la Clase Controler](#paso-11-creación-y-configuración-de-la-clase-controler) 




#### Sección 7) Creación, Configuración y Prueba de SpringSecurity y Json Web Tokens


   - [Paso 12) Creación y Configuración de la Clase Usuario](#paso-12-creación-y-configuración-de-la-clase-usuario)

   - [Paso 13) Creación y Configuración de la Interfaz I_UsuarioRepository](#paso-13-creación-y-configuración-de-la-interfaz-i_usuarioRepository)

   - [Paso 14) Creación y Configuración del Servicio UsuarioService](#paso-14-creación-y-configuración-del-servicio-usuarioservice)

   - [Paso 15) Creación y Configuración de la Clase de Configuración UsuarioConfiguration](#paso-15-creación-y-configuración-de-la-clase-de-configuracion-usuarioconfiguration)

   - [Paso 16) Creación y Configuración de la Clase de Configuración JwtUtilConfiguration](#paso-16-creación-y-configuración-de-la-clase-de-configuracion-jwtutilconfiguration)

   
   - [Paso 17) Creación y Configuración de la Clase de Configuración JwtFilterConfiguration](#paso-17-creación-y-configuración-de-la-clase-de-configuracion-jwtfilterconfiguration)


   - [Paso 18) Creación y Configuración de la Clase de Configuración LoginFilterConfiguration](#paso-17-creación-y-configuración-de-la-clase-de-configuracion-loginfilterconfiguration)


   - [Paso 19) Creación y Configuración de la Clase de Configuración WebSecurity](#paso-18-creación-y-configuración-de-la-clase-de-configuracion-websecurity)

 
  - [Paso 20) Test de Spring Security y JWT](#paso-20-test-de-spring-security-y-jwt)





#### Sección 8) Apéndice

- [ Anotaciones Usadas para JPA](#anotaciones-usadas-para-jpa)
 
- [ Anotaciones Usadas para Spring](#anotaciones-usadas-para-spring)




</br>

## Sección 1) Creación del Proyecto y Configuraciones

</br>


### Paso 1) Creación de un Proyecto Spring Boot con Maven en Spring Tool Suite 4 y Configuraciones Iniciales.
#### (Primeramente deberás configurar tu espacio de trabajo, en donde se alojará la aplicación. Cada vez que muevas el Proyecto de Directorio, recomiendo crear o setear nuevamente el Espacio de Trabajo).


* Una vez abierto Spring Tool Suite 4
  	* --> Seleccionas la Pestaña `File` 
   	* --> New 
   	* --> Spring Starter Proyect (Si no aparece buscar en Other).

* Se abrirá una Interfaz Gráfica, por defecto dejar marcado lo siguiente con los siguientes valores por defecto
   	 * --> Service Url : https://start.spring.io
   	 * --> Use default location por defecto (es la ruta absoluta de tu workspace)
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

#### 2.1) Actualización de Java-1.7 a 1.8 (Si seleccionaste una versión Moderna de Spring no es Necesario esto)

* Vamos al `pom.xml` (el archivo al final de todo)

* Dentro de el tag `properties` donde dice java.versión cambiar la version del compiler a 1.8, ctrl+s para guardar

* Click Derecho sobre el Proyecto
	* --> Maven
	* --> Update Proyect
	* --> Fijate que el Proyecto este seleccionado y Boton ok

* Si cambio JavaSE-1.7 a JavaSE-1.8 se efectuo el cambio

</br>

#### 2.2) Paquetes Maven `(Java Resources)`. (Si seleccionaste una versión Moderna de Spring no es Necesario esto)

* Por Defecto Viene deshabilitada la opción de paquetes Maven, en donde vamos a guardar nuestros paquetes y clases
	* --> Para habilitar las mismas, click Der sobre el Proyecto.
	* --> Properties.
	* --> Buscamos la sección `Java Build Path`
	* --> Seleccionamos la casilla `Maven Dependencies`.
	* --> Apply and Close.
	* --> F5 y deberían aparecer `src/main/java` y `src/test/java`







</br>

## Sección 2) Configuración de las Dependencias y el SGDB Mysql

</br>





### Paso 3) Dependencias del Proyecto
#### (Las siguientes dependencias del Proyecto se deberán agregar al pom.xml para el correcto funcionamiento del Proyecto).

#### 3.1) Dependencia para el conector de Mysql.
* Buscamos la dependencia Mysql Connector (https://mvnrepository.com/artifact/mysql/mysql-connector-java/8.0.21)
* Copias la Dependencia desde Maven o desde acá y la incluis en el `pom.xml`

```xml
<!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.21</version>
</dependency>

```

</br>

#### 3.2) Dependencia para `JPA-HIBERNATE `
#### (Persistenca de Datos en la db, de esto se encarga Spring).

* La Primera será el core de Hibernate, hibernate-core la 5.4... Final (https://search.maven.org/artifact/org.hibernate/hibernate-core/5.4.27.Final/jar).

```xml
<dependency>
  <groupId>org.hibernate</groupId>
  <artifactId>hibernate-core</artifactId>
  <version>5.4.27.Final</version>
</dependency>
```
* ...

* La segunda será JPA para Hibernate, la más importante, ya que nos desacoplamos de depender de Hibernate en un futuro, y nos centramos en trabajar con JPA, la dependencia es JPA-Hibernate 2.1 (https://mvnrepository.com/artifact/org.hibernate.javax.persistence/hibernate-jpa-2.1-api/1.0.2.Final).

```xml
<!-- https://mvnrepository.com/artifact/org.hibernate.javax.persistence/hibernate-jpa-2.1-api -->
<dependency>
    <groupId>org.hibernate.javax.persistence</groupId>
    <artifactId>hibernate-jpa-2.1-api</artifactId>
    <version>1.0.2.Final</version>
</dependency>

```
* ...
 
* La Tercera dependencia será para las Lecturas de las Anotaciones para JPA-Hibernate, Javax Annotation API (https://mvnrepository.com/artifact/javax.annotation/javax.annotation-api/1.3.2)

```xml
<!-- https://mvnrepository.com/artifact/javax.annotation/javax.annotation-api -->
<dependency>
    <groupId>javax.annotation</groupId>
    <artifactId>javax.annotation-api</artifactId>
    <version>1.3.2</version>
</dependency>
```


</br>


#### 3.3) Dependencia para convertir Objetos Java en Objetos XML.

* Buscamos javax.xml.bin, la versión 2.3.1, (https://mvnrepository.com/artifact/javax.xml.bind/jaxb-api/2.3.1)
* Copias la Dependencia desde Maven o desde acá y la incluis en el pom.xml

```xml
<!-- https://mvnrepository.com/artifact/javax.xml.bind/jaxb-api -->
<dependency>
    <groupId>javax.xml.bind</groupId>
    <artifactId>jaxb-api</artifactId>
    <version>2.3.1</version>
</dependency>

```

</br>

#### 3.4) Dependencia para el Uso de los métodos de `JpaRepository`
#### (Usaremos la api de Spring Data Jpa ya que nos va a ahorrar desarrollar los métodos que realicen las consultas sql a la db, creando menos cantidad de código ).

* Buscamos la dependencia (https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-data-jpa/2.6.1)
* Código de la Dependencia
```xml
<!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-data-jpa -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
    <version>2.6.1</version>
</dependency>

```


</br>

#### 3.5) Dependencia para convertir Objetos Java en Objetos JSON.

* Buscamos jackson databind, la versión 2.12.4, (https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.12.4)
* Copias la dependencia desde Maven o de acá, luego lo incluís en el pom.xml

```xml
<!-- https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind -->
<dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-databind</artifactId>
    <version>2.12.4</version>
</dependency>

```

</br>

#### 3.6) Dependencia para la Seguridad de la aplicación con Spring Security.

* Como siempre ,en MavenRepository, buscamos Spring Security Core, versión 5.6.1 (https://mvnrepository.com/artifact/org.springframework.security/spring-security-core/5.6.1)
* Copias la dependencia desde Maven o desde acá, luego lo incluis en el pom.xml

```xml
<!-- https://mvnrepository.com/artifact/org.springframework.security/spring-security-core -->
<dependency>
    <groupId>org.springframework.security</groupId>
    <artifactId>spring-security-core</artifactId>
    <version>5.6.1</version>
</dependency>


```

</br>

* La segunda dependencia será para la API de Spring Security, Spring boot starter security 2.6.2 (https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-security/2.6.2)
* Incluis la dependeencia dentro del pom.xml

```xml
<!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-security -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-security</artifactId>
    <version>2.6.2</version>
</dependency>


```

</br>

#### 3.7) Dependencia para los tokens de la aplicación y autenticación con JSON .

* Buscamos JJWT, versión 0.9.1 (https://mvnrepository.com/artifact/io.jsonwebtoken/jjwt/0.9.1)
* Copias la dependencia desde Maven o desde acá, luego lo incluis en el pom.xml

```xml

<!-- https://mvnrepository.com/artifact/io.jsonwebtoken/jjwt -->
<dependency>
    <groupId>io.jsonwebtoken</groupId>
    <artifactId>jjwt</artifactId>
    <version>0.9.1</version>
</dependency>



```

* ...
* Ctrl + s Guardas 
* Click Der sobre el proyecto
* Maven y update Maven o Alt + F5
* Fijarse dentro de Maven Dependencies si Maven descargo las mismas
 




</br>

### Paso 4) Configuraciones del SGDB Mysql.
#### (El Sistema de Gestión de Base de datos(SGDB) es un conjunto de programas que nos permiten gestionar la base de datos, es común confundirse con el Nombre, Mysql como tal no es la Base de Datos, sino un SGDB, el Motor de Mysql que he implementado es INNODB, el más común).

* Hasta acá deberías tener incluido el `conector` para Mysql en el `pom` para que se descargue la dependencia (Fijarse la Sección de dependencias).

* Abrimos la Herramienta `XAMPP` ( Buscate un microtutorial para usarla ), o la que se tenga, levantamos los Servicios de Mysql y Creamos una Nueva Base de Datos.
	* --> Depende que S.O tengas podrás o no tener esta herramienta, no hace falta tenerla, también es posible levantar un servicio mysql desde la bash en Linux
	* --> Una vez abierto, en el control panel inicializas los servicios de Mysql y Apache para ver las dbs desde el localhost en el Navegador
	* --> Colocas localhost... en el navegador y accedes a `PHPMYADMIN` o clickeas Admin desde xampp en la parte de Apache.
	* --> Vamos a crear una db, para eso en la esquina izquierda superior tocás en Nueva.
	* --> Colocas el Nombre a la derecha (en mi caso `db_api_productos`), dejas latin1 y luego en Crear
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


## Sección 3) Configuración del Archivo de Propiedades `(application.properties)`


</br>




### Paso 5) Archivo de Propiedades `(application.properties)`
#### (El uso de Spring Boot properties es muy habitual cuando trabajamos con una aplicación de Spring Boot. A diferencia de otras aplicaciones clásicas de Spring Framework , Spring Boot hace uso del principio de convención sobre configuración y define un fichero por defecto de propiedades . Este fichero se encuentra en la carpeta resources (src/main/resources/application.properties) de nuestro proyecto.)

</br>

#### 5.1) Configuraciones del Server de Spring 
* Vamos a configurar el Puerto del Server y los errores HTTP
* Nos posicionamos sobre el Archivo application.properties (src/main/resources/application.properties) y copias-pegas lo siguiente

```xml
server.port = 8092
server.error.whitelabel.enabled=true
```

#### 5.2) Configuraciones de la Conexión a la Base de Datos
* Primeramente deberías haber creado la db paso a paso explicado en la sección anterior.
* Configuramos la url, el usuario y contraseña
* El nombre de la URL cambia si creaste otra db. Luego del localhost tendrás que escribir el nombre completo de la db creada
* Lo mismo para el Usuario y Contraseña, por defecto siempre el user root y contraseña vacío (Pruebas Locales, no Producción).

```xml
spring.datasource.url = jdbc:mysql://localhost:3306/db_api_productos?serverTimezone=UTC
spring.datasource.username = root
spring.datasource.password = 
```

#### 5.3) Configuraciones de JPA-Hibernate
* No es requerimiento saber hibernate pero si lo recomiendo para entender como se produce la persistencia de los datos en la db, la simplificación de tiempo y codificación que demanda jdbc puro en relación a este Framework, etc.
* Vamos a declarar las siguientes propiedades.
* jpa.show-sql es para que se muestren las sentencias por consola
* jpa.hibernate.ddl-auto es para la la actualización o creación de la db en cada actualización del proyecto. Si lo declaramos update actualiza la db o create  la crea con todas sus tablas y campos.
* jpa.hibernate.naming.strategy es la estrategia de nomenclatura que usa Hibernate
* jpa.properties.hibernate.dialect es la asignación del tipo de Base de Datos que vamos a utilizar 

```xml
spring.jpa.show-sql = true
spring.jpa.hibernate.ddl-auto = update
spring.jpa.hibernate.naming.strategy = org.hibernate.cfg.ImprovedNamingStrategy
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5Dialect
```

* Código Completo del application.properties


```xml
server.port = 8092
server.error.whitelabel.enabled=true

spring.datasource.url = jdbc:mysql://localhost:3306/db_api_productos?serverTimezone=UTC
spring.datasource.username = root
spring.datasource.password = 


spring.jpa.show-sql = true
spring.jpa.hibernate.ddl-auto = update
spring.jpa.hibernate.naming.strategy = org.hibernate.cfg.ImprovedNamingStrategy
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5Dialect

```

* ...
   * --> Ctrl + s Guardas 
   * --> Click Der sobre el proyecto
   * --> Maven y update Maven o Alt + F5
   * --> Fijarse dentro de Maven Dependencies si Maven descargo la misma





</br>

## Sección 4) Creación y Configuración de las Clases Entidades y Clases Modelos

</br>





### Paso 6) Creación y Configuración de la Clase-Entidad Producto
#### ( Existen 2 Conceptualizaciones en este caso. La primera es que a una Clase se le llame Entidad-Modelo y la otra que exista la misma Clase definida como Modelo y Entidad (osea 2 clases casi identicas). Varios prefieren usar la primera o la segunda dependiendo cúal sea la finalidad (ahorrar tiempo de código, modularizar el código o lo que sea). Yo opté por la segunda ya que si bien es verdad que se tiene que generar más código, cuando el mismo crezca los problemas van a tener un alcance más controlado).
#### ( Las Entidades se trabajan en los Repositorios y los Modelos en los Controladores o Service )

</br>

#### 6.1) Creación de la Clase `ProductoEntidad`

* Creamos un paquete llamado mypackages.entities dentro de com.api.productos (src/main/java/com.api.productos). Es importante que este dentro del mismo ya que sino Spring no desplegará la app de forma correcta.
	* --> Click Der sobre la ruta mencionada  
	* --> New --> Package
	* --> En Name seguido de com.api.productos colocamos mypackages.entities (com.api.productos.mypackages.entities)
	* --> Finish

* Creamos la Clase-Entidad Producto
 	* --> Click Der sobre el paquete creado
 	* --> New --> Class
 	* --> Siempre asegurarse la ruta de creación a través del Source Folder y Package
 	* --> En Name colocamos Producto
 	* --> Finish

```java

package com.api.productos.mypackages.entities;

public class Producto {

}
 
```

</br>

#### 6.1) Configuración de la Clase  `ProductoEntidad`

* Primeramente vamos a implementar la Clase Serializable dentro de la Clase Producto Creada, el proceso de serialización es la conversión de los objetos java en flujos de bytes(código binario para la correcta transferencia de datos).

```java


package com.api.productos.mypackages.entities;

import java.io.Serializable;

public class Producto implments Serializable{

}

```


* Creamos los atributos o campos de la Clase que a su vez serán los campos de la db 

```java

package com.api.productos.mypackages.entities;

import java.io.Serializable;

public class Producto implments Serializable{

	
	private int id;
	
	private String codigo;
	
	private String nombre;
	
	private String precio;
	
}

 
```

* Creamos los getters, setters, toString y contructores(sin/con parametros)


```java

package com.api.productos.mypackages.entities;

import java.io.Serializable;

public class Producto implments Serializable{
	

	private int id;

	private String codigo;
	
	private String nombre;
	
	private String precio;
	
	
	public Producto() {
	}
	

	public Producto(String codigo, String nombre, String precio) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}
	

	public Producto(int id, String codigo, String nombre, String precio) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}





	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}
	
	
	

	@Override
	public String toString() {
		return "Producto [id=" + id + ", codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	

}


```

* Vamos a hacer uso de las Anotaciones para que Spring use JPA-Hibernate para mapear y persistir los datos en la db.
* Con la anotación `@Table(name="nombreDeLaClaseOpcional")` le indicamos que la Clase hace Referencia a la tabla de la db.
* Con la anotación `@Entity` declarada en cada Clase indicándole a Spring que es una Entidad.
* Con la anotación `@GeneratedValue(strategy = GenerationType.IDENTITY)` en el campo id se indica el auto_increment
* Con la anotación `@Id` le indicamos que es el campo id de la db.
* Con la anotación `@Column(name="nombreDelCampoDeLaClase")` le indicamos que es un campo de la Clase.
* Código Completo Clase Producto..

```java 
package com.api.productos.mypackages.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="productos")
@Entity
public class Producto implements Serializable{
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name="id")
	private int id;

	@Column(name="codigo")
	private String codigo;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="precio")
	private String precio;
	
	
	
	
	
	public Producto() {
	}
	

	public Producto(String codigo, String nombre, String precio) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	} 
	

	public Producto(int id, String codigo, String nombre, String precio) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}





	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}
	
	
	

	@Override
	public String toString() {
		return "Producto [id=" + id + ", codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	

}



```

 </br>

### Paso 7) Creación y Configuración de la Clase-Modelo Producto
#### ( Existen 2 Conceptualizaciones en este caso. La primera es que a una Clase se le llame Entidad-Modelo y la otra que exista la misma Clase definida como Modelo y Entidad (osea 2 clases casi identicas). Varios prefieren usar la primera o la segunda dependiendo cúal sea la finalidad (ahorrar tiempo de código, modularizar el código o lo que sea). Yo opté por la segunda ya que si bien es verdad que se tiene que generar más código, cuando el mismo crezca los problemas van a tener un alcance más controlado).
#### ( Las Entidades se trabajan en los Repositorios y los Modelos en los Controladores o Service )


</br>

#### 7.1) Creación de la Clase `ProductoModel`

* Creamos un paquete llamado mypackages.models dentro de com.api.productos (src/main/java/com.api.productos). Es importante que este dentro del mismo ya que sino Spring no desplegará la app de forma correcta.
	* --> Click Der sobre la ruta mencionada  
	* --> New --> Package
	* --> En Name seguido de com.api.productos colocamos mypackages.models (com.api.productos.mypackages.models)
	* --> Finish

* Creamos la Clase-Modelo Producto
 	* --> Click Der sobre el paquete creado
 	* --> New --> Class
 	* --> Siempre asegurarse la ruta de creación a través del Source Folder y Package
 	* --> En Name colocamos ProductoModel
 	* --> Finish


```java
package com.api.productos.mypackages.models;

public class ProductoModel {

}

```


</br>

#### 7.2) Configuración de la Clase `ProductoModel`

* Vamos a copiar todo de la clase-entidad Producto ya creada excluyendo las anotaciones 
* La conversión de una entidad a modelo lo podemos hacer instanciando un objeto de la clase entidad a través de la clase modelo
* Crearemos un constructor dentro de la clase ProductoModel que instancie dicho objeto de la clase entidad Producto
* Códido Constructor

```java
	/*
		 * @version 1.0
		 * 
		 * Instancia de la clase-entidad Producto
		 * @param producto
		 * */
		public ProductoModel(Producto producto) {
			this.id = producto.getId();
			this.nombre = producto.getNombre();
			this.codigo = producto.getCodigo();
			this.precio = producto.getPrecio();
			
		}

```

* Código Completo

```java
package com.api.productos.mypackages.models;

import com.api.productos.mypackages.entities.Producto;

public class ProductoModel {

	
		private int id;

		private String codigo;
		
		private String nombre;
		
		private String precio;
		
		
		public ProductoModel() {
		}
		

		public ProductoModel(String codigo, String nombre, String precio) {
			super();
			this.codigo = codigo;
			this.nombre = nombre;
			this.precio = precio;
		} 
		

		public ProductoModel(int id, String codigo, String nombre, String precio) {
			super();
			this.id = id;
			this.codigo = codigo;
			this.nombre = nombre;
			this.precio = precio;
		}
		
		/*
		 * @version 1.0
		 * 
		 * Instancia de la clase-entidad Producto
		 * @param producto
		 * */
		public ProductoModel(Producto producto) {
			this.id = producto.getId();
			this.nombre = producto.getNombre();
			this.codigo = producto.getCodigo();
			this.precio = producto.getPrecio();
			
		}




		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getCodigo() {
			return codigo;
		}

		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getPrecio() {
			return precio;
		}

		public void setPrecio(String precio) {
			this.precio = precio;
		}
		
		
		

		@Override
		public String toString() {
			return "Producto [id=" + id + ", codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + "]";
		}
		

	}





```

</br>

## Sección 5) Creación y Configuración de las Interfaces repositories y Controladores  


</br>

 ### Paso 8) Creación y Configuración de la Interfaz-Repository Producto
 #### (Vamos a trabajar con el Patrón de Diseño DAO para la persistencia de los datos en la db. Al fin y al cabo la arquitectura dao nos suministra las interfaces para poder usar los métodos CRUD sin necesidad de duplicar código. Las interfaces diseñadas van a contener los métodos CRUD sin necesidad de implementarlos y definir su cuerpo en una clase repository ya que vamos a implementar Spring Data JpaRepository. Esta API trae todos los métodos desarrollados )

</br>


#### 8.1) Creación de la Interfaz `I_ProductoRepository`
* Primeramente vamos a crear el paquete que alojarán las interfaces repositories con los métodos CRUD.
* Creamos un paquete llamado mypackages.repositories.repositories.interfaces dentro de com.api.productos (src/main/java/com.api.productos). Es importante que este dentro del mismo ya que sino Spring no desplegará la app de forma correcta.
	* --> Click Der sobre la ruta mencionada  
	* --> New --> Package
	* --> En Name seguido de com.api.productos colocamos mypackages.repositories.interfaces (com.api.productos.mypackages.repositories.interfaces)
	* --> Finish

* Creamos la Interfaz I_ProductoRepository 
 	* --> Click Der sobre el paquete creado
 	* --> New --> Interface
 	* --> Siempre asegurarse la ruta de creación a través del Source Folder y Package
 	* --> En Name colocamos I_ProductoRepository
 	* --> Finish

```java

package com.api.productos.mypackages.interfaces;

public interface I_ProductoRepository {

}


```
</br>


#### 8.2) Configuración de la Interfaz `I_ProductoRepository`
#### (Vamos a trabajar con los repositorios de datos de Spring, estos nos van a ayudar a simplificar de forma significativa el código desarrollado).

</br>

* Vamos a crear métodos abstractos usando la serialización de Spring (conversión de objetos Java a bytes).
* Recordar que los métodos abstractos son métodos que no tienen cuerpo, justamente por que ya está definido dentro de Spring Boot. Estos métodos vienen en las clases que Spring descarga cuando se declara la dependencia de spring-data-jpa dentro del pom.
* Recomiendo la siguiente documentación `https://docs.spring.io/spring-data/data-commons/docs/1.6.1.RELEASE/reference/html/repositories.html`
* Para poder declarar la serialización de dichos objetos hay que heredar esta cualidad de jpa-repository  `JpaRepository<"entidadSinComas", Serializable>`
* Además vamos a declarar una anotación diciendole a Spring Boot que será un repositorio con la anotación `@Repository("nombreSinComillas")`
* Código Snippet...
```java
package com.api.productos.mypackages.repositories.interfaces;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.api.productos.mypackages.entities.Producto;


@Repository("I_ProductoRepository")
public interface I_ProductoRepository extends JpaRepository<Producto, Serializable>{


	
}


```
* Seguido de esto vamos a definir los métodos a utilizar
* El primer método será para traer el producto por el id pedido.
```java

public abstract Producto findById(int id);

```
* El Segundo método será para traer el producto requerido a través del código pasado.
```java

public abstract Producto findByCodigo(String codigo);

```
* El tercer, cuarto  método serán listas, ya que los nombres y precios pueden ser repetidos 
```java

public abstract List<Producto> findByNombre(String nombre);

public abstract List<Producto> findByPrecio(double precio);

```
* Vamos a trabajar con paginación, por ende mantenemos todos los métodos como List y no ArrayList
* Para el Quinto vamos a trabajar con Paginación 
* La Paginación es necesaria para evitar que la consulta a la API se sobrecargue, causando un timeout al utilizar la solicitud dada. Para todos los servicios que devuelven grandes cantidades de datos, siempre se debe utilizar la paginación para devolver los registros.
* La Interfaz I_ProductoRepository va a heredar la paginación de una clase y esta se debera serializar (transformar el objeto java en flujos de bytes para enviarlos).
* Dentro de la interfaz mencionada vamos a heredar de la clase PaginAndSortingRepository<Producto,Serializable>
* Código Snippet..

```java
@Repository("I_ProductoRepository")
public interface I_ProductoRepository extends JpaRepository<Producto, Serializable>, PagingAndSortingRepository<Producto,Serializable>{

...

}

```
* Dentro de esta interfaz vamos a crear otro Método sobrecargado llamado `findAll` que será `Page` de tipo Producto, este método se le pasará como parametro un objeto de tipo `Pageable`....bue...osea que es un objeto paginado, a su vez este método se implemenatrá a traves de JPA-Hibernate (Recordar que las convenciones de nombres en la interfaz implementando este Framework hay que respetarlas, sino surgiran errores a la larga). 
* ATENTI que clase se importe, para este caso, todo de `org.springframework.data.domain`
* Código Snippet..

```java
public abstract Page<Producto> findAll(Pageable pageable);

	
```
* Código Completo..

```java
package com.api.productos.mypackages.repositories.interfaces;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.api.productos.mypackages.entities.Producto;


@Repository("I_ProductoRepository")
public interface I_ProductoRepository extends JpaRepository<Producto, Serializable>, PagingAndSortingRepository<Producto, Serializable>{

//Hay Métodos que JPA ya los tiene desarrollados, se pueden crear para tener
//una manipulación más especifica a la hora de usarlos en el service	

public abstract Producto findById(int id);

public abstract Producto findByCodigo(String codigo);

public abstract List<Producto> findByNombre(String nombre);

public abstract List<Producto> findByPrecio(double precio);

public abstract Page<Producto> findAll(Pageable pageable);
	
	
}


```

</br>


### 8.3) Configuración de la Paginación en el `application.properties`

* Copiar las siguientes propiedades y pegarlas en el `application.properties`

```xml
spring.data.rest.page-param-name=page
spring.data.rest.sort-param-name=sort
spring.data.rest.limit-param-name=limit
spring.data.rest.default-page-size = 5
spring.data.rest.max-page-size = 20

```
* La primera propiedad hace referencia al nombre del primer parametro de la paginación
* La segunda propiedad spring ordena la consulta
* Con la tercera establecemos un limite de registros por paginación
* La Cuarta Propiedad indicamos la cantidad de páginaciones por defecto
* La Quinta la cantidad máxima de paginaciones

</br>




 ### Paso 9) Creación y Configuración de la Clase Converter 
 #### ( Además de implementar el patrón de diseño DAO para el manejo de los datos en la db, se implementa el patrón MVC. En este caso desarrollando una Clase Converter vamos a poder convertir las entidades en modelos, y de esa forma poder trabajar con Hibernate en la Clase Modelo y no en la Clase Entidad )

</br>

#### 9.1) Creación de la Clase `ProductoConverter`
* Primeramente vamos a crear el paquete que alojarán las clases Converter.
* Creamos un paquete llamado mypackages.converters dentro de com.api.productos (src/main/java/com.api.productos). Es importante que este dentro del mismo ya que sino Spring no desplegará la app de forma correcta.
	* --> Click Der sobre la ruta mencionada  
	* --> New --> Package
	* --> En Name seguido de com.api.productos colocamos mypackages.converters (com.api.productos.mypackages.converters)
	* --> Finish

* Creamos la Clase Converter
 	* --> Click Der sobre el paquete creado
 	* --> New --> Clase
 	* --> Siempre asegurarse la ruta de creación a través del Source Folder y Package
 	* --> En Name colocamos ProductoConverter
 	* --> Finish



```java
package com.api.productos.mypackages.converters;

public class ProductoConverter {

}



```

</br>

#### 9.2) Configuración de la Clase `ProductoConverter`
* Primeramente vamos a incluir la anotación `@Component("ProductoComponent")`.
* La anotación `@Component` marca la clase Java como un bean o componente para que el mecaniso de exploración de componentes de Spring pueda agregarla al contexto de la aplicación.
* Seguidamente vamos a construir el cuerpo de la clase con los métodos que modelizaremos para la conversión de entidades a modelos.
* Código Snippet..
```java

package com.api.productos.mypackages.converters;

import org.springframework.stereotype.Component;

@Component("ProductoConverter")
public class ProductoConverter {

}

```



</br>


#### 9.2.1) Creación del Método `convertirListaProducto` de tipo `List`
#### (Este Método se va a encargar de convertir una lista de tipo Producto Entidad a otra de Tipo Producto Modelo. Para este caso voy a utilizar una lista de tipo List porque al momento ded trabajar con paginación es más fácil su uso. Es evidente que se podría usar ArrayList ya que es mucho más eficiente que una List cuando se realizan muchos accesos pero me trajo algunos inconvenientes ya que las clases que se implementan en la paginación no son tan modernas)

</br>

* El Método es de tipo Lista, se le pasa una Lista de Productos de tipo Producto Entidad y nos devuelve una Lista de Tipo Modelo Producto.
* Pero para realizar tal conversión se usará un for each, el for each va a convertir todos los objetos de la lista Entidad a una lista de objetos de la clase Modelo.
* Código Snippet..

```java
	
	public List<ProductoModel> convertirListaProducto(List<Producto> list){
		
		List<ProductoModel> listaModeloProductos = new ArrayList<>();
	
		
		list.forEach(objetoProducto -> listaModeloProductos.add(new ProductoModel(objetoProducto)));
		
		return listaModeloProductos;
	
	}

```




</br>



## Sección 6) Creación y Configuración de los Services



</br>

 ### Paso 10) Creación y Configuración de la Clase Service
 #### (La Clase Service (Componente de Servicio) nos va a permitir gestionar la lógica empresarial en una capa diferente. )

</br>

#### Paso 10.1) Creación de la Clase `ProductoService`
* Primeramente vamos a crear el paquete que alojará el Service.
* Creamos un paquete llamado mypackages.service dentro de com.api.productos (src/main/java/com.api.productos). Es importante que este dentro del mismo ya que sino Spring no desplegará la app de forma correcta.
	* --> Click Der sobre la ruta mencionada  
	* --> New --> Package
	* --> En Name seguido de com.api.productos colocamos mypackages.service (com.api.productos.mypackages.service)
	* --> Finish

* Creamos la Clase Service
 	* --> Click Der sobre el paquete creado
 	* --> New --> Clase
 	* --> Siempre asegurarse la ruta de creación a través del Source Folder y Package
 	* --> En Name colocamos ProductoService
 	* --> Finish
* Código Snippet..



```java
package com.api.productos.mypackages.service;

public class ProductoService {

}

```

</br>



#### Paso 10.2) Configuración de la Clase `ProductoService`
* En esta Clase Service se implementará Inyección de Dependencias, esta nos permite relacionar objetos. Todas las dependencias se encuentran en un contenedor, que será el responsable de inyectarlas y crear los beans (Clases de tipo objetos) necesarios.
* Primeramente vamos a incluir la anotación `@Service("ProductoService")`.
* La anotación `@Service` se encarga de registrar el componente y permiter que se inyecten otras clases a él.
* Código Snippet..

```java
package com.api.productos.mypackages.service;

@Service("ProductoService")
public class ProductoService {

}


```

</br>

#### Paso 10.2) Inyección de Dependendencias de la Clase `ProductoService`

* Vamos a definir las inyecciones de Dependencia de la clase que al fin y al cabo serán la Interfaz creada, el Convertidor, etc. Todo relacionado mediante el Service creado
* Dentro de la Clase vamos a usar la anotación `@Autowired` para la relación de los Beans e Interfaces.
* Seguidamente vamos a hacer uso de la notación `@Qualifier("NombreBean")` para nombrar y relacionar el Bean que vamos a definir dentro del servicio
* Creamos el campo-atributo que hará referencia a la interfaz bean.
* Código Snippet..
```java

	@Autowired
	@Qualifier("I_ProductoRepository")
	private I_ProductoRepository iProductoRepository;

}


```
* Ahora creamos el campo que usaremos que será el Bean Clase Controler. 
* Vamos a implementar las mismas anotaciones cambiando el nombre del bean logicamente.
* Código Snippet..
```java
	@Autowired
	@Qualifier("ProductoConverter")
	private ProductoConverter productoConvertidos;

```

</br>

* Código Completo..
```java
package com.api.productos.mypackages.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.api.productos.mypackages.converters.ProductoConverter;
import com.api.productos.mypackages.repositories.interfaces.I_ProductoRepository;

@Service("ProductoService")
public class ProductoService {
	
	@Autowired
	@Qualifier("I_ProductoRepository")
	private I_ProductoRepository iProductoRepository;

	
	@Autowired
	@Qualifier("ProductoConverter")
	private ProductoConverter productoConvertidor;

}


```

</br>

#### Paso 10.3) Métodos CRUD de la Clase `ProductoService`
#### (Acá vamos a definir los métodos que se encarguen de traer toda la lógica de persistencia del repositorio del Producto, como lo son listar, agregar, editar y eliminar algún producto)


</br>

#### 10.3.1) Creación del Método `agregarProducto`
* Este Método va a persistir un Producto en la db a través de la Interfaz creada implementando jpa y declarada en este service.
* El Método deevuelve un booleano, si hace lo requerido devuelve true, si el objeto es nulo false y sino false.
* Dentro del Método, utilizando la interfaz creada vamos a invocar al método `save()` de JPA para persistir el producto en la db.
* Notar que se puede crear otro método en la interfaz con otro nombre que haga exactamente lo mismo que el método save de jpa, queda a criterio de cada uno
* Códido Snippet..

```java
//INSERT
	public boolean agregarProducto(Producto producto) {
		
		try {
			
			if (producto == null) {
				
				return false;
					
			}else {
				
				iProductoRepository.save(producto);
				
				return true;
			
			}
		
			
		}catch(Exception e) {
			return false;
		}
	}

```



</br>

#### 10.3.2) Creación del Método `editarProducto`
* Este Método va a actualizar y persistir un Producto en la db a través de la Interfaz creada implementando jpa y declarada en este service.
* El Método devuelve un booleano, si hace lo requerido devuelve true, si el objeto es nulo o el id es 0 false y sino también false.
* Aplicamos el mismo método save de jpa

```java

//UPDATE
		public boolean editarProducto(Producto producto) {
			
			try {
				
				if ((producto == null) || (producto.getId() == 0)) {
					
					return false;
						
				}else {
					
					iProductoRepository.save(producto);
					
					return true;
				
				}
			
				
			}catch(Exception e) {
				return false;
			}
		}


```


</br>

#### 10.3.3) Creación del Método `eliminarProducto`
* Este Método va a eliminar un Producto de la db a través de la Interfaz creada implementando jpa y declarada en este service.
* El Método devuelve un booleano, si hace lo requerido devuelve true, si el id es 0 false y sino también false.
* Vamos a invocar el método creado en la interfaz llamado `findById()` para eliminar el producto a traves del id que se le pase a artaves del argumento de este metodo.
* Una vez que jpa encuentra este id, lo eliminamos con el método de jpa `delete()` 

```java

//DELETE
	public boolean eliminarProducto(int id) {
					
			try {
						
				if ((id == 0)) {
							
					return false;
								
				}else {
							
					Producto idProducto = iProductoRepository.findById(id);
							
					iProductoRepository.delete(idProducto);
					
					
					return true;
						
				}
					
						
				}catch(Exception e) {
						return false;
					}
				}
```




</br>

#### 10.3.3) Creación del Método `listadoProductos`
* Este Método nos va a traer uno o varios Producto/s como lista de productos del ModeloProducto y NO de la Entidad Producto
* Para poder realizar esto llamamos al `Convertidor`
* ATENTI a esto, la lista devuelta por el método sera del Modelo y No de la Entidad
* El Método será de tipo List y no ArrayList por el uso de la paginación mencionada
* Vamos a invocar al Método que convierte la lista Entidad a Modelo de Productos a traves del convertidor
* Dentro del Convertidor vamos a implementar el metodo `findAll()` invocandolo cno la interfaz.
* Notar que se puede crear otro método en la interfaz con otro nombre que haga exactamente lo mismo que el método save de jpa, queda a criterio de cada uno.
* Vamos a devolver un return con la lista de Productos.
* ATENTI que clase se importe, para este caso, todo de `org.springframework.data.domain`
* Código Snippet..
```java
//LISTA DE PRODUCTOS
	public List<ProductoModel> listadoProductos(Pageable pageable){
		
		return  productoConvertidor.convertirListaProducto( iProductoRepository.findAll(pageable).getContent()); 
		
	}
	

```


* Código Completo Métodos CRUD..
```java

	
	//===================== MÉTODOS CRUD ===========================
	
	//INSERT
	public boolean agregarProducto(Producto producto) {
		
		try {
			if (producto == null) {return false;}
			
			else {
				iProductoRepository.save(producto);
				return true;}
		
			
		}catch(Exception e) {return false;}
	}
	
	
	
	//UPDATE
	public boolean editarProducto(Producto producto) {
			
			try {
				
				if ((producto == null) || (producto.getId() == 0)) {
					
					return false;}
				
				else {	
					iProductoRepository.save(producto);
					return true;}
			
				
			}catch(Exception e) {return false;}
		}
	
	//DELETE
	public boolean eliminarProducto(int id) {
					
			try {
						
				if ((id == 0)) {return false;}
				
				else {
							
					Producto idProducto = iProductoRepository.findById(id);
							
					iProductoRepository.delete(idProducto);

					return true;}
					
						
				}catch(Exception e) {return false;} 
	}
	
	
	
	//LISTA DE PRODUCTOS
	public ArrayList<ProductoModel> listadoProductos(Pageable pageable){
		
		return  productoConvertidor.convertirListaProducto((ArrayList<Producto>) iProductoRepository.findAll(pageable).getContent()); 
		
	}
	

	

```



</br>

#### Paso 10.4) Otros Métodos de Uso de la Clase `ProductoService`
#### (Acá vamos a definir los métodos que se encarguen de traer los objetos de la db pero según los campos que le pasemos como argumento de la funcion creada. Vamos a utilizar los mismos nombres que los metodos creados en la Interfaz)



</br>

#### 10.4.1) Creación del Método `findById`
* Este Método nos va a traer el Producto con el Id pedido. 
* Es importante aclarar que el método es de tipo Modelo y no Entidad
* Para poder realizar esto llamamos al método creado `findById` a traves de la interfaz
* El Método nos va a crear y devolver un Producto con el  id pasado. 
* ATENTI a esto, la lista devuelta por el método sera del Modelo y No de la Entidad

				
```java

//PRODUCTO POR ID
	public ModeloProducto findById(int id) {
		
		return new ModeloProducto(iProductoRepository.findById(id));
		
	}
				
```

</br>

#### 10.4.2) Creación del Método `findByCodigo`
* Este Método nos va a traer el Producto con el codigo pedido. 
* Es importante aclarar que el método es de tipo Modelo y no Entidad
* Para poder realizar esto llamamos al método creado `findByCodigo` a traves de la interfaz
* El Método nos va a crear y devolver un Producto con el  id pasado. 
* ATENTI a esto, la lista devuelta por el método sera del Modelo y No de la Entidad

				
```java

	//PRODUCTO POR CODIGO
	public ModeloProducto findByCodigo(String codigo) {
		
		return new ModeloProducto(iProductoRepository.findByCodigo(codigo));
	}
		
				
```


</br>

#### 10.4.3) Creación del Método `findByNombre`
* Este Método nos va a traer uno o varios Producto/s como lista a traves de el nombre pedido. 
* Es importante aclarar que el método es de tipo Modelo y no Entidad
* Trabajando con el converter convertimos la lista de Entidad a lista de Modelo
* Para poder realizar esto llamamos al método creado `findByNombre` a traves de la interfaz
* El Método nos va a devolver uno o varios Producto/s como lista . 
* ATENTI a esto, la lista devuelta por el método sera del Modelo y No de la Entidad

				
```java

	
	//LISTA DE PRODUCTOS POR NOMBRE
	public List<ProductoModel> findByNombre(String nombre){
		
		return productoConvertidor.convertirListaProducto(iProductoRepository.findByNombre(nombre)); 
		
	}
				
```


</br>

#### 10.4.4) Creación del Método `findByPrecio`
* Este Método nos va a traer uno o varios Producto/s como lista a traves de el precio pedido. 
* Es importante aclarar que el método es de tipo Modelo y no Entidad
* Trabajando con el converter convertimos la lista de Entidad a lista de Modelo
* Para poder realizar esto llamamos al método creado `findByPrecio` a traves de la interfaz
* El Método nos va a devolver uno o varios Producto/s como lista . 
* ATENTI a esto, la lista devuelta por el método sera del Modelo y No de la Entidad

				
```java

	//LISTA DE PRODUCTOS POR PRECIO
	public List<ProductoModel> findByPrecio(double precio){
		
		return productoConvertidor.convertirListaProducto(iProductoRepository.findByPrecio(precio)); 
		
	}
				
```
* Código Completo Métodos de Uso..

```java


	//================ METODOS DE USO =============================
	
	
	//PRODUCTO POR ID | VALOR UNICO
	public ProductoModel findById(int id) {
		
		return new ProductoModel(iProductoRepository.findById(id));
		
	}
	
	//PRODUCTO POR CODIGO | VALOR UNICO
	public ProductoModel findByCodigo(String codigo) {
		
		return new ProductoModel(iProductoRepository.findByCodigo(codigo));
	}
		
	
	//LISTA DE PRODUCTOS POR NOMBRE
	public List<ProductoModel> findByNombre(String nombre){
		
		return productoConvertidor.convertirListaProducto(iProductoRepository.findByNombre(nombre)); 
		
	}
	
	//LISTA DE PRODUCTOS POR PRECIO
	public List<ProductoModel> findByPrecio(double precio){
		
		return productoConvertidor.convertirListaProducto(iProductoRepository.findByPrecio(precio)); 
		
	}
	
	
```

</br>

* Código Completo Clase ProductoService..

```java
package com.api.productos.mypackages.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.api.productos.mypackages.converters.ProductoConverter;
import com.api.productos.mypackages.entities.Producto;
import com.api.productos.mypackages.models.ProductoModel;
import com.api.productos.mypackages.repositories.interfaces.I_ProductoRepository;


@Service("ProductoService")
public class ProductoService {
	
	// ========= INYECCIÓN DE DEPENDENCIAS ==========
	@Autowired
	@Qualifier("I_ProductoRepository")
	private I_ProductoRepository iProductoRepository;

	
	@Autowired
	@Qualifier("ProductoConverter")
	private ProductoConverter productoConvertidor;
	
	
	
	//==================== LOGS ============================
	
	//LOGS DE ERROR
	private static final Logger logger = org.apache.logging.log4j.LogManager.getLogger(ProductoService.class);
	
	
	
	
	//===================== MÉTODOS CRUD ===========================
	
	//INSERT
	public boolean agregarProducto(Producto producto) {
		
		try {
			if (producto == null) {
				logger.error("ERROR AGREGAR_PRODUCTO: EL PRODUCTO ES NULO!");
				return false;				
			}
			
			else {
				iProductoRepository.save(producto);
				return true;
				
			}
		
			
		}catch(Exception e) {
			logger.error("ERROR AGREGAR_PRODUCTO: EL PRODUCTO NO SE HA GUARDADO!");
			return false;
			
			
		}
	}
	
	
	
	//UPDATE
	public boolean editarProducto(Producto producto) {
			
			try {
				
				if ((producto == null) || (producto.getId() == 0)) {
					logger.error("ERROR EDITAR_PRODUCTO:  EL PRODUCTO ES NULO O EL ID ES 0!");		
					return false;
					
				}
				
				else {	
					iProductoRepository.save(producto);
					return true;
					
				}
			
				
			}catch(Exception e) {
				logger.error("ERROR EDITAR_PRODUCTO: EL PRODUCTO NO SE HA EDITADO!");		
				return false;
				
			}
		}
	
	//DELETE
	public boolean eliminarProducto(int id) {
					
			try {
						
				if ((id == 0)) {
					logger.error("ERROR ELIMINAR_PRODUCTO: EL ID DEL PRODUCTO ES 0!");
					return false;
				}
				
				else {
							
					Producto idProducto = iProductoRepository.findById(id);
							
					iProductoRepository.delete(idProducto);

					return true;
					}
					
						
				}catch(Exception e) {
					logger.error("ERROR ELIMINAR_PRODUCTO: EL PRODUCTO NO SE HA ELIMINADO!");
					return false;
					
				} 
	}
	
	
	//LISTA DE PRODUCTOS
	public List<ProductoModel> listadoProductos(Pageable pageable){
		
		return  productoConvertidor.convertirListaProducto( iProductoRepository.findAll(pageable).getContent()); 
		
	}
	

	
	
	
	
	//================ METODOS DE USO =============================
	
	
	//PRODUCTO POR ID | VALOR UNICO
	public ProductoModel findById(int id) {
		
		return new ProductoModel(iProductoRepository.findById(id));
		
	}
	
	//PRODUCTO POR CODIGO | VALOR UNICO
	public ProductoModel findByCodigo(String codigo) {
		
		return new ProductoModel(iProductoRepository.findByCodigo(codigo));
	}
		
	
	//LISTA DE PRODUCTOS POR NOMBRE
	public List<ProductoModel> findByNombre(String nombre){
		
		return productoConvertidor.convertirListaProducto(iProductoRepository.findByNombre(nombre)); 
		
	}
	
	//LISTA DE PRODUCTOS POR PRECIO
	public List<ProductoModel> findByPrecio(double precio){
		
		return productoConvertidor.convertirListaProducto(iProductoRepository.findByPrecio(precio)); 
		
	}
	

	
	

	

}



```




</br>

 ### Paso 11) Creación y Configuración de la Clase Controller
 #### (La Clase Controller es la que se encarga de preparar el Modelo(el Modelo son los datos manejados por la aplicación) y seleccionar el nombre de la vista que será utilizada para mostrar el modelo al cliente. Esta Clase ejecuta la lógica de negocio, obtiene los resultados y los devuelve al servlet, encapsulado en un objeto de tipo Model)

</br>

#### Paso 11.1) Creación de la Clase `ProductoController`
* Primeramente vamos a crear el paquete que alojará el Controller.
* Creamos un paquete llamado mypackages.controller dentro de com.api.productos (src/main/java/com.api.productos). Es importante que este dentro del mismo ya que sino Spring no desplegará la app de forma correcta.
	* --> Click Der sobre la ruta mencionada  
	* --> New --> Package
	* --> En Name seguido de com.api.productos colocamos mypackages.controllers
	* --> Finish

* Creamos la Clase Controller
 	* --> Click Der sobre el paquete creado
 	* --> New --> Clase
 	* --> Siempre asegurarse la ruta de creación a través del Source Folder y Package
 	* --> En Name colocamos ProductoController
 	* --> Finish
* Código Snippet..



```java
package com.api.productos.mypackages.controllers;

public class ProductoController {
	
	public static void main(String[] args) {
		
	}
}

```

</br>

</br>

#### Paso 11.2) Configuración de la Clase `ProductoController`
* Al igual que la Clase Service, en esta Clase Controller  se implementará Inyección de Dependencias, esta nos permite relacionar objetos. Todas las dependencias se encuentran en un contenedor Spring, que será el responsable de inyectarlas y crear los beans (Clases de tipo objetos) necesarios.
* Para la Clase ProductoController vamos a Implementar la anotation `@RestController`. Con esta anotación le indicamos a Spring que esta clase será un componente de tipo controlador, además permitimos el manejo de solicitudes HTTP usando la API REST.  
* También Implementamos la anotación `@RequestMapping("rutaVersionadoApi")` que se va a encargar de relacionar un método con una petición http.
* Código Snippet..



```java
package com.api.productos.mypackages.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class ProductoController {
	


}
 

```

</br>

#### Paso 11.3) Inyección de Dependendencias de la Clase `ProductoController`

* Vamos a definir las inyecciones de Dependencia de la clase que al fin y al cabo será el Servicio creado.
* Dentro de la Clase vamos a usar la anotación `@Autowired` para la relación de los Beans e Interfaces.
* Seguidamente vamos a hacer uso de la notación `@Qualifier("NombreBean")` para nombrar y relacionar el Bean que vamos a definir dentro del controller
* Código Snippet..
```java

	//INYECCION DEL SERVICE
	@Autowired
	@Qualifier("ProductoService")
	ProductoService productoService;
	
	


```
* Código Snippet..
```java
package com.api.productos.mypackages.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.productos.mypackages.service.ProductoService;

@RestController
@RequestMapping("/v1")
public class ProductoController {
	
	//INYECCION DEL SERVICE
	@Autowired
	@Qualifier("ProductoService")
	ProductoService productoService;
	
	


}
 

```

</br>

#### Paso 11.4) Métodos CRUD de la Clase `ProductoController`
#### (Acá vamos a definir los métodos CRUD del Controller como lo son listar, agregar, editar y eliminar algún producto. Los Métodos CRUD del controller llevarán la anotación de Métodos de Petición(GET, HEAD, POST, PUT, ETC). Estos métodos nos permitarán trabajar con el Servicio RESTful )


</br>

#### 11.4.1) Creación del Método `agregarProducto` mediante  `POST`
* Este Método va a persistir un Producto en la db a través del Service Creado.
* El Método va a tener la anotación `@PostMapping("ruta")`, este tipo de anotación será una propiedad de petición http.
* La Petición POST coloca un archivo en un URI(dirección completa) especifico. Si hay un archivo o recurso en ese URI, POST reempleaza ese archivo o recurso. Si no hay ningún archivo o recurso, POST crea uno. A diferencia del Método PUT, los datos no se muestran en el caché ni tampoco en el historial de navegación.
* Dentro del argumento del método agregaremos las anotaciones `@RequestBody` y `@Validated`. La Primera nos permite recuperar el cuerpo de la solicitud y la segunda ejecuta validaciones para los métodos de una clase. 
* El Método devuelve un booleano, si hace lo requerido devuelve true, sino false.
* Vamos a usar el Service inyectado en este Controller.
* Dentro del Método, utilizando el Service creado vamos a invocar al método `agregarProducto()` creado en el mismo Service, junto con la lógica de persistencia para persistir el producto en la db.
* Códido Snippet..

```java
	//METODO POST
	@PostMapping("/producto")
	public boolean agregarProducto(@RequestBody @Validated Producto producto) {
		return productoService.agregarProducto(producto);
	}

```



</br>

#### 11.4.2) Creación del Método `editarProducto` mediante  `PUT`
* Este Método va a editar y luego persistir un Producto en la db a través del Service Creado.
* El Método va a tener la anotación `@PutMapping("ruta")`, este tipo de anotación será una propiedad de petición http.

* Dentro del argumento del método agregaremos las anotaciones `@RequestBody` y `@Validated`. La Primera nos permite recuperar el cuerpo de la solicitud y la segunda ejecuta validaciones para los métodos de una clase. 
* La Petición PUT coloca un archivo en un URI(dirección completa) especifico. Si hay un archivo o recurso en ese URI, PUT reempleaza ese archivo o recurso. Si no hay ningún archivo o recurso, PUT crea uno.
* El Método devuelve un booleano, si hace lo requerido devuelve true, sino false.
* Vamos a usar el Service inyectado en este Controller.
* Dentro del Método, utilizando el Service creado vamos a invocar al método `editarProducto()` creado en el mismo Service, junto con la lógica de persistencia para luego de editar persistir el producto en la db.
* `ATENTI`, este método es para editar un producto, por lo que el cuerpo de solicitud que se deba pasar a la hora de testear este método hay que incluir el id de ese producto. 
* Códido Snippet..

```java
	
	//MÉTODO PUT
	@PutMapping("/producto")
	public boolean editarProducto(@RequestBody @Validated Producto producto) {
		return productoService.editarProducto(producto);
		
	}

```



</br>

#### 11.4.3) Creación del Método `eliminarProducto` mediante  `DELETE`
* Este Método va a eliminar un Producto en la db a través del Service Creado.
* El Método va a tener la anotación `@DeleteMapping("ruta")`, este tipo de anotación será una propiedad de petición http delete.
* Vamos a incluir el id del producto dentro de la ruta que se le pase a la anotación, de esta forma podemos eliminar el producto por el id que le pasemos dentro de la URI completa
* Dentro del argumento del método agregaremos las anotaciones `@PathVariable("parametroDelMappping")` . Esta Anotación nos permite manejar las variables declaradas dentro del mapping para la asignación de la URI de la solicitud HTTP y establecerlas como parametros de metodo. 
* El Método devuelve un booleano, si hace lo requerido devuelve true, sino false.
* Vamos a usar el Service inyectado en este Controller.
* Dentro del Método, utilizando el Service creado vamos a invocar al método `eliminarProducto()` creado en el mismo Service, junto con la lógica de persistencia para luego de editar persistir el producto en la db. 
* Códido Snippet..

```java
	
//MÉTODO DELETE
	@DeleteMapping("/producto/{id}")
	public boolean eliminarProducto(@PathVariable("id") int id) {
		return productoService.eliminarProducto(id);
			
		}
```



</br>

#### 11.4.3) Creación del Método `listadoProductos` mediante  `GET`
* Este Método va a devolvernos una lista del ProductoModel con uno o más Productos a través del Service Creado.
* El Método va a tener la anotación `@GetMapping("ruta")`, este tipo de anotación será una propiedad de petición http get. Es importante aclarar que la ruta será `/productos`
* El Método devuelve una lista de tipo List y no ArrayList por el tema de paginación ya aclarado, esta lista es de tipo ProductoModel a través del método `listadoProductos` del Service creado y es de tipo pageable, osea nos va a paginar los productos para no devolvernos todos
* Código Snippet..

```java

	//MÉTODO GET
	@GetMapping("/productos")
	public List<ProductoModel> listadoProductos(Pageable pageable){
		return productoService.listadoProductos(pageable);
	}
	
	


```



</br>

* Código Completo..
```java
package com.api.productos.mypackages.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.productos.mypackages.entities.Producto;
import com.api.productos.mypackages.models.ProductoModel;
import com.api.productos.mypackages.service.ProductoService;


@RestController
@RequestMapping("/v1")
public class ProductoController {
	
	//==========INYECCION DEL SERVICE==========
	@Autowired
	@Qualifier("ProductoService")
	ProductoService productoService;

	
	
	//==========MÉTODOS HTTP====================
	
	//METODO POST
	@PostMapping("/producto")
	public boolean agregarProducto(@RequestBody @Validated Producto producto) {
		return productoService.agregarProducto(producto);
	}
	
	//MÉTODO PUT
	@PutMapping("/producto")
	public boolean editarProducto(@RequestBody @Validated Producto producto) {
		return productoService.editarProducto(producto);
		
	}
	
	//MÉTODO DELETE
	@DeleteMapping("/producto/{id}")
	public boolean eliminarProducto(@PathVariable("id") int id) {
		return productoService.eliminarProducto(id);
			
		}
	
	//MÉTODO GET
	@GetMapping("/productos")
	public List<ProductoModel> listadoProductos(Pageable pageable){
		return productoService.listadoProductos(pageable);
	}
	

	

}
 
```


</br>

#### Paso 11.5) Test de los Métodos CRUD de la Clase `ProductoController`
#### (Vamos a realizar las pruebas de cada uno de los métodos desarrollados hasta el momento
de nuestra API)

</br>

#### 11.5.1) Prueba de Funcionalidad con `Postman`
* Levantar el Servicio de Mysql.
	* --> Abrir  xampp y click en Mysql
* Ejecutar el Proyecto Spring 
* Visualizar en la salida de consola cuál es el Puerto en el cúal está corriendo el Servidor de Spring Tomcat. (En mi caso es el 8092, el puerto es configurable)
* Descargar la herramienta Postman. (Fijarse los links de descarga en el apartado de Tecnologías Empleadas.) 
* Una vez descargada crear un usuario y ejecutar la aplicación.
* Una vez que todos los pasos anteriores se están ejecutando sin problemas, vamos a tener que pasarle lo que es la url a Postman y probar cada método.

</br>


#### 11.5.2) Test Método  `agregarProducto` mediante  `POST`
* El Primer Método será el de `agregarProducto`, dentro de Postman en el recuadro de la aplicación seleccionamos el Método POST y colocamos la URL `http://localhost:8092/v1/producto`
* Vamos a trabajar con Json. Seleccionamos el recuadro de Body, y en el último item buscamos Json
* Escribimos el Registro que vamos a agregar a la db en formato Json
* Código Snippet..

```json
{
    "codigo":"ART-990",
    "nombre":"Monitor 32 pulgadas",
    "precio":33.334

}
```
* Recordar que el id es auto incremental y dinamico
* Click en Send y verificamos la respuesta(true se agrego el registro, false no se agrego)
* Comprobar la tabla producto de la db a través de phpMyAdmin y verificar el proceso a través de la terminal de Spring Tool


</br>

#### 11.5.3) Test Método  `editarProducto` mediante  `PUT`
* El Segundo Método será el de `editarProducto`, dentro de Postman en el recuadro de la aplicación seleccionamos el Método PUT y colocamos la URL `http://localhost:8092/v1/producto`
* Vamos a trabajar con Json. Seleccionamos el recuadro de Body, y en el último item buscamos Json
* Escribimos el Registro que vamos a agregar a la db en formato Json
* `ATENTI`, este método es para editar un producto, por lo que el cuerpo de solicitud que se deba pasar en postman deberá incluir el id de ese producto.
* Vamos a cambiar todos los campos menos el id
* Código Snippet..

```json
{
    "id": 1,
    "codigo":"ART-991",
    "nombre":"Monitor 16 pulgadas",
    "precio": 26.000

}
```


* Click en Send y verificamos la respuesta(true se agrego el registro, false no se agrego)
* Comprobar la tabla producto de la db a través de phpMyAdmin y verificar el proceso a través de la terminal de Spring Tool



</br>

#### 11.5.4) Test Método  `eliminarProducto` mediante  `DELETE`
* El Tercer Método será el de `eliminarProducto`, dentro de Postman en el recuadro de la aplicación seleccionamos el Método DELETE y colocamos la URL `http://localhost:8092/v1/producto/idDelProductoAeliminar`. Si queremos eliminar el producto con el id 1 la URI completa sería `http://localhost:8092/v1/producto/1`
* La Eliminación del Producto no posee cuerpo Json.
* Click en Send y verificamos la respuesta(true si se agrego el registro, false no se agrego)
* Comprobar la tabla producto de la db a través de phpMyAdmin y verificar el proceso a través de la terminal de Spring Tool.



</br>

#### 11.5.5) Test Método  `listadoProductos` mediante  `GET`
* El Cuarto Método será el de `listadoProductos`, dentro de Postman en el recuadro de la aplicación seleccionamos el Método GET y colocamos la URL `http://localhost:8092/v1/productos`.
* Click en Send y verificamos la respuesta(deberíamos tener la lista de Productos dentro del body en la respuesta de postman).

* Para obtener la primera página de productos con 2 registros, vamos a incluir en la URI, luego de productos signo de interrogación seguidamente el número de paginación con page y el tamaño de esa paginación,l osea el número de registros. (?page=0&size=2)
* URI completa `http://localhost:8092/v1/productos?page=0&size=2`.
* Tendriamos 2 productos de la Primera paginación, podemos pedir que se traiga más productos o cambiar mismo de paginación, a elección de uno.




</br>

#### Paso 11.6) Creación de Logs de Error
#### (Es una buena práctica utilizar logs. Los Logs son Registros(archivos de historial) que nos ayudan a la hora de identificar un posible error, advertencias, actividades realizadas,etc. Nos es recomendable utilizar varios métodos logs, ya que el espacio del servidor podría colapsar. El Método más utilizado es el de error. )

</br>

* Vamos a implementar los logs dentro del service, ya que allí es donde se encuentra toda la lógica de persistencia de datos.
* Creamos una variable llamada logger de tipo `Logger` del paquete 
`org.apache.logging.log4j.Logger` , y vamos a inicializarla pasandole la clase ProductoService
```java

	//==================== LOGS ============================
	
	//LOGS DE ERROR
	private static final Logger logger = org.apache.logging.log4j.LogManager.getLogger(ProductoService.class);
	
	

```
	
* Para implementar dicho log, habrá que invocar el método error `.error("mensaje")` a través del objeto de la clase. Dicha implementación deberá ser estar antes que el return
* Se implementará un log por método creado del Service
* Código Completo..

```java
package com.api.productos.mypackages.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.api.productos.mypackages.converters.ProductoConverter;
import com.api.productos.mypackages.entities.Producto;
import com.api.productos.mypackages.models.ProductoModel;
import com.api.productos.mypackages.repositories.interfaces.I_ProductoRepository;


@Service("ProductoService")
public class ProductoService {
	
	// ========= INYECCIÓN DE DEPENDENCIAS ==========
	@Autowired
	@Qualifier("I_ProductoRepository")
	private I_ProductoRepository iProductoRepository;

	
	@Autowired
	@Qualifier("ProductoConverter")
	private ProductoConverter productoConvertidor;
	
	
	
	//==================== LOGS ============================
	
	//LOGS DE ERROR
	private static final Logger logger = org.apache.logging.log4j.LogManager.getLogger(ProductoService.class);
	
	
	
	
	//===================== MÉTODOS CRUD ===========================
	
	//INSERT
	public boolean agregarProducto(Producto producto) {
		
		try {
			if (producto == null) {
				logger.error("ERROR AGREGAR_PRODUCTO: EL PRODUCTO ES NULO!");
				return false;				
			}
			
			else {
				iProductoRepository.save(producto);
				return true;
				
			}
		
			
		}catch(Exception e) {
			logger.error("ERROR AGREGAR_PRODUCTO: EL PRODUCTO NO SE HA GUARDADO!");
			return false;
			
			
		}
	}
	
	
	
	//UPDATE
	public boolean editarProducto(Producto producto) {
			
			try {
				
				if ((producto == null) || (producto.getId() == 0)) {
					logger.error("ERROR EDITAR_PRODUCTO:  EL PRODUCTO ES NULO O EL ID ES 0!");		
					return false;
					
				}
				
				else {	
					iProductoRepository.save(producto);
					return true;
					
				}
			
				
			}catch(Exception e) {
				logger.error("ERROR EDITAR_PRODUCTO: EL PRODUCTO NO SE HA EDITADO!");		
				return false;
				
			}
		}
	
	//DELETE
	public boolean eliminarProducto(int id) {
					
			try {
						
				if ((id == 0)) {
					logger.error("ERROR ELIMINAR_PRODUCTO: EL ID DEL PRODUCTO ES 0!");
					return false;
				}
				
				else {
							
					Producto idProducto = iProductoRepository.findById(id);
							
					iProductoRepository.delete(idProducto);

					return true;
					}
					
						
				}catch(Exception e) {
					logger.error("ERROR ELIMINAR_PRODUCTO: EL PRODUCTO NO SE HA ELIMINADO!");
					return false;
					
				} 
	}
	
	
	//LISTA DE PRODUCTOS
	public List<ProductoModel> listadoProductos(Pageable pageable){
		
		return  productoConvertidor.convertirListaProducto( iProductoRepository.findAll(pageable).getContent()); 
		
	}
	

	
	
	
	
	//================ METODOS DE USO =============================
	
	
	//PRODUCTO POR ID | VALOR UNICO
	public ProductoModel findById(int id) {
		
		return new ProductoModel(iProductoRepository.findById(id));
		
	}
	
	//PRODUCTO POR CODIGO | VALOR UNICO
	public ProductoModel findByCodigo(String codigo) {
		
		return new ProductoModel(iProductoRepository.findByCodigo(codigo));
	}
		
	
	//LISTA DE PRODUCTOS POR NOMBRE
	public List<ProductoModel> findByNombre(String nombre){
		
		return productoConvertidor.convertirListaProducto(iProductoRepository.findByNombre(nombre)); 
		
	}
	
	//LISTA DE PRODUCTOS POR PRECIO
	public List<ProductoModel> findByPrecio(double precio){
		
		return productoConvertidor.convertirListaProducto(iProductoRepository.findByPrecio(precio)); 
		
	}
	

	
	

	

}

```
* Para el testeo de los logs, usar postman y pasarle un id 0 al método put de edición de productos o enviar un objeto vacío. Se deberían mostrar los respectivos mensajes en la consola de spring.




</br>



## 7) Creación y Configuración de SpringSecurity y Json Web Tokens


</br>




 ### Paso 12)  Creación y Configuración de la Clase `Usuario`
 #### (Esta Clase será la Entidad que JPA-HIBERNATE mapee para crear la tabla en la Base de Datos.)

</br>

#### 12.1) Creación de la Clase `Usuario`
* Esta clase se alojará dentro de `mypackages.entities`
* Creamos la Clase en ese paquete, los pasos para la creación de la misma ya son conocidos.
* Código Snippet...

```java
package com.api.productos.mypackages.entities;

public class Usuario {
	

}

```



</br>

#### 12.2) Configuración de la Clase `Usuario`
* Vamos a hacer uso de las anotaciones JPA para persistir y crear los campos en la db, hay que tener en consideración, que como bien se explico en las primeras sesiones, JPA persisti y reemplaza los valores en la db, osea que si no se creo las tablas nombradas en estas entidades hibernate las crea en la db, por ende hay que tener mayor enfasis en el nombramiento de atributos y clases en las entidades, para esta ocasión no vamos a crear la tabala en la base de datos, sino que directamente vamos a trabajar desde la clase en Java, nuevamente aclaro, ojo con los nombres y convenciones entre Java y SQL.
* Además dicha clase va a emplementar un Serializable, para convertir los Beans en flujos de Bytes.
* Los últimos 2 atributos de la clase hacen referencia a la sesión del usuario, si es admin, usuario convencional o lo que fuese, y si el estado de tipo booelan para los demás atributos que tenga dicho usuario, si posee activo o no los atributos que vayamos a comparar.
* Código Completo...

```java
package com.api.productos.mypackages.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="usuarios")
public class Usuario implements Serializable{
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name="id" , unique= true)
	private int id;

	@Column(name="usuario" , unique= true)
	private String usuario;
	
	
	@Column(name="contrasenia")
	private String contrasenia;

	@Column(name="rol")
	private byte rol;

	@Column(name="estado")
	private boolean estado;
	
	
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public byte getRol() {
		return rol;
	}

	public void setRol(byte rol) {
		this.rol = rol;
	}

	public boolean getEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", usuario=" + usuario + ", contrasenia=" + contrasenia + ", rol=" + rol
				+ ", estado=" + estado + "]";
	}
	
	
	
	

}


```






</br>


 ### Paso 13) Creación y Configuración de la Interfaz `I_UsuarioRepository`
 #### (Esta Interfaz tendrá el mismo objetivo que la ya definida, siguiendo el patrón de diseño DAO, sin definir el cuerpo de las funciones ya que trabajaremos con la API de JpaRepository)

</br>



#### 13.1) Creación de la Interfaz `I_UsuarioRepository`
* Esta interfaz se alojará dentro de `mypackages.repositories.interfaces`
* Creamos la Interfaz en ese paquete, los pasos para la creación de la misma ya son conocidos.
* Código Snippet...

```java
package com.api.productos.mypackages.repositories.interfaces;

public interface I_UsuarioRepository {

}


```



</br>

#### 13.2) Configuración de la Interfaz `I_UsuarioRepository`
* Vamos a hacer uso de las anotaciones de Spring para que trabaje con jpaRepository
* Al igual que la otra interfaz, esta contendrá los métodos de JPA
* Código Completo...

```java
package com.api.productos.mypackages.repositories.interfaces;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.productos.mypackages.entities.Producto;
import com.api.productos.mypackages.entities.Usuario;

@Repository("I_UsuarioRepository")
public interface I_UsuarioRepository extends JpaRepository<Usuario, Serializable>{

	public abstract Usuario findById(int id);

	public abstract Usuario findByUsuario(String usuario);
	
	public abstract Usuario findByContrasenia(String contrasenia);

	public abstract Usuario findByRol(byte rol);
	
	public abstract Usuario findByEstado(boolean estado);



	
}


```


</br>


 ### Paso 14) Creación y Configuración del Servicio `UsuarioService`
 #### (Ya sabemos que en el service desarrollamos la lógica de negocio de la aplicación)

</br>

#### 14.1) Creación del Servicio `UsuarioService`
* Este servicio se alojará dentro de `mypackages.services`
* Creamos la Clase Service en ese paquete, los pasos para la creación de la misma ya son conocidos.
* Código Snippet...

```java
package com.api.productos.mypackages.service;

public class UsuarioService {

}


```



</br>

#### 14.2) Configuración del Servicio `UsuarioService`
* Vamos a hacer uso de las anotaciones de Spring para que trabaje con jpaRepository,  los pasos y anotaciones son los mismos que el otro service, la funcionalidad es la misma, la unica diferencia es que trabajamos con el repositorio y la entidad del Usuario
* Al igual que el otro service se hará uso de la inyección de dependencias
* Vamos a implementar la Interfaz `UserDetailsService`, esta se va a encargar que el usuario acceda directamente al contenido de las bases de datos, esta interfaz describe nu objeto que realizaz un acceso a datos con un unico metodo llmado `loadUserByUsername` que devuelve la info de un usuario.  Esto lo vamos a hacer con el metodo declarado en la interfaz `findByUsuario`.Previamente Crearemos un objeto encoder para trabajar con las contraseñas cifradas, debemos pasarles este encoder cuando invoquemos al metodo getContrasenia de la Clase Usuario
* El Método findByUsuario nos devuelve un usuario, pero necesitamos los detalles del mismo, por ende vamos a instanciar un objeto de tipo `User`, esta clase del paquete del core de spring tiene   7 argumentos que debemos pasarle,  el usuario, password, la habilitacion, la autorizacion, etc.
* Además vamos a crear una función llamada `obtenerPermisos` que nos devuelva una Lista de tipo `GrantedAuthority`, que son los permisos para un usuario en concreto, entonces el argumento de la funcion esparara el rol (que permiso tiene el usuario) y nos devolverá los permisos a través de una simple estructura de dato. En este Método trabajamos con un array con permisos de lectura, usuario o admin, creamos un for que referencia a cada uno de ellos, el permiso de lectura corresponde al Cero, el de Usuario al Uno y Administrador al Dos, entonces cuando en el parametro de la funcion se pase alguno de estos correspondientes números se hará referencia a que permiso/rol se tenga
* Código función..
```java
public List<GrantedAuthority> obtenerPermisos(byte rol){
		
		String roles[] = {"LECTURA","USUARIO","ADMINISTRADOR"};
		
		List<GrantedAuthority> auths = new ArrayList();
		
		for(int i=0 ; i < rol ; i++) {
			auths.add(new SimpleGrantedAuthority(roles[i]));
		}
		
		return auths;
	}
```
* Código Completo...

```java
 package com.api.productos.mypackages.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.api.productos.mypackages.entities.Usuario;
import com.api.productos.mypackages.repositories.interfaces.I_UsuarioRepository;

@Service("UsuarioService")
public class UsuarioService implements UserDetailsService{


	// ========= INYECCIÓN DE DEPENDENCIAS ==========
	@Autowired
	@Qualifier("I_UsuarioRepository")
	private I_UsuarioRepository iUsuarioRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
		 
		Usuario usuario = iUsuarioRepository.findByUsuario(username);
		
		return new User(usuario.getUsuario() , encoder.encode(usuario.getContrasenia()) , usuario.getEstado() 
				, usuario.getEstado() , usuario.getEstado() , usuario.getEstado() 
				, obtenerPermisos(usuario.getRol()));
	}
	
	public List<GrantedAuthority> obtenerPermisos(byte rol){
		
		String roles[] = {"LECTURA","USUARIO","ADMINISTRADOR"};
		
		List<GrantedAuthority> auths = new ArrayList();
		
		for(int i=0 ; i < rol ; i++) {
			auths.add(new SimpleGrantedAuthority(roles[i]));
		}
		
		
		
		return auths;
	}
	
	
	
}

```

</br>


 ### Paso 15)  Creación y Configuración de la Clase de Configuración `UsuarioConfiguration`
 #### (Esta Clase será el Modelo de Acceso a la DB para obtener el usuario y contraseña de la db y asi poder validar el login, atenti que la Clase Usuario es para persistir los datos con JPA y la Clase UsuarioConfiguration es para obtener los datos, utilizaremos Spring Security y Json Web Tokens con esta clase)

</br>

#### 15.1) Creación de la Clase de Configuracion `UsuarioConfiguration`
* Creamos la clase dentro del paquete `mypackages.configurations` ya creado previamente para la clase anterior 
* Código Snippet...

```java
package com.api.productos.mypackages.configurations;

public class UsuarioConfiguration {

}


```


</br>

#### 15.2) Configuración de la Clase de Configuracion `UsuarioConfiguration`
* Esta clase debe de enviar un token hacia la clase WebConfiguration, el token lo deberá generar otra clase llamada `JwtUtil`, pasará por un filtro a través de la clase aún no creada `JwFilter` entre otras cosas.
* Creamos atributos getters y setters..
* Código Snippet...

```java
package com.api.productos.mypackages.configurations;

public class UsuarioConfiguration {
	
	private String usuario;
	private String contrasenia;
	
	
	public String getUsuario() {
		return usuario;
	}

	
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	
	

}


```




</br>


 ### Paso 16) Creación y Configuración de la Clase de Configuración `JwtUtilConfiguration` 
 #### (Esta Clase será la que genere el token del cliente cada vez que se valida el usuario y contraseña. Una vez que el cliente necesite usar la aplicación deberá mandar ese token generado para solicitar dicho recurso )

</br>

#### 16.1) Creación de la Clase de Configuracion `JwtUtilConfiguration` 
* Creamos la clase dentro del paquete `mypackages.configurations` ya creado previamente para la clase anterior 
* Código Snippet...

```java
package com.api.productos.mypackages.configurations;

public class JwtUtilConfiguration {

}


```


</br>

#### 16.2) Configuración de la Clase de Configuracion `JwtUtilConfiguration` 
* La descripción de cada cosa esta mismo en los comentarios del código..
* Código Completo..
```java
package com.api.productos.mypackages.configurations;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import static java.util.Collections.emptyList;

public class JwtUtilConfiguration {
	
	
	// Método para crear el JWT y enviarlo al cliente en el header de la respuesta
    static void addAuthentication(HttpServletResponse res, String username) {

        String token = Jwts.builder()
            .setSubject(username)
                
            // Vamos a asignar un tiempo de expiracion de 10 minuto
            // solo con fines demostrativos en el video que hay al final
            .setExpiration(new Date(System.currentTimeMillis() + 600000))
            
            // Hash con el que firmaremos la clave
            .signWith(SignatureAlgorithm.HS512, "UsuarioValidado")
            .compact();

        //agregamos al encabezado el token
        res.addHeader("Authorization", "Token: " + token);
    }

    // Método para validar el token enviado por el cliente
    static Authentication getAuthentication(HttpServletRequest request) {
        
        // Obtenemos el token que viene en el encabezado de la peticion
        String token = request.getHeader("Authorization");
        
        // si hay un token presente, entonces lo validamos
        if (token != null) {
            String user = Jwts.parser()
                    .setSigningKey("UsuarioValidado")
                    .parseClaimsJws(token.replace("Token:", "")) //este metodo es el que valida
                    .getBody()
                    .getSubject();

            // Recordamos que para las demás peticiones que no sean /login
            // no requerimos una autenticacion por username/password 
            // por este motivo podemos devolver un UsernamePasswordAuthenticationToken sin password
            return user != null ?
                    new UsernamePasswordAuthenticationToken(user, null, emptyList()) :
                    null;
        }
        return null;
    }

}

}


```
* Hay Muchas cosas que podriamos hablar hacerca de JWT, pero en este caso la mayor relevancia para las pruebas con Postman es el tiempo de expiración de los Tokens, por defecto en la documentación viene configurado a 1 minuto, acá se modifica a 10 para no tener que estar agregando los nuevos en cada peticion, también se podría quitar el mismo pero por temas de seguridad se deja.
 
 </br>
 
 
 ### Paso 17) Creación y Configuración de la Clase de Configuración `JwtFilterConfiguration` 
 #### (Esta Clase será la que se encargue de validar el token proporcionado por el cliente, recordar, el cliente proporciona usuario y contraseña y como respuesta se le envia un token con toda la seguridad detrás del mismo, ese token el cliente lo usará cada vez que se quiera conectar a la aplicación, entonces este filtro sirve para validar ese token)

</br>


#### 17.1) Creación de la Clase de Configuracion `JwtFilterConfiguration` 
* Creamos la clase dentro del paquete `mypackages.configurations`.
* Código Snippet...

```java
package com.api.productos.mypackages.configurations;

public class JwtFilterConfiguration {

}


```


</br>

#### 17.2) Configuración de la Clase de Configuracion `JwtFilterConfiguration` 
* Vamos a implementar el metodo de la clase `GenericFilterBean` llamado `doFilter`.
* La clase que se hereda es una superclase para cualquier tipo de filtro. La conversión de tipos de parámetros de configuración es automática, y el método setter correspondiente se invoca con el valor convertido. También es posible que las subclases especifiquen las propiedades requeridas. Los parámetros sin que coincidan con el configurador de propiedades de bean simplemente se ignorarán. 
* El Método `doFilter`  es un metodo filtro de servlet que interceptan dinamicamente solicitudes y respuestas para transformar o utilizar la informacion contenida en las mismas
* Luego llamaremos al jwtUtil trayendo la autenticacion con el request del cliente, seguidamente se aplica un `SecurityContextHolder`, Esta clase proporciona una serie de métodos estáticos que delegan en una instancia de SecurityContextHolderStrategy. El propósito de la clase es proporcionar una forma conveniente de especificar la estrategia que se debe usar para una JVM determinada. Esta es una configuración de toda la JVM, ya que todo en esta clase es para facilitar el uso en el código de llamada .static
* Por Último aplicamos el `filterChain` para concluir el proceso de filtrado 
```java

package com.api.productos.mypackages.configurations;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.GenericFilterBean;

public class JwtFilterConfiguration extends GenericFilterBean{

	
	@Override
    public void doFilter(ServletRequest request,
                         ServletResponse response,
                         FilterChain filterChain)
            throws IOException, ServletException {


        Authentication authentication = JwtUtilConfiguration.getAuthentication((HttpServletRequest)request);

        SecurityContextHolder.getContext().setAuthentication(authentication);

        filterChain.doFilter(request,response);
    }
	
	
}


```


</br>


 ### Paso 18) Creación y Configuración de la Clase de Configuración `LoginFilterConfiguration` 
 #### (Esta Clase será la que procese los tokens de solicitud de autenticación creados mediante la implementación de las otras clases)

</br>

#### 18.1) Creación de la Clase de Configuracion `LoginFilterConfiguration` 
* Creamos la clase dentro del paquete `mypackages.configurations`.
* Código Snippet...

```java
package com.api.productos.mypackages.configurations;

public class LoginFilterConfiguration {

}


```


</br>

#### 18.2) Configuración de la Clase de Configuracion `LoginFilterConfiguration` 
* Esta clase heredara las funcionalidades de la clase `AbstractAuthenticationProcessingFilter`,que a su vez esta procesa los tokens de solicitud ed autenticación..
* Debemos implementar el método de dicha clase, porque el constructor será completamente modificado, en los parametros de el constructor se le pasara la URL desde el Service que crearemos más adelante  `WebSecurity`, el segundo parametro sera de tipo `AuthenticationManager`, que es una interfaz para la autenticación, esta devuelve una instancia con el indicador establecido en true.
* Dentro del constructor, invocando al padre, creamos una instancia de `AntPathRequestMatcher` pasandole la url, este objeto compara la url con un patron predefinido omitido y coincidira o no con los metodos http.
* Luego invocamos al metodo `setAuthenticationManager` pasandole el `authManager`, el metodo obtiene una instancia de autenticacion para usarla en solicitudes posteriores
* Código del constructor `LoginFilterConfiguration` ...

```java
 public LoginFilterConfiguration(String url, AuthenticationManager authManager) {
	        super(new AntPathRequestMatcher(url));
	        setAuthenticationManager(authManager);
	    }

```

* El Método `attemptAuthentication` procesa el envio de un formulario de autenticación. Los formularios de inicio de sesión deben presentar dos parámetros a este filtro: un nombre y una contraseña. Los parametros de dicho metodo serán `HttpServletRequest` y `HttpServletResponse`, el primero para manejar y obtener la petición del cliente y el segundo para procesarla.
* Dentro de dicho método declaramos una variable de tipo InputStream para obtener la petición en formato JSON. Luego creamos otra variable de tipo User para realizar el mapeo a nuestra clase UsuarioConfiguration para almacenar los datos, usuario y contraseña
* Por último dicho método va a devolver una Colección de elementos, el usuario y contraseña autenticado, en esta parte se compara el token
* Código del método `attemptAuthentication` ...

```java
@Override
	    public Authentication attemptAuthentication(
	            HttpServletRequest req, HttpServletResponse res)
	            throws AuthenticationException, IOException, ServletException {

	        // obtenemos el body de la peticion que asumimos viene en formato JSON
	        InputStream body = req.getInputStream();

	      //Leemos los valores del Json (usuario y contraseña)
	        UsuarioConfiguration user = new ObjectMapper().readValue(body, UsuarioConfiguration.class);

	        // Finalmente autenticamos
	        // Spring comparará el user/password recibidos
	        // contra el que definimos en la clase SecurityConfig
	        return getAuthenticationManager().authenticate(
	                new UsernamePasswordAuthenticationToken(
	                        user.getUsuario(),
	                        user.getContrasenia(),
	                        Collections.emptyList()
	                )
	        );
	}
```
* Por Último crearemos el método que valide todo el proceso de autenticación llamdo `successfulAuthetication` se aplicaran los métodos https, el FilterChain y el Authentication en sus parametros. El método en sí llama a la clase que genera el token `JwtUtilConfiguration` y agrega la autenticacion 
* Código del método `successfulAuthentication`..
```java
@Override
	    protected void successfulAuthentication(
	            HttpServletRequest req,
	            HttpServletResponse res, FilterChain chain,
	            Authentication auth) throws IOException, ServletException {

	        // Si la autenticacion fue exitosa, agregamos el token a la respuesta
	        JwtUtilConfiguration.addAuthentication(res, auth.getName());
	    }

```

* Código Completo de la Clase `LoginFilterConfiguration`
```java
package com.api.productos.mypackages.configurations;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.fasterxml.jackson.databind.ObjectMapper;

public class LoginFilterConfiguration extends AbstractAuthenticationProcessingFilter{

	  public LoginFilterConfiguration(String url, AuthenticationManager authManager) {
	        super(new AntPathRequestMatcher(url));
	        setAuthenticationManager(authManager);
	    }

	  @Override
	    public Authentication attemptAuthentication(
	            HttpServletRequest req, HttpServletResponse res)
	            throws AuthenticationException, IOException, ServletException {

	        // obtenemos el body de la peticion que asumimos viene en formato JSON
	        InputStream body = req.getInputStream();

	       //Leemos los valores del Json (usuario y contraseña)
	        UsuarioConfiguration user = new ObjectMapper().readValue(body, UsuarioConfiguration.class);

	        // Finalmente autenticamos
	        // Spring comparará el user/password recibidos
	        // contra el que definimos en la clase SecurityConfig
	        return getAuthenticationManager().authenticate(
	                new UsernamePasswordAuthenticationToken(
	                        user.getUsuario(),
	                        user.getContrasenia(),
	                        Collections.emptyList()
	                )
	        );
	    }
	  
	  @Override
	    protected void successfulAuthentication(
	            HttpServletRequest req,
	            HttpServletResponse res, FilterChain chain,
	            Authentication auth) throws IOException, ServletException {

	        // Si la autenticacion fue exitosa, agregamos el token a la respuesta
	        JwtUtilConfiguration.addAuthentication(res, auth.getName());
	    }

}

```





</br>

 ### Paso 19) Creación y Configuración de la Clase de Configuración `WebSecurity`
 #### (Esta clase va a proporcionar seguridad basada en la web, como por ejemplo que el usuaio se autentique antes de acceder a cualquier URL dentro de nuestra aplicacion, manejo de roles(permisos de usuarios), autenticacion HTTP, paginas de inicio y cierre de sesion, etc)

</br>

#### 19.1) Creación de la Clase Configuration `WebSecurity`
* Vamos a crear la clase en el mismo paquetes que todas las clases de configuracion, `mypackages.configurations` 
* Código Snippet...

```java
package com.api.productos.mypackages.configurations;

public class WebSecurity {

}


```



</br>


#### 19.2) Configuración de la Clase Configuration `WebSecurity`
* Para una clase de configuration necesitaremos la anotacion `@Configuration` 
* Para activar la seguridad en la clase empleamos la anotacion `@EnableWebSecurity`
* Esta clase va a heredar de `WebSecurityConfigurerAdapter`, de esta forma podemos personalizar WebSecurity y HttpSecurity, podemos replicar el comportamiento obteniendo multiples elementos http heredando en los diferentes beans(clases) 
* Vamos a utilizar inyección de dependencias para traer las funcionalidades de nuestro `UsuarioService`
* Código Inyección..
```java
	// ========= INYECCIÓN DE DEPENDENCIAS ==========
		@Autowired
		@Qualifier("UsuarioService")
		private UsuarioService usuarioService;

	

```
* Implementamos los 2 métodos más usados de la clase `configure(AuthenticationManagerBuilder auth)` y `configure(HttpSecurity http)`
* Vamos a reestructurar el cuerpo de cada uno de los metodos..
* En el `configure(AuthenticationManagerBuilder auth)` implementamos el UsuarioService a traves del método `userDetailsService`
* Con esta función spring comprueba y realiza la verificación de autenticación de tal usuario
* Código función..
```java
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
//Método para comprobar el user y password en la db		auth.userDetailsService(usuarioService);
		
			/*
		// Podemos Cargar el Usuario y Contraseña en Memoria sin usar la db
        auth.inMemoryAuthentication()
                .withUser("admin")
                .password("admin")
                .roles("ADMIN");
		*/
		
	}


```
* El segundo método se deberá pasar en su parametro un elemento de tipo `HttpSecurity`,  este permite configurar la seguridad basada en la web para solicitudes http. La configuracion requerira que cualquier URL que se solicite requiere un Usuario con el rol "ROLE_USER". También se define un esquema de autenticación en memoria con un usuario que tiene un nombre y contraseña. Seguidamente esta funcion permitará el ingreso a cualquier usuario a través de la url `/login`, estas peticiones a traves dee esta peticion pasarán por los filtros desarrollados en cada clase, entonces, cualquier cliente puede ingresar a la url pero no a la aplicacion, si el cliente x ingresa usuario y contraseña adecuado se genera el famoso token que seran las credenciales de ese cliente, caso de que ese cliente x no ingrese el usuario y contraseño correcto no se generará ese token y solamente tendrá acceso al login y no a la aplicacion.
* Código función..
```java
	

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests()
        .antMatchers("/login").permitAll() //permitimos el acceso a /login a cualquiera
        .anyRequest().authenticated() //cualquier otra peticion requiere autenticacion
        .and()
        // Las peticiones /login pasaran previamente por este filtro
        .addFilterBefore(new LoginFilterConfiguration("/login", authenticationManager()),
                UsernamePasswordAuthenticationFilter.class)
            
        // Las demás peticiones pasarán por este filtro para validar el token
        .addFilterBefore(new JwtFilterConfiguration(),
                UsernamePasswordAuthenticationFilter.class);
	}
```

* Código Completo de la clase `WebSecurityConfiguration`..

```java
package com.api.productos.mypackages.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.api.productos.mypackages.repositories.interfaces.I_ProductoRepository;
import com.api.productos.mypackages.service.UsuarioService;

@Configuration
@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter {

	
	// ========= INYECCIÓN DE DEPENDENCIAS ==========
		@Autowired
		@Qualifier("UsuarioService")
		private UsuarioService usuarioService;

	
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		//Método para comprobar el user y password en la db
		auth.userDetailsService(usuarioService);
		
		/*
		// Podemos Cargar el Usuario y Contraseña en Memoria sin usar la db
        auth.inMemoryAuthentication()
                .withUser("admin")
                .password("admin")
                .roles("ADMIN");
		*/
		
	}

	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests()
        .antMatchers("/login").permitAll() //permitimos el acceso a /login a cualquiera
        .anyRequest().authenticated() //cualquier otra peticion requiere autenticacion
        .and()
        // Las peticiones /login pasaran previamente por este filtro
        .addFilterBefore(new LoginFilterConfiguration("/login", authenticationManager()),
                UsernamePasswordAuthenticationFilter.class)
            
        // Las demás peticiones pasarán por este filtro para validar el token
        .addFilterBefore(new JwtFilterConfiguration(),
                UsernamePasswordAuthenticationFilter.class);
	}

	
	
	
}


```

* Para Spring Security me guíe por los siguientes tutoriales : https://github.com/windoctor7/codigo-tutoriales-blog/tree/master/spring-auth-jwt o https://windoctor7.github.io/spring-jwt.html u otro tutorial https://windoctor7.github.io/spring-jwt.html
* Además videotutorial :https://www.youtube.com/watch?v=Gw2d7t1vqLg&list=PLcIHm18h1i4m1xuhwrL-LjVjf5wuYFRCV&index=13
* Los Nombres y Métodos fueron Modificados a gusto, no está completamente identico




 </br>
 
 
 ### Paso 20) Test de `Spring Security` y `JWT`  
 #### (Llegar hasta este punto no fue fácil, intenté describir lo mejor posible que es lo que hace cada método y funcionalidad implementada, desde ya que de forma superficial por qué no es un tema fácil de digerir, para testear la seguridad vamos a usar nuevamente Postman)
 
 </br>
 
 #### 20.1) Modificación de los usos de los Métodos HTTP en el `ProductoController`
 #### (Para trabajar con los métodos http tenemos que tener primerasmente los roles y usuarios levantados en la db, este paso lo haremos luego)
 
 * Nos dirijimos hacia el ProductoController y vamos a agregar la Anotattion `@PreAuthorize("hasRole('ADMINISTRADOR')")` para los métodos PostMapping, PutMapping y DeleteMapping, el GetMapping no es relevante para los demás usuarios.
 * Código Final de la Clase `ProductoController`..
 ```java
 package com.api.productos.mypackages.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.productos.mypackages.entities.Producto;
import com.api.productos.mypackages.models.ProductoModel;
import com.api.productos.mypackages.service.ProductoService;


@RestController
@RequestMapping("/v1")
public class ProductoController {
	
	//==========INYECCION DEL SERVICE==========
	@Autowired
	@Qualifier("ProductoService")
	ProductoService productoService;

	
	
	//==========MÉTODOS HTTP====================
	
	//METODO POST
	@PreAuthorize("hasRole('ADMINISTRADOR')")
	@PostMapping("/producto")
	public boolean agregarProducto(@RequestBody @Validated Producto producto) {
		return productoService.agregarProducto(producto);
	}
	
	//MÉTODO PUT
	@PreAuthorize("hasRole('ADMINISTRADOR')")
	@PutMapping("/producto")
	public boolean editarProducto(@RequestBody @Validated Producto producto) {
		return productoService.editarProducto(producto);
		
	}
	
	//MÉTODO DELETE
	@PreAuthorize("hasRole('ADMINISTRADOR')")
	@DeleteMapping("/producto/{id}")
	public boolean eliminarProducto(@PathVariable("id") int id) {
		return productoService.eliminarProducto(id);
			
		}
	
	//MÉTODO GET
	@GetMapping("/productos")
	public List<ProductoModel> listadoProductos(Pageable pageable){
		return productoService.listadoProductos(pageable);
	}
	

	

}
 
 ```
 
  </br>
 
 
 #### 20.2) Agregar los Registros de Seguridad para los Usuarios 
 #### (En esta aplicación tenemos 3 tipos de usuarios según los declarados en UsuarioService, que corresponde al campo rol de la Entidad Usuario, además tenemos el campo estado, que nos permitirá activar o desactivar dichos permisos en la db, vamos a agregar un registro y testear dicha Seguridad)
 
 * Si todo se ha ejecutado correctamente en los pasos anteriores tendríamos la tabla usuarios vacia creada en la db, desde PHPMYADMIN seleccionamos dicha tabla e insertamos desde el editor de linea o pestaña SQL el registro..
  
```sql
use db_api_productos;

insert into usuarios(id, contrasenia, estado, rol, usuario) values(1,'admin', 1 , 2 ,'admin');

```
* El campo estado es de tipo boolean y el campo rol de tipo byte, este validará para 0, 1 o 2 (LECTURA, USUARIO, ADMINISTRADOR)

</br>

 #### 20.3) Verificación de `Tokens` y `Usuarios`
* Luego en Postman usaremos la ruta `http://localhost:8092/login` de tipo POST con pasandole en el Bodyel usuario y contraseña que tendriamos levantado en la db en formato Json 
 ```json
 {
"usuario":"admin" , "contrasenia":"admin"
    }
```
* Click en Send y Obtenemos un `Status 200 OK`, la petición HTTP fue exitosa, si nos fijamos en la Pestaña de `Headers` veremos una key llamada `Authorization` con el Valor `Token: eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImV4cCI6MTY0MzE0ODg1NX0.syW7nAEnKjrWgOU2SWunB4XCyGTWqnHTZoNeZxr3urQ_sjvgRBqBVuFaAUEOs2tNqAoRweoF9dnFL8NhH31Uxw `, este token cambia por cada petición, podemos configurar todo lo que queramos, pero tenemos funcionando SPRING SECURITY Y JWT.

</br>

 #### 20.4) Verificación de `Spring Security`
 * Veamos si pasando otro usuario y contraseña Spring nos devuelve un token 
 * Usamos la misma ruta `http://localhost:8092/login` de tipo POST  pasandole un usuario y contraseña incorrecto y no insertado en la db en formato Json 
 ```json
 {
"usuario":"juan" , "contrasenia":"perez"
    }
```
* Obtenemos un `401 Unauthorized`, no tenemos autorización para usar esta aplicación, de la misma forma se puede implementar otro usuario y guardar el estado en 0, false para que si bien este registrado en la base de datos no tenga permisos por equis motivo, esto me parece super interesante, tiene una potencialidad muy grande.


</br>

 #### 20.5) Verificación de la `API Productos`
 * Vimos que podemos o no tener acceso a nuestra Api, teniendo el acceso pertinente vamos a consultar los productos que tenemos en nuestra Base de Datos
 * Repetimos el Proceso de Obtención de nuestro token para hacer uso de nuestra credencial
*  Ruta `http://localhost:8092/login` en el Body mandamos un Json..
 ```json
 {
"usuario":"admin" , "contrasenia":"admin"
    }
```
* Obtenemos Nuestro Token `Token: eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImV4cCI6MTY0MzE0OTY4M30.RJ_cWIsyR8sgLKwe7HE80L_P2AyO5GXeldUYJJIEDE2tKT6EVC6-kdBn-DPoSUhHL57XVtcCEnbXXMaUbdGWSQ`
* Este token (SIN LA PALABRA TOKEN:) lo vamos a pegar en el `VALUE` de la key `Authorization` dentro de la pestaña `Headers`, si no está configurada esta key-value agregar
* Luego cambiamos la ruta de la petición a `http://localhost:8092/v1/productos`, tipo de Método GET y Click en Send
* Obtenemos un `Status 200 OK` y dentro de la Pestaña Body del Response obtenemos todos los productos de nuestra API..
 ```json
[
    {
        "id": 3,
        "codigo": "JLU-332",
        "nombre": "Teclado Gamer RGB Ninkiuop",
        "precio": "6.500"
    },
    {
        "id": 2,
        "codigo": "ART-990",
        "nombre": "Monitor 32 pulgadas",
        "precio": "33.334"
    },
    {
        "id": 4,
        "codigo": "KTE-111",
        "nombre": "Mouse Inalambrico",
        "precio": "3.200"
    },
    {
        "id": 5,
        "codigo": "KTE-111",
        "nombre": "Mouse Inalambrico",
        "precio": "3.200"
    },
    {
        "id": 6,
        "codigo": "KTE-112",
        "nombre": "Mouse Inalambrico 4.0",
        "precio": "3.700"
    },
    {
        "id": 7,
        "codigo": "KTE-114",
        "nombre": "Mouse Inalambrico 5.0",
        "precio": "4.200"
    }
]
```







































</br>



## Sección 8) Apéndice


</br>


 ### Anotaciones Usadas para JPA
 
| **Tipo de Anotación** | **Finalidad** |               
| ------------- | ------------- |
| @Table(name="nombreTabla") | Definición de Nombre de Tabla SQL. |
| @Column(name="nombreCampo") | Definición de Nombre de Campo SQL. |
| @Entity | Definición de Entidad, para que la misma pueda ser mapeada a una Tabla SQL. |
| @Id | Definición de Campo tipo identificador entero SQL. |



</br>


 ### Anotaciones Usadas para Spring Boot y Spring Security
 
| **Componentes e Inyección de Dependencia** | **Finalidad** |               
| ------------- | ------------- |
| @Component("nombreComponente") |  Establecemos la clase Java como un bean o componente para que el mecanismo de exploración de componentes de Spring pueda agregarla al contexto de la aplicación |
| @Repository("nombreRepositorio") | Estereotipo para la Capa de Persistencia. |
| @Service("NombreServicio") | Registrar el componente y permitir que se inyecten otras clases a él|
| @Autowired | Inyección de Dependencias. Busca un objeto Bean que implementen determinada interfaz y lo referencia para no crear una nueva instancia del objeto. |
| @Qualifier("NombreBean") | Nombramos el Bean que queremos inyectar. Se evita la ambigueda cuando Spring encuentra multiples beans del mismo tipo. |

</br>

| **Solicitudes HTTP** | **Finalidad** |
| ------------- | ------------- |
| @RestController | Con esta anotación le indicamos a Spring que será un componente de tipo controlador, además permitimos el manejo de solicitudes HTTP usando la API REST. | 
| @RequestMapping("rutaVersionadoApi") | Se va a encargar de relacionar un método con una petición http |
| @RequestBody | Nos permite Recuperar el Cuerpo de la Solicitud HTTP |
| @Validated | Ejecuta Validaciones para los Métodos de una Clase |
| @PutMapping("ruta") | Propiedad de Petición HTTP PUT |
| @PostMapping("ruta") | Propiedad de Petición HTTP POST|
| @DeleteMapping("ruta") | Propiedad de petición HTTP DELETE |
| @PathVariable("parametro") | Permite Manejar las variables declaradas dentro del mapping(put,delete,etc) para la asignación de la URI de la solicitud HTTP y establecerlas como parametros del método |


</br>

| **Spring Security** | **Finalidad** |
| ------------- | ------------- |
| @Configuration | Activamos las solicitudes de Servicios para estos Beans |
| @EnableWebSecurity | Activamos SpringSecurity en nuestra aplicación |


</br>

</br>

</br>

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


