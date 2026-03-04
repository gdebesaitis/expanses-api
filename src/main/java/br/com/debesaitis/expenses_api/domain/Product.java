package br.com.debesaitis.expenses_api.domain;

import java.io.Serializable;

public class Product implements Serializable{
  
  private static final long serialVersionUID = 1L;

  private Long id;
  private String name;
  private String mark;
  private ProductCategory productCategory;
  private User user;

  public Product(){

  }

  public Product(Long id, String name, String mark, ProductCategory productCategory, User user) {
    this.id = id;
    this.name = name;
    this.mark = mark;
    this.productCategory = productCategory;
    this.user = user;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getMark() {
    return mark;
  }

  public void setMark(String mark) {
    this.mark = mark;
  }

  public ProductCategory getProductCategory() {
    return productCategory;
  }

  public void setProductCategory(ProductCategory productCategory) {
    this.productCategory = productCategory;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
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
    Product other = (Product) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  } 
  
}
