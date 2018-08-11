
package com.esdrasmorais.util.application;

public class Application<T> implements IApplication<T> {

	private static final IService<T> _service;
	
	public Application(IService<T> service) {
		this._service = service;
	}
	
	public List<T> findAll() {
		return this._service.findAll();
	}
	
	public T findById(Long id) {
		return this._service.findById(id);
	}
	
	public List<T> find(String query, Object[] params) {
		return this._service.find(query, params);
	}
	
	public boolean save(T object) {
		this._service.save(object);
	}
	
	public boolean remove(T object) {
		this._service.remove(object);
	}
	
	public void dispose() {
		this._service.dispose();
	}
}