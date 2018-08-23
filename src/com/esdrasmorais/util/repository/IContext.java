
package com.esdrasmorais.util.repository;

import java.net.UnknownHostException;

public interface IContext {
	public void init() throws UnknownHostException;

	public Context get();

	public Context connect(String name);
}
