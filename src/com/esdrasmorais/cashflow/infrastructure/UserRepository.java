
package com.esdrasmorais.cashflow.infrastructure;

import java.util.List;
import com.esdrasmorais.cashflow.domain.model.User;
import com.esdrasmorais.util.repository.IRepository;
import com.esdrasmorais.util.repository.Repository;

public class UserRepository extends Repository<User> implements IUserRepository {
	public List<User> getUserByEmail(String email) {
		Object[] params = new Object[1];
		params[0] = email;
		return find("select u from User u where u.email ?1", params);
	}
}
