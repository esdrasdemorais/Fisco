
package com.esdrasmorais.util.service;

public class UserService extends Service<User> implements IUserService {
	private static final _userRepository;
	
	public UserService(IUserRepository userRepository) {
		super(userRepository);
		this._userRepository = userRepository;
	}
}