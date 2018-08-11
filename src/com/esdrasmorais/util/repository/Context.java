
package com.esdrasmorais.util.repository;

public abstract class Context implements IContext {
    private IClient client;
    private IDb db;
    private static IContext context = null;

    public Context(IContext context, IClient client, IDb db) {
        if (context != null)
            this.context = context;
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

    public static Context get() {
        return this.context;
    }

    public Context connect(String name) {
        if (this.db == null)
            this.db = Db.setDb(IClient client);
        return this.context;
    }
}
