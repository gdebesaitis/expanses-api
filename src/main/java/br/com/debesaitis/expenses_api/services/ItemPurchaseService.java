package br.com.debesaitis.expenses_api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.debesaitis.expenses_api.domain.ItemPurchase;
import br.com.debesaitis.expenses_api.repositories.ItemPurchaseRepository;
import br.com.debesaitis.expenses_api.services.exceptions.ResourceNotFoundException;

@Service
public class ItemPurchaseService {

  @Autowired
  private ItemPurchaseRepository repository;

  public List<ItemPurchase> findAll(){
    return repository.findAll();
  }

  public ItemPurchase findById(Long id){
    Optional<ItemPurchase> obj = repository.findById(id);
    return obj.orElseThrow(() -> new ResourceNotFoundException(id));
  }

  public ItemPurchase insert(ItemPurchase obj){
    return repository.save(obj);
  }

  public void delete(Long id){
    repository.deleteById(id);
  }

  public ItemPurchase update(Long id, ItemPurchase obj){
    ItemPurchase entity = repository.getReferenceById(id);
    updateData(entity, obj);
    return repository.save(entity);
  }

  private void updateData(ItemPurchase entity, ItemPurchase obj){
    entity.setAmount(obj.getAmount());
    entity.setUnitPrice(obj.getUnitPrice());
    entity.setSubTotal(obj.getSubTotal());
    entity.setProduct(obj.getProduct());
    entity.setPurchase(obj.getPurchase());
  }
  
}
