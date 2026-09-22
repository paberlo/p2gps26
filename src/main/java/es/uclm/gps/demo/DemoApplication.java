package es.uclm.gps.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;



/**
 * Punto de entrada de la aplicacion Spring Boot.
 * Al ejecutar 'java -jar app.jar' se arranca un servidor web embebido (Tomcat)
 * en el puerto 8080 (o el que indique la variable de entorno PORT).
 */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }




}

