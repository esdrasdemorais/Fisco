
package com.esdrasmorais.util.application;

public UserApplication extends Application<User> implements IUserApplication {
	private static final IUserService _userService;
	
	public UserApplication(IUserService userService) {
		super(userService);
		this._userService = userService
	}
	
	public List<User> findByEmail(String email) {
		return this._userService.findByEmail(email);
		//return _userService.obterUsersEspeciais(_userService.findAll());
	}
}