package pl.monikamisiewicz.garden.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.monikamisiewicz.garden.model.Category;

public interface CategoryRespository extends JpaRepository<Category, Long> {
}
