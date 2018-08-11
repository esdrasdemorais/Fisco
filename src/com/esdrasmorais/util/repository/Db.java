
package com.esdrasmorais.util.repository;

public abstract class Db implements IDb {
    private static IDb db = null;

    public static IDb setDb(IClient client) {
        if (db == null)
            this.db = client.getDB(name);
        return this.db;
    }

    public IDb getDb() {
        return this.db;
    }
}
