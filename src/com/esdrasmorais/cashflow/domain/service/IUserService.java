
package com.esdrasmorais.util.service;

public interface IUserService implements IService<User> {
	public User findByEmail(String email);
}
