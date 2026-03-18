package br.com.debesaitis.expenses_api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.debesaitis.expenses_api.domain.ProductCategory;
import br.com.debesaitis.expenses_api.repositories.ProductCategoryRepository;
import br.com.debesaitis.expenses_api.services.exceptions.ResourceNotFoundException;

@Service
public class ProductCategoryService {
  
  @Autowired
  private ProductCategoryRepository repository;

  public List<ProductCategory> findAll(){
    return repository.findAll();
  }

  public ProductCategory findById(Long id){
    Optional<ProductCategory> obj = repository.findById(id);
    return obj.orElseThrow(() -> new ResourceNotFoundException(id));
  }

  public ProductCategory insert(ProductCategory obj){
    return repository.save(obj);
  }

  public void delete(Long id){
    repository.deleteById(id);
  }

  public ProductCategory update(Long id, ProductCategory obj){
    ProductCategory entity = repository.getReferenceById(id);
    updateData(entity, obj);
    return repository.save(entity);
  }

  private void updateData(ProductCategory entity, ProductCategory obj){
    entity.setDescription(obj.getDescription());
  }
}
