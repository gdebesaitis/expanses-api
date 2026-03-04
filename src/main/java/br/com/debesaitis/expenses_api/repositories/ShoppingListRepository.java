package br.com.debesaitis.expenses_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.debesaitis.expenses_api.domain.ShoppingList;

public interface ShoppingListRepository extends JpaRepository<ShoppingList, Long>{
  
}
