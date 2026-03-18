package br.com.debesaitis.expenses_api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.debesaitis.expenses_api.domain.Market;
import br.com.debesaitis.expenses_api.repositories.MarketRepository;
import br.com.debesaitis.expenses_api.services.exceptions.ResourceNotFoundException;

@Service
public class MarketService {

  @Autowired
  private MarketRepository repository;

  public List<Market> findAll(){
    return repository.findAll();
  }

  public Market findById(Long id){
    Optional<Market> obj = repository.findById(id);
    return obj.orElseThrow(() -> new ResourceNotFoundException(id));
  }

  public Market insert(Market obj){
    return repository.save(obj);
  }

  public void delete(Long id){
    repository.deleteById(id);
  }

  public Market update(Long id, Market obj){
    Market entity = repository.getReferenceById(id);
    updateData(entity, obj);
    return repository.save(entity);
  }

  private void updateData(Market entity, Market obj){
    entity.setLocate(obj.getLocate());
    entity.setName(obj.getName());
  }
}
