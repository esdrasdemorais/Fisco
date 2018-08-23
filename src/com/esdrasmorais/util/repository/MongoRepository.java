
package com.esdrasmorais.util.repository;

import com.mongodb.DBCursor;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;

public class MongoRepository extends RepositoryImpl {
	public MongoRepository(IContext context, IClient client, IDb db) {
		super(context, client, db);
	}

	@Override
	public <T> List<T> find(String query, Object[] params) {
		DBCursor result = this.context.get().connectDb("fisco").findByKey("Employee", "age", 32,
				(value) -> new Integer(value));
		while (result.hasNext()) {
			System.out.println(result.next());
		}
	}

	public <T, X> DBCursor findByKey(String collectionName, String key, T value, Function<T, X> convertDataType) {
		DBCollection collection = this.db.getCollection(collectionName);
		BasicDBObject searchQuery = new BasicDBObject();
		searchQuery.put(key, convertDataType.apply(value));
		DBCursor cursor = collection.find(searchQuery);
		return cursor;
	}
}
