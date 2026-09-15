# gps-ci-cd — Aplicación de ejemplo (Práctica 2 de GPS)

Aplicación web mínima en **Java 21 + Spring Boot 3**, construida con **Maven**, para
aprender **Integración Continua y Despliegue Continuo (CI/CD)** con **GitHub Actions**
y **Azure App Service**. Sin Docker, sin base de datos.

## Qué hace

- Sirve una página web de catálogo en `/` (`src/main/resources/static/index.html`).
- Expone tres endpoints REST:
  - `GET /api/health` → `{"status":"OK"}`
  - `GET /api/version` → `{"version":"1.0"}`
  - `GET /api/catalogo` → lista de piezas (JSON)
- Incluye tests JUnit (`src/test/java/...`) que la CI ejecuta en cada push.

## Ejecutar en local

Requisitos: JDK 21 (Temurin) y Maven.

```bash
mvn verify              # compila + ejecuta los tests + empaqueta target/app.jar
java -jar target/app.jar
# abre http://localhost:8080
```

## Estructura

```
pom.xml
src/main/java/es/uclm/gps/demo/DemoApplication.java
src/main/java/es/uclm/gps/demo/SaludoController.java
src/main/resources/application.properties
src/main/resources/static/index.html
src/test/java/es/uclm/gps/demo/DemoApplicationTests.java
src/test/java/es/uclm/gps/demo/SaludoControllerTest.java
```

## CI/CD

El pipeline se construye siguiendo los guiones de la práctica:

- **Práctica 2a:** crea `.github/workflows/ci.yml` (build + tests).
- **Práctica 2b:** amplía el workflow con el despliegue a Azure App Service.

> Este repositorio se distribuye como **plantilla**: el alumnado lo copia con
> «Use this template» y añade los workflows guiado por los guiones.
