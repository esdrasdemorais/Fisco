
package com.esdrasmorais.cashflow.domain.model.interfaces;

import java.util.List;

import com.esdrasmorais.cashflow.domain.model.OrderItem;

public interface ICoupon {
	public void setHeader(String header);

	public void setTitle(String title);

	public void setSeparator(String separator);

	public String getCode();

	public void setFooter(String footer);

	public void setItems(List<OrderItem> items);

	public boolean save(ICoupon coupon);

	public boolean cancel(ICoupon coupon);
}
