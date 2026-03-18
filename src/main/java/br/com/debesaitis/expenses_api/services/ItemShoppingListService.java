package br.com.debesaitis.expenses_api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.debesaitis.expenses_api.domain.ItemShoppingList;
import br.com.debesaitis.expenses_api.repositories.ItemShoppingListRepository;
import br.com.debesaitis.expenses_api.services.exceptions.ResourceNotFoundException;

@Service
public class ItemShoppingListService {
  
  @Autowired
  private ItemShoppingListRepository repository;

  public List<ItemShoppingList> findAll(){
    return repository.findAll();
  }

  public ItemShoppingList findById(Long id){
    Optional<ItemShoppingList> obj = repository.findById(id);
    return obj.orElseThrow(() -> new ResourceNotFoundException(id));
  }

  public ItemShoppingList insert(ItemShoppingList obj){
    return repository.save(obj);
  }

  public void delete(Long id){
    repository.deleteById(id);
  }

  public ItemShoppingList update(Long id, ItemShoppingList obj){
    ItemShoppingList entity = repository.getReferenceById(id);
    updateData(entity, obj);
    return repository.save(entity);
  }

  private void updateData(ItemShoppingList entity, ItemShoppingList obj){
    entity.setAmount(obj.getAmount());
    entity.setProduct(obj.getProduct());
    entity.setShoppingList(obj.getShoppingList());
  }
}
