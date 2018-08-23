
package com.esdrasmorais.util.repository;

import java.util.List;

public class JpaRepository extends RepositoryImpl {

	public JpaRepository(Context context, IClient client, IDb db) {
		super(context, client, db);
	}
	// private EntityManagerFactory factory;

//    @Override
//    public <T> List<T> find(String query, Object[] params) {
//
//    }

}
