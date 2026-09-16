package pt.simaobaltazar.ordersystem.service;

import pt.simaobaltazar.ordersystem.entities.Product;
import pt.simaobaltazar.ordersystem.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pt.simaobaltazar.ordersystem.service.exceptions.ResourceNotFoundException;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }
}
