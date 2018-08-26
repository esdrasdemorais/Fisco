
package com.esdrasmorais.util.repository.interfaces;

public interface IClient {
	public void setHost(String host);

	public void setPort(Integer port);

	public IDb getDB(String name);
}
