package pl.monikamisiewicz.garden.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.monikamisiewicz.garden.models.Exposure;

public interface ExposureRepository extends JpaRepository<Exposure, Long> {
}
