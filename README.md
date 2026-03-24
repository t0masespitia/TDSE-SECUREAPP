# TDSE-SECUREAPP

## One Paragraph of project description goes here

Este proyecto consiste en el desarrollo de una aplicación web segura utilizando Spring Boot, en la cual se implementa un sistema de autenticación con registro e inicio de sesión de usuarios. Se aplican buenas prácticas de seguridad como el cifrado de contraseñas con BCrypt y la validación de credenciales en el backend. Además, se integra un frontend básico en HTML y JavaScript que se comunica con el backend mediante peticiones HTTP asíncronas (fetch), y se realiza el despliegue en la nube utilizando AWS.

---

## Getting Started

Estas instrucciones te permitirán obtener una copia del proyecto en tu máquina local para propósitos de desarrollo y pruebas. También se incluyen indicaciones básicas para su despliegue en un entorno real.

---

## Prerequisites

Para ejecutar este proyecto necesitas tener instalado:

- Java 17 o superior  
- Maven  
- Git  
- Navegador web  
- (Opcional) Thunder Client o Postman  

---

## Installing

A continuación se muestra el paso a paso para ejecutar el proyecto en local:

Clonar el repositorio:


git clone https://github.com/t0masespitia/TDSE-SECUREAPP.git


Entrar a la carpeta del proyecto:


cd TDSE-SECUREAPP


Compilar el proyecto:


mvn clean install


Ejecutar la aplicación:


mvn spring-boot:run


Verificar que el backend esté funcionando:


http://localhost:8080/api/test/hello


---

## Running the tests

Las pruebas del sistema se realizan mediante peticiones HTTP a los endpoints del backend.

### End-to-End Tests

Estas pruebas verifican el flujo completo del sistema, desde el registro hasta el login.

Ejemplo:

Registro de usuario:


POST /api/auth/register


Login:


POST /api/auth/login


Estas pruebas permiten validar que:

- El usuario se guarda correctamente  
- La contraseña se cifra  
- El login valida correctamente las credenciales  

### Coding Style Tests

Se verifica que el código siga una estructura organizada por capas:

- controller  
- service  
- repository  
- model  
- dto  
- config  

Esto permite mantener un código limpio, modular y fácil de mantener.

---

## Deployment

Para desplegar el sistema en un entorno real:

1. Subir el proyecto a una instancia EC2 (AWS)  
2. Compilar el proyecto:


mvn clean package


3. Ejecutar el archivo .jar:


java -jar target/secure-spring-app-0.0.1-SNAPSHOT.jar


4. Acceder al backend desde el navegador usando la IP pública:


http://IP_PUBLICA:8080/api/test/hello


El frontend puede ser desplegado en Apache y conectado al backend mediante fetch.

---

## Built With

- Spring Boot - Framework backend  
- Maven - Gestión de dependencias  
- H2 Database - Base de datos en memoria  
- Java - Lenguaje principal  
- HTML y JavaScript - Frontend  

---

## Authors

- Tomas Espitia

---
