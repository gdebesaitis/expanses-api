package br.com.debesaitis.expenses_api.domain;

import java.io.Serializable;
import java.time.Instant;

public class User implements Serializable  {

  private static final long serialVersionUID = 1L;

  private Long id;
  private String userName;
  private String password;
  private Instant createdAt;

  public User(){

  };

  public User(Long id, String userName, String password, Instant createdAt){
    this.id = id;
    this.userName = userName;
    this.password = password;
    this.createdAt = createdAt;
  }

  public Long getId(){
    return id;
  }

  public void setId(Long id){
    this.id = id;
  }

  public String getUserName(){
    return userName;
  }

  public void setUserName(String userName){
    this.userName = userName;
  }

  public String getPassword(){
    return password;
  }

  public void setPassword(String password){
    this.password = password;
  }
  public Instant getCreatedAt(){
    return createdAt;
  }

  public void setCreatedAt(Instant createdAt){
    this.createdAt = createdAt;
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
    User other = (User) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", createdAt=" + createdAt + "]";
  }

  
}
