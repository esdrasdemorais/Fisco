
package com.esdrasmorais.util.repository;

public abstract class RepositoryImpl extends Context {

    public RepositoryImpl(Context context, IClient client, IDb db) {
        super(context, client, db);
    }

    public abstract <T> List<T> find(String query, Object[] params);

    public abstract boolean save(<T> object);

    public abstract boolean remove(<T> object);
}
