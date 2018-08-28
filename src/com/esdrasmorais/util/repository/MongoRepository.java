
package com.esdrasmorais.util.repository;

import com.mongodb.DBCursor;
import com.mongodb.Function;
import com.mongodb.DBCollection;

import java.net.UnknownHostException;
import java.util.List;

import com.esdrasmorais.util.repository.interfaces.IClient;
import com.esdrasmorais.util.repository.interfaces.IContext;
import com.esdrasmorais.util.repository.interfaces.IDb;
import com.mongodb.BasicDBObject;

public class MongoRepository<T> extends RepositoryImpl<T> {
	public MongoRepository(IContext context, IClient client, IDb db) {
		super(context, client, db);
	}

	@Override
	public <T> List<T> find(String query, Object[] params) {
		DBCursor result = this.get().connect("fisco").findByKey(
				"Employee", "age", 32, (value) -> new Integer(value));
		while (result.hasNext()) {
			System.out.println(result.next());
		}
	}

	public <T, X> DBCursor findByKey(String collectionName, String key, 
		T value, Function<T, X> convertDataType
	) {
		DBCollection collection = this.db.getCollection(collectionName);
		BasicDBObject searchQuery = new BasicDBObject();
		searchQuery.put(key, convertDataType.apply(value));
		DBCursor cursor = collection.find(searchQuery);
		return cursor;
	}

	@Override
	public IContext get() {
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
	public void init(IContext context) throws UnknownHostException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<T> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}
}
