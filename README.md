# Naves espaciales

_Existen caracteristicas comunes a todas las naves espaciales, entre ellas, su velocidad, altura, y potencia. Sin embargo, también existen ciertas naves de carcaterísticas muy especificas, como si tienen tripulación o no, si orbitan la tierra o no, o si tienen combustible. Por esto, se realizó un programa con POO en base a https://moaramore.com/2016/05/14/clasificacion-de-las-naves-espaciales/._

## Frameworks 🚀

_Este proyecto de CRUD tipo inventario se trabajó con el patron MVC, el controlador se desarrolló en el lenguaje de programación Java, y el framework Spring boot, para el modelo 
la de base de datos usando Workbench de MySQL junto a la conexión jdbc, y para la vista, se emplearon Templates html con estilo CSS de bootstrap 4.0._

### Pre-requisitos 📋

### Configuración de la base de datos de forma local 📚

La aplicación se encuentra diseñada para ejecutarse de forma local, con lo cual, debe realizarse la respectiva configuración y conexión de la base de datos. Se utilizó una base de datos relacional MySQL para la persistencia de datos. Modificar el archivo **_application.properties_**, que se encuentra en la ruta **_src/reources/application.properties_**

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
