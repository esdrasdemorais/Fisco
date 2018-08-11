
package com.esdrasmorais.util.application;

public interface IUserApplication implements IApplication<User> {
	List<User> findByEmail(String email);
}