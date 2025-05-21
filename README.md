# ParcialElectivaII_2_50-
# API REST - Gestión de Préstamos Biblioteca UPTC

Este proyecto es una API RESTful construida con Spring Boot para la gestión de préstamos de recursos bibliográficos en la Universidad Pedagógica y Tecnológica de Colombia (UPTC). Permite registrar préstamos, consultarlos, eliminarlos y verificar si están vencidos.

## Tecnologías utilizadas

- Java 17
- Spring Boot 3
- Spring Data JPA
- Supabase
- Swagger
- Maven


## Estructura del proyecto
src/main/java/com/example/demo/
├── controller/ --> Controladores REST
│ └── PrestamoController.java
├── logic/ --> Modelo con lógica de negocio
│ └── Prestamo.java
├── repository/ --> Repositorio JPA
│ └── PrestamoRepository.java
├── responses/ --> Manejador de respuestas unificadas
│ └── ResponseHandler.java
├── service/ --> Lógica de servicios
│ └── PrestamoService.java
└── DemoApplication.java --> Clase principal


## Diagrama de clases
![alt text](<diagrama parcial.drawio.png>)

##  Ejecución del proyecto

1. git: https://github.com/leidyPenagos/ParcialElectivaII_2_50-.git
2. Ejecuta el proyecto: 
./mvnw spring-boot:run
3.Accede a la documentación:
📘 Swagger UI: http://localhost:8080/swagger-ui.html


