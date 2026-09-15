package es.uclm.gps.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Test de integracion basico: comprueba que el contexto de Spring
 * arranca correctamente (todas las piezas se ensamblan sin errores).
 */
@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        // Si el contexto no arrancara, este test fallaria y la CI se pondria en rojo.
    }
}
