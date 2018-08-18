
package com.esdrasmorais.util.repository;

import java.util.List;

public class HibernateRepository extends RepositoryImpl {
    public HibernateRepository(Context context, IClient client, IDb db) {
		super(context, client, db);
	}

	@Override
    public /*<T>*/ List<T> find(String query, Object[] params) {

    }
}
