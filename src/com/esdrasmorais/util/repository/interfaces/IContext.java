
package com.esdrasmorais.util.repository.interfaces;

import java.net.UnknownHostException;
import com.esdrasmorais.util.repository.Context;

public interface IContext {
	public void init(IContext context) throws UnknownHostException;

	public IContext get();

	public IContext connect(String name);
}
