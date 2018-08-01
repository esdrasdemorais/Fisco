
package com.esdrasmorais.cashflow.domain.model;

import java.io.Serializable;

public class IdentifiedDomainObject 
        implements Serializable {
    
    private Long id = -1L;

    public IdentifiedDomainObject() {
        super();
    }

    protected Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        if (id <= 0)
            throw new IllegalArgumentException("Codigo Invalido.");
        this.id = id;
    }
}
