package br.com.debesaitis.expenses_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.debesaitis.expenses_api.domain.ItemShoppingList;

public interface ItemShoppingListRepository extends JpaRepository<ItemShoppingList, Long>{
  
}
