
package com.esdrasmorais.util.repository;

import com.esdrasmorais.util.repository.interfaces.IClient;

public abstract class Client implements IClient {
	private String database;
	private String host;
	private Integer port;

	public Client(String host, Integer port) {
		this.host = host;
		this.port = port;
	}

	public void setHost(String host) {
		this.host = host;
	}
	
	public String getHost() {
		return this.host;
	}

	public void setPort(Integer port) {
		this.port = port;
	}
	
	public Integer getPort() {
		return this.port;
	}
	
	public void setDatabase(String database) {
		this.database = database;
	}
	
	public String getDatabase() {
		return this.database;
	}
}
