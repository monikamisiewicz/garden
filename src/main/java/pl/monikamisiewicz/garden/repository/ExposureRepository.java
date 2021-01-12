package pl.monikamisiewicz.garden.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.monikamisiewicz.garden.model.Exposure;

public interface ExposureRepository extends JpaRepository<Exposure, Long> {
}
