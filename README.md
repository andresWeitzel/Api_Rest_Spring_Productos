# API REST con Spring Boot, Mysql y Maven.

Creación de una API REST utilizando el Framework Spring Boot con el IDE Spring Tool Suite 4 junto con Maven, Mysql y JPA-Hibernate.

</br>

### Tecnologías Implementadas

| **Tecnologías** | **Versión** | **Finalidad** |               
| ------------- | ------------- | ------------- |
| Java |   12.0.2 | JDK |
| Spring Tool Suite 4 | 4.9.0  | IDE |
| Spring Boot |   2.5.4  | Framework |
| Maven |  4.0.0 | Gestor de Proyectos |
| JPA-Hibernate | 5.4.27 | Framework para el mapeo de objetos y persistenciua en la db |
| PostMan | 9.4.1 | Test de Apis |
| XAMPP | 3.2.2  | Paquete de Servidores |
| Mysql | 10.1.38 | Sistema de Gestión de Bases de Datos |
| Cygwin | 3.1.6  | Colección de Herramientas / Terminal en Windows integrada al IDE |
| Git | 2.29.1  | Control de Versiones |


</br>

### Descarga y Documentacion de las Tecnologías Implementadas

| **Tecnología**  | **Descarga** | **Documentación** |               
| ------------- | ------------- | ------------- |
| Java-JDK 12 | https://www.oracle.com/java/technologies/javase/jdk12-archive-downloads.html |  https://docs.oracle.com/en/ |
| Spring Tool Suite 4 |https://spring.io/tools | https://spring.io/guides |
| XAMPP | https://www.apachefriends.org/download.html | https://community.apachefriends.org/f/ |
| Maven Repository | - | https://mvnrepository.com/ | 
| PostMan | https://www.postman.com/downloads/ | https://www.postman.com/product/what-is-postman/ |
| Cygwin | https://cygwin.com/install.html | https://cygwin.com/cygwin-ug-net.html |
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
| Javax Annotation API | 1.3.2 | Api para la lectura de Annotation |
| javax.xml.bind | 2.3.1 |  Dependencia para convertir Objetos Java en Objetos XML |
| jackson-databind | 2.12.4 |  Dependencia para convertir Objetos Java en Objetos JSON |

</br>

### Descarga de Dependencias

* Repositorio dependencia mysql : https://mvnrepository.com/artifact/mysql/mysql-connector-java/8.0.21
* Repositorio dependencia Javax Annotation API: https://mvnrepository.com/artifact/javax.annotation/javax.annotation-api/1.3.2
* Repositorio dependencia Hibernate-Core: https://search.maven.org/artifact/org.hibernate/hibernate-core/5.4.27.Final/jar
* Repositorio dependencia JPA-Hibernate: https://mvnrepository.com/artifact/org.hibernate.javax.persistence/hibernate-jpa-2.1-api/1.0.2.Final
* Repositorio dependencia Spring data JpaRepository: https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-data-jpa/2.6.1
* Repositorio dependencia javax.xml.bind : https://mvnrepository.com/artifact/javax.xml.bind/jaxb-api
* Repositorio dependencia jackson-databind :  https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind 




<hr>

