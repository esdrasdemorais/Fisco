
package com.esdrasmorais.cashflow.infrastructure;

public interface IUserRepository {
    public List<User> getUserByEmail(final String email);
}
