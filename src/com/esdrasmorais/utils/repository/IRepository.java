
package com.esdrasmorais.utils;

import java.util.List;

public interface IRepository<T> {
    public T findAll();
    public T findById(Long id);
    public List<T> find(String query, Object[] params);
    public boolean save(T object);
    public boolean remove(T object);
    public void dispose();
}
