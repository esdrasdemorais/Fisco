package com.esdrasmorais.printer;

public interface IPrinter {
	public void xReading();
	public void zReading();
	public void setWorker(String name);
	public void openCoupon(String cpf, String name, String address);
	public void saleItemRound(
		Long code, String description, Unity unity, 
	);
	public boolean finishCoupon();
}