package pl.monikamisiewicz.garden.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.monikamisiewicz.garden.models.Status;

public interface StatusRepository extends JpaRepository<Status, Long> {
}
