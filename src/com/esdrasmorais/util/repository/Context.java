
package com.esdrasmorais.util.repository;

import java.net.UnknownHostException;

public abstract class Context implements IContext {
	private IClient client;
	private IDb db;
	private static IContext context = null;

	public Context(IContext context, IClient client, IDb db) {
		if (context != null)
			Context.context = context;
		if (client != null)
			this.client = client;
		if (db != null)
			this.db = db;
		try {
			this.init();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void init() throws UnknownHostException {
		if (client == null)
			this.client = new Client("localhost", 27017);
	}

	public static IContext getContext() {
		return context;
	}

	public IContext connect(String name) {
		if (this.db == null)
			this.db = Db.setDb(client, name);
		return context;
	}
}