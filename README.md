# Se crea una api REST 
El siguente codigo se crea un CRUD utilizando JPA y como base de datos H2 con presistencia de datos, se anexa documentación

 ## Ligas para probar el servicio Rest 

[GET] http://localhost:8080/api/clientes
 * Hace una búsqueda en general de los elementos de la tabla clientes
 
[GET] http://localhost:8080/api/clientes/{id}
 * Hace una búsqueda en específico buscando por id del elemento 
 
[DELETE] http://localhost:8080/api/clientes/{id}
 * Borra un recurso de la base de datos solicitando el id.
 
[POST] http://localhost:8080/api/clientes
 * Ejemplo de JSON para hacer la inserción de un nuevo recurso. NOTA no es necesario colocar id ni fecha de creación debido a que esta las genera de manera automática.
  * {
    "nombre": "Elizabeth",
    "apellido": "Jimenez",
    "email": "Elizabeth.Jimenez@bbva.com" }
  
[PUT] http://localhost:8080/api/clientes/{id}
  * Ejemplo de JSON para hacer la modificación del archivo.
   * {
    "nombre": "pereganito",
    "apellido": "sanchez",
    "email": "perenganito.sanchez@gmail.com" }

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#using-boot-devtools)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-jpa-and-spring-data)
* [Spring Web Starter](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

