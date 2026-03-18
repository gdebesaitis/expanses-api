package br.com.debesaitis.expenses_api.services;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.debesaitis.expenses_api.domain.ShoppingList;
import br.com.debesaitis.expenses_api.repositories.ShoppingListRepository;
import br.com.debesaitis.expenses_api.services.exceptions.ResourceNotFoundException;

@Service
public class ShoppingListService {
  
  @Autowired
  private ShoppingListRepository repository;

  public List<ShoppingList> findAll(){
    return repository.findAll();
  }

  public ShoppingList findById(Long id){
    Optional<ShoppingList> obj = repository.findById(id);
    return obj.orElseThrow(() -> new ResourceNotFoundException(id));
  }

  public ShoppingList insert(ShoppingList obj){
    return repository.save(obj);
  }

  public void delete(Long id){
    repository.deleteById(id);
  }

  public ShoppingList update(Long id, ShoppingList obj){
    ShoppingList entity = repository.getReferenceById(id);
    updateData(entity, obj);
    return repository.save(entity);
  }

  private void updateData(ShoppingList entity, ShoppingList obj){
    entity.setDate(Instant.now());
    entity.setUser(obj.getUser());
    entity.setMarket(obj.getMarket());
    entity.setItems(obj.getItems());
  }
}
