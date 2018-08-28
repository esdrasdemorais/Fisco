
package com.esdrasmorais.util.repository;

import com.esdrasmorais.util.repository.interfaces.IClient;
import com.mongodb.DB;
import com.mongodb.DBCollection;

public class MongoDb extends DbImpl {
	
	public DBCollection getCollection(String collectionName) {
		return this.getDb().getCollection(collectionName);
	}

	@Override
	public void setDb(IClient client) {
		
	}
}
