
package com.esdrasmorais.cashflow.application;

import java.util.List;

import com.esdrasmorais.cashflow.domain.model.User;
import com.esdrasmorais.cashflow.domain.service.IUserService;
import com.esdrasmorais.util.application.Application;

public class UserApplication extends Application<User> implements IUserApplication {
	private final IUserService _userService;

	public UserApplication(IUserService userService) {
		super(userService);
		this._userService = userService;
	}

	public List<User> findByEmail(String email) {
		return this._userService.findByEmail(email);
		// return _userService.obterUsersEspeciais(_userService.findAll());
	}
}