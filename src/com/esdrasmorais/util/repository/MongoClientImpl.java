
package com.esdrasmorais.util.repository;

import com.esdrasmorais.util.repository.interfaces.IClient;
import com.esdrasmorais.util.repository.interfaces.IDb;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class MongoClientImpl extends Client {
	private MongoClient mongoClient;
	
	private void setMongoClient() {
		this.mongoClient = new MongoClient(this.getHost(), this.getPort());
	}
	
	public MongoClientImpl(String host, Integer port) {
		super(host, port);
		this.setMongoClient();
	}

	@Override
	public IDb getDB(String database) {
		MongoDatabase mongoDataBase = this.mongoClient.getDatabase(database);
		IDb idb = new MongoDb();
		idb.setDb(this.mongoClient);
		
		return idb;
	}
}
