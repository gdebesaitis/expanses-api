package br.com.debesaitis.expenses_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.debesaitis.expenses_api.domain.Market;

public interface MarketRepository extends JpaRepository<Market, Long>{
  
}
