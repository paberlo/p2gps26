package es.uclm.gps.demo;
 
import org.springframework.data.jpa.repository.JpaRepository;
 
// Spring genera solo la implementacion (findAll, save, count...).
public interface PiezaRepository extends JpaRepository<Pieza, Long> { }
