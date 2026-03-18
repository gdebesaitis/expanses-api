package br.com.debesaitis.expenses_api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.debesaitis.expenses_api.domain.Product;
import br.com.debesaitis.expenses_api.repositories.ProductRepository;
import br.com.debesaitis.expenses_api.services.exceptions.ResourceNotFoundException;

@Service
public class ProductService {
  
  @Autowired
  private ProductRepository repository;

  public List<Product> findAll(){
    return repository.findAll();
  }

  public Product findById(Long id){
    Optional<Product> obj = repository.findById(id);
    return obj.orElseThrow(() -> new ResourceNotFoundException(id));
  }

  public Product insert(Product obj){
    return repository.save(obj);
  }

  public void delete(Long id){
    repository.deleteById(id);
  }

  public Product update(Long id, Product obj){
    Product entity = repository.getReferenceById(id);
    updateData(entity, obj);
    return repository.save(entity);
  }

  private void updateData(Product entity, Product obj){
    entity.setName(obj.getName());
    entity.setMark(obj.getMark());
    entity.setProductCategory(obj.getProductCategory());
    entity.setUser(obj.getUser());
  }
}
