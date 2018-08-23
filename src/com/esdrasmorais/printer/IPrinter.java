package com.esdrasmorais.printer;

import com.esdrasmorais.cashflow.domain.model.PaymentMethod;
import com.esdrasmorais.cashflow.domain.model.Unity;

public interface IPrinter {
	public void xReading();

	public void zReading();

	public void setWorker(String name);

	public void openCoupon(String cpf, String name, String address);

	public void saleItemRound(Long code, String description, Unity unity, 
		FractionalQuantity fractionalQuantity, UnitaryValue unitaryValue, 
		Unitary unitary, String Addition, String Discount, boolean toRound);

	public void commitPaymentMethod(PaymentMethod paymentMethod, Float value);

	public Boolean finishClosureCoupon(String message);

	public void cancelCoupon();

	public void saleItemRound(Long code, String description, Float rate, 
		Unity unity, FractionalQuantity fractionalQuantity,
		UnitaryValue unitaryValue, Unitary unitary, String addition, 
		String discount, boolean toRound);
}