package br.com.debesaitis.expenses_api.services;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

import br.com.debesaitis.expenses_api.domain.User;
import br.com.debesaitis.expenses_api.repositories.UserRepository;
import br.com.debesaitis.expenses_api.services.exceptions.ResourceNotFoundException;

public class UserService {
  
  private UserRepository repository;

  public List<User> findAll(){
    return repository.findAll();
  }

  public User findById(Long id) {
    Optional<User> obj = repository.findById(id);
    return obj.orElseThrow(() -> new ResourceNotFoundException(id));
  }

  public User insert(User obj){
    return repository.save(obj);
  }

  public void delete(Long id){
    repository.deleteById(id);
  }

  public User update(Long id, User obj){
    User entity = repository.getReferenceById(id);
    updateData(entity, obj);
    return repository.save(entity);
  }

  private void updateData(User entity, User obj){
    entity.setUserName(obj.getUserName());
    entity.setCreatedAt(Instant.now());
  }
}
