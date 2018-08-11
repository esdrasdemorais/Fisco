
package com.esdrasmorais.util.service;

import java.util.List;

public class Service<T> implements IService<T> {
	
	private static final IRepository<T> _repository;
	
	public Service(IRepository<T> repository) {
		this._repository = repository;
	}
	
	public List<T> findAll() {
		return this._repository.findAll();
	}
	
	public T findById(Long id) {
		return this._repository.findById(id);
	}
	
	public List<T> find(String query, Object[] params) {
		return this._repository.find(query, params);
	}
	
	public boolean save(T object) {
		this._repository.save(object);
	}
	
	public boolean remove(T object) {
		this._repository.remove(object);
	}
	
	public void dispose() {
		this._repository.dispose();
	}
}