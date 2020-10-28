package pl.monikamisiewicz.garden.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.monikamisiewicz.garden.models.Category;

public interface CategoryRespository extends JpaRepository<Category, Long> {
}
