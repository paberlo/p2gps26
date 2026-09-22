package es.uclm.gps.demo;
 
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
 
@Entity
public class Pieza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private double precio;
 
    protected Pieza() { }   // requerido por JPA
    public Pieza(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    public Long getId()     { return id; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
}
