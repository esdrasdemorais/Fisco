
package com.esdrasmorais.util.repository;

import com.esdrasmorais.util.repository.interfaces.IClient;
import com.esdrasmorais.util.repository.interfaces.IDb;

public abstract class DbImpl implements IDb {
	private static IDb db = null;

	public static IDb setDb(IClient client, String name) {
		if (db == null)
			db = client.getDB(name);
		return db;
	}

	public IDb getDb() {
		return db;
	}
}
