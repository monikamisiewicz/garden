package pl.monikamisiewicz.garden.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.monikamisiewicz.garden.models.Plant;

public interface PlantRepository extends JpaRepository<Plant, Long> {
}
