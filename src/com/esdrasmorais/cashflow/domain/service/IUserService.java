
package com.esdrasmorais.cashflow.domain.service;

import java.util.List;

import com.esdrasmorais.cashflow.domain.model.User;
import com.esdrasmorais.util.service.IService;

public interface IUserService extends IService<User> {
	public List<User> findByEmail(String email);
}