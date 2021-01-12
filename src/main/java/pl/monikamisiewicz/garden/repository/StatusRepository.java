package pl.monikamisiewicz.garden.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.monikamisiewicz.garden.model.Status;

public interface StatusRepository extends JpaRepository<Status, Long> {
}
