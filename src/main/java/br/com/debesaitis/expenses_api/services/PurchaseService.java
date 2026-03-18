package br.com.debesaitis.expenses_api.services;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.debesaitis.expenses_api.domain.Purchase;
import br.com.debesaitis.expenses_api.repositories.PurchaseRepository;
import br.com.debesaitis.expenses_api.services.exceptions.ResourceNotFoundException;

@Service
public class PurchaseService {
  
  @Autowired
  private PurchaseRepository repository;

  public List<Purchase> findAll(){
    return repository.findAll();
  }

  public Purchase findById(Long id){
    Optional<Purchase> obj = repository.findById(id);
    return obj.orElseThrow(() -> new ResourceNotFoundException(id));
  }

  public Purchase insert(Purchase obj){
    return repository.save(obj);
  }

  public void delete(Long id){
    repository.deleteById(id);
  }

  public Purchase update(Long id, Purchase obj){
    Purchase entity = repository.getReferenceById(id);
    updateData(entity, obj);
    return repository.save(entity);
  }

  private void updateData(Purchase entity, Purchase obj){
    entity.setDate(Instant.now());
    entity.setTotalValue(obj.getTotalValue());
    entity.setUser(obj.getUser());
    entity.setMarket(obj.getMarket());
    entity.setItems(obj.getItems());
  }
}
