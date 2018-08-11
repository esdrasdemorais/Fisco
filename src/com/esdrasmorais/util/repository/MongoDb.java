
package com.esdrasmorais.util.repository;

import com.mongodb.DB;
import com.mongodb.DBCollection;

public class MongoDb extends Db {
    public DBCollection getCollection(String collectionName) {
        return this.db.getCollection(collectionName);
    }
}
