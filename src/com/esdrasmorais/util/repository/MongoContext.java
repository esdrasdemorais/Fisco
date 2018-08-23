
package com.esdrasmorais.util.repository;

public class MongoContext extends Context {
	public MongoContext(IContext context, IClient client, IDb db) {
		if (context == null)
			this.context = new MongoContext(null, new MongoClient("localhost", 27017), new MongoDb());
	}
}
