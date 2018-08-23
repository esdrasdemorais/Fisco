
package com.esdrasmorais.util.repository;

import java.util.List;

public class HibernateRepository extends RepositoryImpl {
	public HibernateRepository(Context context, IClient client, IDb db) {
		super(context, client, db);
	}

	@Override
	public Context get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Context connect(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> List<T> find(String query, Object[] params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean save(T object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(T object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean save(Object object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object object) {
		// TODO Auto-generated method stub
		return false;
	}
}
