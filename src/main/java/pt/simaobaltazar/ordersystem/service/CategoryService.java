package pt.simaobaltazar.ordersystem.service;

import pt.simaobaltazar.ordersystem.entities.Category;
import pt.simaobaltazar.ordersystem.repositories.CategoryRepository;
import pt.simaobaltazar.ordersystem.service.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }
}
