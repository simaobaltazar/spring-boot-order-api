package pt.simaobaltazar.ordersystem.service;

import jakarta.persistence.EntityNotFoundException;
import pt.simaobaltazar.ordersystem.entities.User;
import pt.simaobaltazar.ordersystem.repositories.UserRepository;
import pt.simaobaltazar.ordersystem.service.exceptions.DatabaseException;
import pt.simaobaltazar.ordersystem.service.exceptions.InvalidRequestException;
import pt.simaobaltazar.ordersystem.service.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {

        return repository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = repository.findById(id);
      return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insert(User obj) {
        if (obj.getId() != null) {
            throw new InvalidRequestException("The id must not be sent when creating a user");
        }
        return repository.save(obj);
    }

    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException(id);
        }
        try {
            repository.deleteById(id);
        } catch (DataIntegrityViolationException e) {
            throw new DatabaseException(e.getMessage());
        }
    }

    public User update(Long id, User obj) {
        try {
            User entity = repository.getReferenceById(id);
            updateData(entity, obj);
            return repository.save(entity);
        } catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException(id);
        }
    }

    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }
}
