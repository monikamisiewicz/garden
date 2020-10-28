package pl.monikamisiewicz.garden.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import pl.monikamisiewicz.garden.models.BloomTime;

public interface BloomTimeRepository extends JpaRepository<BloomTime, Long > {
}
