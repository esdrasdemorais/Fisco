package com.esdrasmorais.cashflow.domain.service;

import com.esdrasmorais.cashflow.domain.model.User;
import com.esdrasmorais.cashflow.infrastructure.UserRepository;
import com.esdrasmorais.cashflow.infrastructure.IUserRepository;
import com.esdrasmorais.util.service.IService;
import com.esdrasmorais.util.service.Service;

public class UserService extends Service<User> implements IUserService {
	private static final IUserRepository _userRepository = null;
	
	public UserService(IUserRepository userRepository) {
		super(userRepository);
		this._userRepository = userRepository;
	}
}