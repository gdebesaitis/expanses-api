package br.com.debesaitis.expenses_api.domain;

import java.io.Serializable;

public class Market implements Serializable {

  private static final long serialVersionUID = 1L;

  private Long id;
  private String name;
  private String locate;

  public Market(){

  }

  public Market(Long id, String name, String locate) {
    this.id = id;
    this.name = name;
    this.locate = locate;
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

  public String getLocate() {
    return locate;
  }

  public void setLocate(String locate) {
    this.locate = locate;
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
    Market other = (Market) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Market [id=" + id + ", name=" + name + ", locate=" + locate + "]";
  } 
  
}
