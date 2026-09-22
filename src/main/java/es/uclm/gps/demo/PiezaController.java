package es.uclm.gps.demo;
 
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class PiezaController {
    private final PiezaRepository repo;
    public PiezaController(PiezaRepository repo) { this.repo = repo; }
 
    // Nuevo endpoint: devuelve las piezas leidas de la base de datos.
    @GetMapping("/api/piezas")
    public List<Pieza> piezas() { return repo.findAll(); }
}
