
package com.esdrasmorais.util.repository;

public class JpaRepository extends RepositoryImpl {
    private EntityManagerFactory factory;

    @Override
    public <T> List<T> find(String query, Object[] params) {

    }


}
