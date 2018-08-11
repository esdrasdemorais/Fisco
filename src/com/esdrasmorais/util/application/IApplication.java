
package com.esdrasmorais.util.application;

public interface IApplication<T> {
	public List<T> findAll();
	public T findById(Long id);
	public List<T> find(String query, Object[] params);
	public boolean save(T object);
	public boolean remove(T object);
	public void dispose();
}