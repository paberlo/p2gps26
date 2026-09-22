package es.uclm.gps.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {
    private final PiezaRepository repo;
    public DataInitializer(PiezaRepository repo) { this.repo = repo; }

    @Override
    public void run(String... args) {
        if (repo.count() == 0) {
            repo.save(new Pieza("Bujia", 4.50));
            repo.save(new Pieza("Filtro de aceite", 9.90));
            repo.save(new Pieza("Pastillas de freno", 24.00));
        }
    }
}