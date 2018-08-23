
package com.esdrasmorais.util.repository;

import java.util.List;

public class Repository<T> implements IRepository<T> {
	private RepositoryImpl repositoryImpl;

	public List<T> find(String query, Object[] params) {
		return repositoryImpl.find(query, params);
	}

	public boolean save(T object) {
		return repositoryImpl.save(object);
	}

	public boolean remove(T object) {
		return repositoryImpl.remove(object);
	}

	@Override
	public List<T> findAll() {
		return null;
	}

	@Override
	public T findById(Long id) {
		return null;
	}

	@Override
	public void dispose() {

	}
}
