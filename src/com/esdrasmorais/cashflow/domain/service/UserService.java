package com.esdrasmorais.cashflow.domain.service;

import java.util.List;

import com.esdrasmorais.cashflow.domain.model.User;
import com.esdrasmorais.cashflow.infrastructure.UserRepository;
import com.esdrasmorais.cashflow.infrastructure.IUserRepository;
import com.esdrasmorais.util.repository.interfaces.IRepository;
import com.esdrasmorais.util.service.IService;
import com.esdrasmorais.util.service.Service;

public class UserService extends Service<User> implements IUserService {
	private IRepository _userRepository = null;

	public UserService(IRepository userRepository) {
		super(userRepository);
		this._userRepository = userRepository;
	}

	@Override
	public List<User> findByEmail(String email) {
		return null;
	}
}