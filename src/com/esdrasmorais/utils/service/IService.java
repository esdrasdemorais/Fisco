
package com.esdrasmorais.utils.service;

public interface IService<T> {
     public T findAll();
     public T findById(Long id);
     public List<T> find(String query, Object[] params);
     public boolean save(T object);
     public boolean remove(T object);
     public void dispose();
}
