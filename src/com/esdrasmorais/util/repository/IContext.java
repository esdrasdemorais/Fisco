
package com.esdrasmorais.util.repository;

public interface IContext {
    public void init();
    public Context get();
    public Context connect(String name);
}
