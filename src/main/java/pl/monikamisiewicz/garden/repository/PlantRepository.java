package pl.monikamisiewicz.garden.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.monikamisiewicz.garden.model.Plant;

import java.util.Set;

public interface PlantRepository extends JpaRepository<Plant, Long> {

    @Query("select p from Plant p where p.name like %?1%")
    Set<Plant> findByNameContaining(String name);
}
