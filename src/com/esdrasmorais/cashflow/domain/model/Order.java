
package com.esdrasmorais.cashflow.domain.model;

import java.util.Date;
import java.util.List;

public class Order extends IdentifiedDomainObject {
	private Date date;
	private User user;
	private List<OrderItem> orderItems;
	private Float total;
	private PaymentMethod paymentMethod;
}
