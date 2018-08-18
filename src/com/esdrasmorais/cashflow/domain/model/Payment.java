
package com.esdrasmorais.cashflow.domain.model;

import java.util.Date;

public class Payment extends IdentifiedDomainObject {
    private Order order;
    private User user;
    private Date commitedAt;
    private Boolean isFinished;
    private Boolean canceled;
}