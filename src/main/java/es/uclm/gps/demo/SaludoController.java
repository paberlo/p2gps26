package es.uclm.gps.demo;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador REST muy sencillo.
 * Expone unos pocos endpoints que ademas usaremos en los tests automaticos,
 * de modo que la Integracion Continua (CI) compruebe que la logica funciona.
 */
@RestController
public class SaludoController {

    // Cambia este valor cuando quieras ver como el pipeline entrega una version nueva.
    public static final String VERSION = "1.0";

    /** Comprobacion de salud: util para saber si el servicio esta vivo. */
    @GetMapping("/api/health")
    public Map<String, String> health() {
        return Map.of("status", "KKO");
    }

    /** Devuelve la version actual desplegada. */
    @GetMapping("/api/version")
    public Map<String, String> version() {
        return Map.of("version", VERSION);
    }

    /** Catalogo de ejemplo (datos en memoria, sin base de datos). */
    @GetMapping("/api/catalogo")
    public List<Map<String, Object>> catalogo() {
        return List.of(
                Map.of("id", 1, "nombre", "Bujia", "precio", 4.50),
                Map.of("id", 2, "nombre", "Filtro de aceite", "precio", 9.90),
                Map.of("id", 3, "nombre", "Pastillas de freno", "precio", 24.00));
    }
}
