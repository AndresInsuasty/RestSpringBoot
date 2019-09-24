# RestSpringBoot
# Andres Insuasty | QUILEIA S.A.S. [![Tweet](https://img.shields.io/twitter/url/http/shields.io.svg?style=social&logo=twitter)](https://twitter.com/AndresIns10)


[![License: Commercial](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)


## Descripción


Es una api rest que emula la llamada a base de datos para mostrar por formato JSON un usuario y contraseña pero en forma encriptada con algoritmo MD5
para ser consumido con una aplicación en angularjs y asi lograr una mejor seguridad a nivel de conexión backend y frontend.
Los datos que se muestran en la dirección ``` bash localhost:8082/ ``` son:


``` bash
{
id: 1,
username: "27d2abba75fc7ec93e9c625fe3af8467",
password: "0192023a7bbd73250516f069df18b500"
}
```




## Estructura Interna


la arquitectura interna de la aplicación se logra gracias a Spring Boot Framework teniendo dentro de si:


* _Controllers_ un paquete con controladores para hacer el manejo de las peticiones Rest
* _Model_ un paquete el cual guarda la estructura de un usuario para su login
* _Services_ Se gestiona la información como si hubiera sido consultada en base de datos y se la envía al controlador de manera encriptada como un modelo USER



## Instalación y Uso


### Clone repo


``` bash
# clone the repo
$ git clone https://github.com/AndresInsuasty/RestSpringBoot.git


# go into app's directory
$ cd RestSprintBoot


# Execute maven
$ mvn install
```
