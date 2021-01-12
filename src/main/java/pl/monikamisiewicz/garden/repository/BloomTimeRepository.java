package pl.monikamisiewicz.garden.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import pl.monikamisiewicz.garden.model.BloomTime;

public interface BloomTimeRepository extends JpaRepository<BloomTime, Long > {
}
