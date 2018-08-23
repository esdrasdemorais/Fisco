
package com.esdrasmorais.util.repository;

public abstract class Client implements IClient {
	private String host;
	private String port;

	public Client(String host, String port) {
		this.host = host;
		this.port = port;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public void setPort(String port) {
		this.port = port;
	}
}
