package br.com.debesaitis.expenses_api.domain;

import java.io.Serializable;

public class ItemShoppingList implements Serializable {

  private static final long serialVersionUID = 1L;

  private Long id;
  private Double amount;
  private Product product;
  private ShoppingList shoppingList;

  public ItemShoppingList() {

  }

  public ItemShoppingList(Long id, Double amount, Product product, ShoppingList shoppingList) {
    this.id = id;
    this.amount = amount;
    this.product = product;
    this.shoppingList = shoppingList;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public ShoppingList getShoppingList() {
    return shoppingList;
  }

  public void setShoppingList(ShoppingList shoppingList) {
    this.shoppingList = shoppingList;
  }

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
    ItemShoppingList other = (ItemShoppingList) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  } 
  
}
