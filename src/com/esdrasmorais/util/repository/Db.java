
package com.esdrasmorais.util.repository;

public abstract class Db implements IDb {
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
