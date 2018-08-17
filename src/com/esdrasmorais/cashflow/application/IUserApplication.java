
package com.esdrasmorais.cashflow.application;

import com.esdrasmorais.util.application.IApplication;

import java.util.List;

import com.esdrasmorais.cashflow.domain.model.User;

public interface IUserApplication extends IApplication<User> {
	List<User> findByEmail(String email);
}