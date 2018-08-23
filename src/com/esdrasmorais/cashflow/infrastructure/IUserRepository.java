
package com.esdrasmorais.cashflow.infrastructure;

import java.util.List;

import com.esdrasmorais.cashflow.domain.model.User;

public interface IUserRepository {
	public List<User> getUserByEmail(final String email);
}
