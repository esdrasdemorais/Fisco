
package com.esdrasmorais.util.repository;

import java.net.UnknownHostException;

import com.esdrasmorais.util.repository.interfaces.IContext;
import com.esdrasmorais.util.repository.interfaces.IDb;

public class MongoContext extends Context {
	public MongoContext(IContext context, IClient client, IDb db) {
		super(context, client, db);
		if (context == null)
			this.context = new MongoContext(
					null, 
					new MongoClient("localhost", 27017), 
					new MongoDb()
			);
	}

	@Override
	public void init(IContext context) throws UnknownHostException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IContext get() {
		// TODO Auto-generated method stub
		return null;
	}
}
