package br.com.debesaitis.expenses_api.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
  
  private static final long serialVersionUID = 1L;

  public ResourceNotFoundException(Object id){
    super("Resource not found. Id: " + id);
  }
}
