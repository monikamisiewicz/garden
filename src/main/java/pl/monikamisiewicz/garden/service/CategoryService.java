package pl.monikamisiewicz.garden.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.monikamisiewicz.garden.model.Category;
import pl.monikamisiewicz.garden.repository.CategoryRespository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRespository categoryRespository;

    public List<Category> getCategories() {
        return categoryRespository.findAll();
    }

    public void save(Category category) {
        categoryRespository.save(category);
    }

    public Optional<Category> findById(long id) {
        return categoryRespository.findById(id);
    }

    public void delete(Long id) {
        categoryRespository.deleteById(id);
    }
}
