# Naves espaciales

_Existen caracteristicas comunes a todas las naves espaciales, entre ellas, su velocidad, altura, y potencia. Sin embargo, también existen ciertas naves de carcaterísticas muy especificas, como si tienen tripulación o no, si orbitan la tierra o no, o si tienen combustible. Por esto, se realizó un programa con POO en base a https://moaramore.com/2016/05/14/clasificacion-de-las-naves-espaciales/._

## Frameworks 🚀

_Este proyecto de CRUD tipo inventario se trabajó con el patron MVC, el controlador se desarrolló en el lenguaje de programación Java, y el framework Spring boot, para el modelo 
la de base de datos usando Workbench de MySQL junto a la conexión jdbc, y para la vista, se emplearon Templates html con estilo CSS de bootstrap 4.0._

## Pre-requisitos 📋

Para la correcta ejecución de la aplicación, es necesario:
* **Java**: tener Java instalado.
* **Apache Maven**: tener instalado .
* **Servidor MySQL**: tener instalado el servidor local de MySQL.
* **IDE**: contar con un entorno de desarrollo que permita la ejecución del proyecto (como Eclipse, NetBeans, Spring Tool Suite), o un editor de código fuente como Visual Studio Code.


## Configuración general ⚙️

### Configuración de la base de datos de forma local 📚

La aplicación se encuentra diseñada para ejecutarse de forma local, con lo cual, debe realizarse la respectiva configuración y conexión de la base de datos. Se utilizó una base de datos relacional MySQL para la persistencia de datos. Modificar el archivo **_application.properties_**, que se encuentra en la ruta **_src/reources/application.properties_**.

Los parámetros a modificar son:
```
spring.datasource.url=jdbc:mysql://localhost:3306/naves_espaciales
```
_En donde:_
* **3306**: es el puerto de localhost de la conexión con la base de datos.
* **naves_espaciales**: el nombre de la Base de datos creada con anterioridad en un gestor MySQL

```
spring.datasource.username=root
```
_En donde:_
* **root**: es el nombre de usuario la conexión con la base de datos.

```
spring.datasource.password=password
```
_En donde:_
* **password**: es la contraseña de la conexión con la base de datos.

Una vez modificados estos archivos, se procede a guardar el archivo **_application.properties_**. 

**NOTA:** Es importante destacar que esta configuración se realizó para una base de datos relacional (SQL) usando MySQL Workbench como gestor de la base de datos y su conexión.

### Creación de registros para las tablas 📑

Una vez desplegada la aplicación, se pueden crear registros de prueba para cada uno de las tablas, con el fin de poder probar todas las funciónes del CRUD. Para esto, se utiliza el archivo **_naves_espaciales.sql_**, que se encuentra en la ruta **_codigoMySQLDDatabase/naves_espaciales.sql_**.

Se ejecutan las sentencias INSERT INTO proporcionadas en el archivo, y así se tendran 15 registros, 5 en cada tabla, agilizando la revisión de la aplicación.

![Muestra de sentencias INSERT INTO](https://user-images.githubusercontent.com/93292970/180868392-4bb0d556-52b7-4c5e-be7a-0bcf5f017248.png)
