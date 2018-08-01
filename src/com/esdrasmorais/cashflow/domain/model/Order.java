
package com.esdrasmorais.cashflow.domain.model;

public class Order extends IdentifiedDomainObject {
    private Date date;
    private User user;
    private List<OrderItem> orderItems;
    private Float total;
    private PaymentMethod paymentMethod;
}
