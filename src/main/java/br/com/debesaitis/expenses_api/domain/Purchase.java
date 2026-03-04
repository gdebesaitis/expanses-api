package br.com.debesaitis.expenses_api.domain;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

public class Purchase implements Serializable {
  
  private static final long serialVersionUID = 1L;

  private Long id;
  private Instant date;
  private Double totalValue;
  private User user;
  private Market market;
  private Set<ItemPurchase> items = new HashSet<>();

  public Purchase(){

  }

  public Purchase(Long id, Instant date, Double totalValue, User user, Market market) {
    this.id = id;
    this.date = date;
    this.totalValue = totalValue;
    this.user = user;
    this.market = market;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Instant getDate() {
    return date;
  }

  public void setDate(Instant date) {
    this.date = date;
  }

  public Double getTotalValue() {
    return totalValue;
  }

  public void setTotalValue(Double totalValue) {
    this.totalValue = totalValue;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Market getMarket() {
    return market;
  }

  public void setMarket(Market market) {
    this.market = market;
  }

  public Set<ItemPurchase> getItems() {
    return items;
  }

  public void setItems(Set<ItemPurchase> items) {
    this.items = items;
  };  

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Purchase other = (Purchase) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Purchase [id=" + id + ", date=" + date + ", totalValue=" + totalValue + ", user=" + user + ", market="
        + market + "]";
  }
}