## ` Documentación y Guía del Proyecto `
#### (Esta Documentación que Desarrollé es para la Creación y Configuración del Proyecto desde Cero, Manejo de Maven, Spring Tool Suite, Spring Booot, Hibernate-JPA, Mysql, Dependencias con Maven, Servidor de Despliegue y otros Usos de este Proyecto. Recomiendo Leerla y Realizar todo paso a paso como se indica en la misma).

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
   
   -[Paso 11) Creación y Configuración de la Clase Controler](#paso-11-creación-y-configuración-de-la-clase-controler) 






#### Sección 7) Apéndice

- [ Anotaciones Usadas para JPA](#anotaciones-usadas-para-jpa)
 
- [ Anotaciones Usadas para Spring](#anotaciones-usadas-para-spring)




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

#### 2.1) Actualización de Java-1.7 a 1.8 (Si seleccionaste una versión Moderna de Spring no es Necesario esto)

* Vamos al pom.xml (el archivo al final de todo)

* Dentro de el tag properties donde dice java.versión cambiar la version del compiler a 1.8, ctrl+s para guardar

* Click Der sobre el Proyecto
	* --> Maven
	* --> Update Proyect
	* --> Fijate que el Proyecto este seleccionado y Boton ok

* Si cambio JavaSE-1.7 a JavaSE-1.8 se efectuo el cambio

</br>

#### 2.2) Paquetes Maven `(Java Resources)`. (Si seleccionaste una versión Moderna de Spring no es Necesario esto)

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

#### 3.1) Dependencia para el conector de Mysql.
* Buscamos la dependencia Mysql Connector (https://mvnrepository.com/artifact/mysql/mysql-connector-java/8.0.21)
* Copias la Dependencia desde Maven o desde acá y la incluis en el pom.xml

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
* ...
* Ctrl + s Guardas 
* Click Der sobre el proyecto
* Maven y update Maven o Alt + F5
* Fijarse dentro de Maven Dependencies si Maven descargo la misma


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
* El tercer, cuarto y quinto método serán listas, ya que los nombres y precios pueden ser repetidos y la ultima nos traera los productos
```java

public abstract List<Producto> findByNombre(String nombre);

public abstract List<Producto> findByPrecio(double precio);

public abstract List<Producto> findAll();


```
* Código Snippet Completo..

```java

package com.api.productos.mypackages.repositories.interfaces;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.productos.mypackages.entities.Producto;


@Repository("I_ProductoRepository")
public interface I_ProductoRepository extends JpaRepository<Producto, Serializable>{



public abstract Producto findById(int id);

public abstract Producto findByCodigo(String codigo);

public abstract ArrayList<Producto> findByNombre(String nombre);

public abstract ArrayList<Producto> findByPrecio(double precio);

public abstract ArrayList<Producto> findAll();



	
	
}


```


</br>

 ### Paso 9) Creación y Configuración de la Clase Converter 
 #### ( Además de implementar el patrón de diseño DAO para el manejo de los datos en la db, se implementa el patrón MVC. En este caso desarrollando una Clase Converter vamos a poder convertir las entidades en modelos, y de esa forma poder trabajar con Hibernate en la Clase Modelo y no en la Clase Entidad )

</br>

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


#### 9.2.1) Creación del Método `convertirListaProducto`
#### (Este Método se va a encargar de convertir una lista de tipo Producto Entidad a otra de Tipo Producto Modelo)

</br>

* El Método es de tipo Lista, se le pasa una Lista de Productos de tipo Producto Entidad y nos devuelve una Lista de Tipo Modelo Producto.
* Pero para realizar tal conversión se usará un for each, el for each va a convertir todos los objetos de la lista Entidad a una lista de objetos de la clase Modelo.
* Código Snippet..

```java
	public ArrayList<ModeloProducto> convertirListaProducto(ArrayList<Producto> productos){
		
		ArrayList<ModeloProducto> listaModeloProductos = new ArrayList<>();
	
		
		productos.forEach(objetoProducto -> listaModeloProductos.add(new ModeloProducto(objetoProducto)));
		
		return listaModeloProductos;
	
	}

```

</br>


* Código Completo de la Clase..

```java 
package com.api.productos.mypackages.converters;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.api.productos.mypackages.entities.Producto;
import com.api.productos.mypackages.models.ProductoModel;

@Component("ProductoConverter")
public class ProductoConverter {
	
	
	
	
	public ArrayList<ModeloProducto> convertirListaProducto(ArrayList<Producto> productos){
		
		ArrayList<ModeloProducto> listaModeloProductos = new ArrayList<>();
	
		
		productos.forEach(objetoProducto -> listaModeloProductos.add(new ModeloProducto(objetoProducto)));
		
		return listaModeloProductos;
	
	}
	
	
	

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

#### 10.3.3) Creación del Método `listaProductos`
* Este Método nos va a traer uno o varios Producto/s como lista de productos del ModeloProducto y NO de la Entidad Producto
* Para poder realizar esto llamamos al `Convertidor`
* ATENTI a esto, la lista devuelta por el método sera del Modelo y No de la Entidad
* Vamos a invocar al Método que convierte la lista Entidad a Modelo de Productos a traves del convertidor
* Dentro del Convertidor vamos a implementar el metodo `findAll()` invocandolo cno la interfaz.
* Notar que se puede crear otro método en la interfaz con otro nombre que haga exactamente lo mismo que el método save de jpa, queda a criterio de cada uno.
* Vamos a devolver un return con la lista de Productos.

				
```java

	//LISTA DE PRODUCTOS
	public ArrayList<ModeloProducto> listaProductos(){
		
		return productoConvertidor.convertirListaProducto(iProductoRepository.findAll()); 
		
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
	public ArrayList<ModeloProducto> listaProductos(){
		
		return productoConvertidor.convertirListaProducto(iProductoRepository.findAll()); 
		
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
	public ArrayList<ModeloProducto> findByNombre(String nombre){
		
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
	public ArrayList<ModeloProducto> findByPrecio(double precio){
		
		return productoConvertidor.convertirListaProducto(iProductoRepository.findByPrecio(precio)); 
		
	}
				
```
* Código Completo Métodos de Uso..

```java


	//================ METODOS DE USO =============================
	
	
	//PRODUCTO POR ID | VALOR UNICO
	public ModeloProducto findById(int id) {
		
		return new ModeloProducto(iProductoRepository.findById(id));
		
	}
	
	//PRODUCTO POR CODIGO | VALOR UNICO
	public ModeloProducto findByCodigo(String codigo) {
		
		return new ModeloProducto(iProductoRepository.findByCodigo(codigo));
	}
		
	
	//LISTA DE PRODUCTOS POR NOMBRE
	public ArrayList<ModeloProducto> findByNombre(String nombre){
		
		return productoConvertidor.convertirListaProducto(iProductoRepository.findByNombre(nombre)); 
		
	}
	
	//LISTA DE PRODUCTOS POR PRECIO
	public ArrayList<ModeloProducto> findByPrecio(double precio){
		
		return productoConvertidor.convertirListaProducto(iProductoRepository.findByPrecio(precio)); 
		
	}
	
	
```

</br>

* Código Completo Clase ProductoService..

```java

package com.api.productos.mypackages.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.api.productos.mypackages.converters.ProductoConverter;
import com.api.productos.mypackages.entities.Producto;
import com.api.productos.mypackages.models.ProductoModel;
import com.api.productos.mypackages.repositories.interfaces.I_ProductoRepository;

@Service("ProductoService")
public class ProductoService {
	
	@Autowired
	@Qualifier("I_ProductoRepository")
	private I_ProductoRepository iProductoRepository;

	
	@Autowired
	@Qualifier("ProductoConverter")
	private ProductoConverter productoConvertidor;
	
	
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
	public ArrayList<ModeloProducto> listaProductos(){
		
		return productoConvertidor.convertirListaProducto(iProductoRepository.findAll()); 
		
	}
	
	//================ METODOS DE USO =============================
	
	
	//PRODUCTO POR ID | VALOR UNICO
	public ModeloProducto findById(int id) {
		
		return new ModeloProducto(iProductoRepository.findById(id));
		
	}
	
	//PRODUCTO POR CODIGO | VALOR UNICO
	public ModeloProducto findByCodigo(String codigo) {
		
		return new ModeloProducto(iProductoRepository.findByCodigo(codigo));
	}
		
	
	//LISTA DE PRODUCTOS POR NOMBRE
	public ArrayList<ModeloProducto> findByNombre(String nombre){
		
		return productoConvertidor.convertirListaProducto(iProductoRepository.findByNombre(nombre)); 
		
	}
	
	//LISTA DE PRODUCTOS POR PRECIO
	public ArrayList<ModeloProducto> findByPrecio(double precio){
		
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

#### 11.4.1) Creación del Método `agregarProducto`
* Este Método va a persistir un Producto en la db a través del Service Creado.
* El Método va a tener la anotación `@PostMapping("ruta")`, este tipo de anotación será una propiedad de petición http.
* La Petición POST coloca un archivo en un URI(dirección completa) especifico. Si hay un archivo o recurso en ese URI, POST reempleaza ese archivo o recurso. Si no hay ningún archivo o recurso, POST crea uno. A difeerncia del Método PUT, los datos no se muestran en el caché ni tampoco en el historial de navegación.
* Dentro del argumento del método agregaremos las anotaciones `@RequestBody` y `@Validated`. La Primera nos permite recuperar el cuerpo de la solicitud y la segunda ejecuta validaciones para los métodos de una clase. 
* El Método devuelve un booleano, si hace lo requerido devuelve true, sino false.
* Vamos a usar el Service inyectado en este Controller.
* Dentro del Método, utilizando el Service creado vamos a invocar al método `agregarProducto()` creado en el mismo Service, junto con la lógica de persistencia para persistir el producto en la db.
* Códido Snippet..

```java
	//METODO POST
	@PostMapping("/productos")
	public boolean agregarProducto(@RequestBody @Validated Producto producto) {
		return productoService.agregarProducto(producto);
	}

```



</br>

#### 11.4.2) Creación del Método `editarProducto`
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
	@PutMapping("/productos")
	public boolean editarProducto(@RequestBody @Validated Producto producto) {
		return productoService.editarProducto(producto);
		
	}

```



</br>

#### 11.4.3) Creación del Método `eliminarProducto`
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
	@DeleteMapping("/productos/{id}")
	public boolean eliminarProducto(@PathVariable("id") int id) {
		return productoService.eliminarProducto(id);
			
		}
```





</br>

* Código Completo..
```java
package com.api.productos.mypackages.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.productos.mypackages.entities.Producto;
import com.api.productos.mypackages.service.ProductoService;

@RestController
@RequestMapping("/v1")
public class ProductoController {
	
	//INYECCION DEL SERVICE
	@Autowired
	@Qualifier("ProductoService")
	ProductoService productoService;
	
	
	//--MÉTODOS HTTP--
	
	//METODO POST
	@PostMapping("/productos")
	public boolean agregarProducto(@RequestBody @Validated Producto producto) {
		return productoService.agregarProducto(producto);
	}
	
	//MÉTODO PUT
	@PutMapping("/productos")
	public boolean editarProducto(@RequestBody @Validated Producto producto) {
		return productoService.editarProducto(producto);
		
	}
	
	//MÉTODO DELETE
	@DeleteMapping("/productos/{id}")
	public boolean eliminarProducto(@PathVariable("id") int id) {
		return productoService.eliminarProducto(id);
			
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
* El Primer Método será el de `agregarProducto`, dentro de Postman en el recuadro de la aplicación seleccionamos el Método POST y colocamos la URL `http://localhost:8092/v1/productos`
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
* El Segundo Método será el de `editarProducto`, dentro de Postman en el recuadro de la aplicación seleccionamos el Método PUT y colocamos la URL `http://localhost:8092/v1/productos`
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
* El Tewrcer Método será el de `eliminarProducto`, dentro de Postman en el recuadro de la aplicación seleccionamos el Método DELETE y colocamos la URL `http://localhost:8092/v1/productos/idDelProductoAeliminar`. Si queremos eliminar el producto con el id 1 la URI completa sería `http://localhost:8092/v1/productos/1`
* La Eliminación del Producto no posee cuerpo Json.
* Click en Send y verificamos la respuesta(true si se agrego el registro, false no se agrego)
* Comprobar la tabla producto de la db a través de phpMyAdmin y verificar el proceso a través de la terminal de Spring Tool.











</br>



## Sección 7) Apéndice


</br>


 ### Anotaciones Usadas para JPA
 
| **Tipo de Anotación** | **Finalidad** |               
| ------------- | ------------- |
| @Table(name="nombreTabla") | Definición de Nombre de Tabla SQL. |
| @Column(name="nombreCampo") | Definición de Nombre de Campo SQL. |
| @Entity | Definición de Entidad, para que la misma pueda ser mapeada a una Tabla SQL. |
| @Id | Definición de Campo tipo identificador entero SQL. |



</br>


 ### Anotaciones Usadas para Spring
 
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


