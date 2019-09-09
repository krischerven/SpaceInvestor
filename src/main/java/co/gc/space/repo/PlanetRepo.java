package co.gc.space.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import co.gc.space.entity.planet.Planet;

public interface PlanetRepo extends JpaRepository<Planet, String> {
}
